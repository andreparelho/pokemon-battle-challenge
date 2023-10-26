package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.Pokemon;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository {
    Pokemon savePokemon(Pokemon pokemon);
}
