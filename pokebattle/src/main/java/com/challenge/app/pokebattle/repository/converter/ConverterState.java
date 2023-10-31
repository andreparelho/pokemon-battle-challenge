package com.challenge.app.pokebattle.repository.converter;

import com.challenge.app.pokebattle.entity.BattleEntity;
import com.challenge.app.pokebattle.entity.PokemonEntity;
import com.challenge.app.pokebattle.model.PokemonModel;
import org.springframework.stereotype.Component;

@Component
public class ConverterState {

    public PokemonEntity toEntity(PokemonModel pokemonModel){
        PokemonEntity pokemonEntity = new PokemonEntity();
        pokemonEntity.setPokemonId(pokemonModel.getId());
        pokemonEntity.setName(pokemonModel.getName());
        pokemonEntity.setBase_experience(pokemonModel.getBase_experience());
        return pokemonEntity;
    }

    public PokemonModel toModel(PokemonEntity pokemonEntity){
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setId(pokemonEntity.getId());
        pokemonModel.setName(pokemonEntity.getName());
        pokemonModel.setBase_experience(pokemonEntity.getBase_experience());
        return pokemonModel;
    }

    public BattleEntity toBattle(PokemonEntity firstPokemon, PokemonEntity secondPokemon, String winner){
        BattleEntity battle = new BattleEntity();
        battle.setFirstPokemonEntity(firstPokemon);
        battle.setSecondPokemonEntity(secondPokemon);
        battle.setWinner(winner);
        return battle;
    }
}
