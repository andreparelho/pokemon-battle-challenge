package com.challenge.app.pokebattle.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "battles")
public class BattleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "first_pokemon_id")
    private PokemonEntity firstPokemonEntity;
    @ManyToOne
    @JoinColumn(name = "second_pokemon_id")
    private PokemonEntity secondPokemonEntity;
    private String winner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PokemonEntity getFirstPokemonEntity() {
        return firstPokemonEntity;
    }

    public void setFirstPokemonEntity(PokemonEntity firstPokemonEntity) {
        this.firstPokemonEntity = firstPokemonEntity;
    }

    public PokemonEntity getSecondPokemonEntity() {
        return secondPokemonEntity;
    }

    public void setSecondPokemonEntity(PokemonEntity secondPokemonEntity) {
        this.secondPokemonEntity = secondPokemonEntity;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
