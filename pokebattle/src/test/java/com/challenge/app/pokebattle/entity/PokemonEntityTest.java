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
    }

    @Test
    @DisplayName("This test should return a id when create entity")
    public void testGetId(){
        this.pokemonEntity.setId(1L);
        long expected = 1;
        long actual = this.pokemonEntity.getId();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon id when create entity")
    public void testGetPokemonId(){
        this.pokemonEntity.setPokemonId(1L);
        long expected = 1;
        long actual = this.pokemonEntity.getPokemonId();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon name when create entity")
    public void testGetName(){
        this.pokemonEntity.setName("Pikachu");
        String expected = "Pikachu";
        String actual = this.pokemonEntity.getName();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return a pokemon base experience when create entity")
    public void testGetBaseExperience(){
        this.pokemonEntity.setBase_experience(123);
        Float expected = 123F;
        Float actual = this.pokemonEntity.getBase_experience();

        assertEquals(expected, actual);
    }
}
