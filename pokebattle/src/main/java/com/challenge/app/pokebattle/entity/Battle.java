package com.challenge.app.pokebattle.entity;

import jakarta.persistence.*;

@Entity
public class Battle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "first_pokemon_id")
    private Pokemon firstPokemon;
    @ManyToOne
    @JoinColumn(name = "second_pokemon_id")
    private Pokemon secondPokemon;
    private String winner;

    public Pokemon getSecondPokemon() {
        return secondPokemon;
    }

    public void setSecondPokemon(Pokemon secondPokemon) {
        this.secondPokemon = secondPokemon;
    }

    public Pokemon getFirstPokemon() {
        return firstPokemon;
    }

    public void setFirstPokemon(Pokemon firstPokemon) {
        this.firstPokemon = firstPokemon;
    }
}
