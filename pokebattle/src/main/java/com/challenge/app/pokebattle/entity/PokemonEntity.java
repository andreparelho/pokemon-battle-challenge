package com.challenge.app.pokebattle.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pokemons")
public class PokemonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long pokemonId;
    private String name;
    private Float base_experience;

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

    public float getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(float base_experience) {
        this.base_experience = base_experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PokemonEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPokemonId(), that.getPokemonId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBase_experience(), that.getBase_experience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPokemonId(), getName(), getBase_experience());
    }
}
