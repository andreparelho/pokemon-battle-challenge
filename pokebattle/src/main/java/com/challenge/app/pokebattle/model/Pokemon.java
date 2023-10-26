package com.challenge.app.pokebattle.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Pokemon implements Serializable {
    private int id;
    private String name;
    private String base_experience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }
}
