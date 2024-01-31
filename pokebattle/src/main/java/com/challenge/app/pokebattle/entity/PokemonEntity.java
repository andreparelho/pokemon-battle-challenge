package com.challenge.app.pokebattle.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pokemons")
public class PokemonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "pokemon_id")
    private Long pokemonId;
    @Column
    private String name;
    @Column(name = "base_experience")
    private Float baseExperience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(float baseExperience) {
        this.baseExperience = baseExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PokemonEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPokemonId(), that.getPokemonId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBaseExperience(), that.getBaseExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPokemonId(), getName(), getBaseExperience());
    }
}
