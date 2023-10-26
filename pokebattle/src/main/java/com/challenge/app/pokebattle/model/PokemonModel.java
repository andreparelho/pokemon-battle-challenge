package com.challenge.app.pokebattle.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PokemonModel implements Serializable {
    private long id;
    private String name;
    private Float base_experience;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Float base_experience) {
        this.base_experience = base_experience;
    }
}
