package com.challenge.app.pokebattle.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Pokemon implements Serializable {
    private int id;
    private String name;
    private double base_experience;

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

    public double getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(double base_experience) {
        this.base_experience = base_experience;
    }
}
