package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.Pokemon;
import com.challenge.app.pokebattle.repository.operations.PokemonCrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonRepositoryImpl implements PokemonRepository {
    private final PokemonCrudRepository pokemonCrudRepository;

    public PokemonRepositoryImpl(PokemonCrudRepository pokemonCrudRepository) {
        this.pokemonCrudRepository = pokemonCrudRepository;
    }

    @Override
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonCrudRepository.save(pokemon);
    }
}
