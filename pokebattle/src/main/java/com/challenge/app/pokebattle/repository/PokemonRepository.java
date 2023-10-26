package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.PokemonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository {
    PokemonEntity savePokemon(PokemonEntity pokemonEntity);
}
