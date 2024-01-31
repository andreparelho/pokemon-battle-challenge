package com.challenge.app.pokebattle.entity;

import jakarta.persistence.*;

import java.util.Objects;

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
    @Column
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BattleEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFirstPokemonEntity(), that.getFirstPokemonEntity()) && Objects.equals(getSecondPokemonEntity(), that.getSecondPokemonEntity()) && Objects.equals(getWinner(), that.getWinner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstPokemonEntity(), getSecondPokemonEntity(), getWinner());
    }
}
