package com.challenge.app.pokebattle.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonEntityTest {

    private PokemonEntity pokemonEntity;

    @BeforeEach
    public void init(){
        this.pokemonEntity = new PokemonEntity();
        this.pokemonEntity.setId(1L);
        this.pokemonEntity.setPokemonId(1L);
        this.pokemonEntity.setName("Pikachu");
        this.pokemonEntity.setBase_experience(123);
    }

    @Test
    @DisplayName("This test should return a id when create entity")
    public void testGetId(){
        long expected = 1;
        long actual = this.pokemonEntity.getId();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon id when create entity")
    public void testGetPokemonId(){
        long expected = 1;
        long actual = this.pokemonEntity.getPokemonId();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon name when create entity")
    public void testGetName(){
        String expected = "Pikachu";
        String actual = this.pokemonEntity.getName();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon base experience when create entity")
    public void testGetBaseExperience(){
        Float expected = 123F;
        Float actual = this.pokemonEntity.getBase_experience();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test assert equals entity")
    public void testEqualsAndHashCode(){
        PokemonEntity pokemon = new PokemonEntity();
        pokemon.setId(1L);
        pokemon.setPokemonId(1L);
        pokemon.setName("Pikachu");
        pokemon.setBase_experience(123);
        assertEquals(this.pokemonEntity, pokemon);
    }
    @Test
    @DisplayName("This test assert equals entity")
    public void testNotEqualsAndHashCode(){
        PokemonEntity pokemon = new PokemonEntity();
        pokemon.setId(2L);
        pokemon.setPokemonId(1L);
        pokemon.setName("Pikachu");
        pokemon.setBase_experience(123);
        assertNotEquals(this.pokemonEntity, pokemon);
    }
}
