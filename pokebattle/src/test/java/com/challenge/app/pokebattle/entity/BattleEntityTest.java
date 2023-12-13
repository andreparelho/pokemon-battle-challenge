package com.challenge.app.pokebattle.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BattleEntityTest {

    private BattleEntity battleEntity;
    private PokemonEntity firstPokemon;
    private PokemonEntity secondPokemon;

    @BeforeEach
    public void init(){
        this.battleEntity = new BattleEntity();
        this.firstPokemon = new PokemonEntity();
        this.secondPokemon = new PokemonEntity();

        this.battleEntity.setId(1L);

        this.firstPokemon.setPokemonId(1L);
        this.firstPokemon.setName("Pikachu");
        this.firstPokemon.setPokemonId(1L);
        this.firstPokemon.setBase_experience(1212);

        this.secondPokemon.setPokemonId(2L);
        this.secondPokemon.setName("Articuno");
        this.secondPokemon.setPokemonId(45L);
        this.secondPokemon.setBase_experience(5000);

        this.battleEntity.setFirstPokemonEntity(this.firstPokemon);
        this.battleEntity.setFirstPokemonEntity(this.secondPokemon);

        this.battleEntity.setWinner(this.secondPokemon.getName());
    }

    @Test
    @DisplayName("This test should return battle id")
    public void testGetId(){
        Long expected = 1L;
        Long actual = this.battleEntity.getId();

        assertNotNull(this.battleEntity);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return firstPokemon not null")
    public void testGetFirstPokemon(){
        PokemonEntity expected = new PokemonEntity();
        expected.setPokemonId(1L);
        expected.setName("Pikachu");
        expected.setPokemonId(1L);
        expected.setBase_experience(1212);

        PokemonEntity actual = this.firstPokemon;

        assertNotNull(this.firstPokemon);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return secondPokemon not null")
    public void testGetSecondPokemon(){
        PokemonEntity expected = new PokemonEntity();
        expected.setPokemonId(2L);
        expected.setName("Articuno");
        expected.setPokemonId(45L);
        expected.setBase_experience(5000);

        PokemonEntity actual = this.secondPokemon;

        assertNotNull(this.secondPokemon);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test should return firstPokemon not null")
    public void testGetWinner(){
        String expected = "Articuno";
        String actual = this.secondPokemon.getName();

        assertNotNull(this.firstPokemon);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This test assert equals entity")
    public void testEqualsAndHashCode(){
        BattleEntity actual = new BattleEntity();
        actual.setId(1L);
        actual.setFirstPokemonEntity(this.firstPokemon);
        actual.setSecondPokemonEntity(this.secondPokemon);
        actual.setWinner(this.secondPokemon.getName());

        assertEquals(this.battleEntity.getWinner(), actual.getWinner());
    }

    @Test
    @DisplayName("This test assert not equals entity")
    public void testNotEqualsAndHashCode(){
        BattleEntity actual = new BattleEntity();
        actual.setId(1L);
        actual.setFirstPokemonEntity(this.secondPokemon);
        actual.setSecondPokemonEntity(this.firstPokemon);
        actual.setWinner(this.firstPokemon.getName());

        BattleEntity expected = this.battleEntity;

        assertNotEquals(expected, actual);
    }


}
