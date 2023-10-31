package com.challenge.app.pokebattle.service;

import com.challenge.app.pokebattle.entity.BattleEntity;
import com.challenge.app.pokebattle.entity.PokemonEntity;
import com.challenge.app.pokebattle.httpClient.apiPokemon.GetPokemonApi;
import com.challenge.app.pokebattle.model.PokemonModel;
import com.challenge.app.pokebattle.repository.BattleRepository;
import com.challenge.app.pokebattle.repository.PokemonRepository;
import com.challenge.app.pokebattle.repository.converter.ConverterState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BattleServiceImpl implements BattleService {
    private final GetPokemonApi getPokemonApi;
    private final BattleRepository battleRepository;
    private final PokemonRepository pokemonRepository;
    private final ConverterState converterState;

    @Autowired
    public BattleServiceImpl(GetPokemonApi getPokemonApi, BattleRepository battleRepository, PokemonRepository pokemonRepository, ConverterState converterState) {
        this.getPokemonApi = getPokemonApi;
        this.battleRepository = battleRepository;
        this.pokemonRepository = pokemonRepository;
        this.converterState = converterState;
    }

    @Override
    public Map<String, String> create() throws Exception {
        Map<String, String> battle = new HashMap<>();

        PokemonModel firstPokemonModel = this.getPokemonApi.getPokemon();
        PokemonModel secondPokemonModel = this.getPokemonApi.getPokemon();

        PokemonEntity firstPokemonEntity = this.converterState.toEntity(firstPokemonModel);
        PokemonEntity secondPokemonEntity = this.converterState.toEntity(secondPokemonModel);

        this.pokemonRepository.savePokemon(firstPokemonEntity);
        this.pokemonRepository.savePokemon(secondPokemonEntity);

        battle.put(firstPokemonModel.getName(), Float.toString(firstPokemonModel.getBase_experience()));
        battle.put(secondPokemonModel.getName(), Float.toString(secondPokemonModel.getBase_experience()));

        String winner = "vencedor";
        String pokemonWinnerName = "";

        if (firstPokemonModel.getBase_experience() > secondPokemonModel.getBase_experience()){
            battle.put(winner, firstPokemonModel.getName());
            pokemonWinnerName = firstPokemonModel.getName();
        } else if (secondPokemonModel.getBase_experience() > firstPokemonModel.getBase_experience()) {
            battle.put(winner, secondPokemonModel.getName());
            pokemonWinnerName = secondPokemonModel.getName();
        } else {
           String draw = "empate";
           String fightPokemons = firstPokemonModel.getName() + ", " + secondPokemonModel.getName();
           battle.put(draw, fightPokemons);
        }

        BattleEntity battleEntity = this.converterState.toBattle(firstPokemonEntity, secondPokemonEntity, pokemonWinnerName);
        this.battleRepository.saveBattle(battleEntity);

        return battle;
    }

    @Override
    public List<BattleEntity> findAllBattles() throws Exception {
        return this.battleRepository.listBattles();
    }

    @Override
    public Optional<BattleEntity> findById(Long id) throws Exception {
        return battleRepository.listBattleById(id);
    }
}
