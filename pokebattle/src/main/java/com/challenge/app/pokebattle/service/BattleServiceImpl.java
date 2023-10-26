package com.challenge.app.pokebattle.service;

import com.challenge.app.pokebattle.entity.Battle;
import com.challenge.app.pokebattle.facade.apiPokemon.GetPokemonApi;
import com.challenge.app.pokebattle.model.Pokemon;
import com.challenge.app.pokebattle.repository.BattleRepository;
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

    @Autowired
    public BattleServiceImpl(GetPokemonApi getPokemonApi, BattleRepository battleRepository) {
        this.getPokemonApi = getPokemonApi;
        this.battleRepository = battleRepository;
    }

    @Override
    public Map<String, String> create() throws Exception {
        Map<String, String> battle = new HashMap<>();

        Pokemon firstPokemon = this.getPokemonApi.getPokemon();
        Pokemon secondPokemon = this.getPokemonApi.getPokemon();

        battle.put(firstPokemon.getName(), firstPokemon.getBase_experience());
        battle.put(secondPokemon.getName(), secondPokemon.getBase_experience());

        String winner = "Vencedor: ";

        if (Integer.parseInt(firstPokemon.getBase_experience()) > Integer.parseInt(secondPokemon.getBase_experience())){
            battle.put(winner, firstPokemon.getName());
        } else if (Integer.parseInt(secondPokemon.getBase_experience()) > Integer.parseInt(firstPokemon.getBase_experience())) {
            battle.put(winner, secondPokemon.getName());
        } else {
           String draw = "Empate: ";
           String fightPokemons = firstPokemon.getName() + " " + secondPokemon.getName();
           battle.put(draw, fightPokemons);
        }
        return battle;
    }

    @Override
    public List<Battle> findAllBattles() throws Exception {
        return this.battleRepository.listBattles();
    }

    @Override
    public Optional<Battle> findById(Long id) throws Exception {
        return battleRepository.listBattleById(id);
    }
}
