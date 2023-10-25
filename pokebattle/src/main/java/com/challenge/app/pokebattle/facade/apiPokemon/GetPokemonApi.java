package com.challenge.app.pokebattle.facade.apiPokemon;

import com.challenge.app.pokebattle.model.Pokemon;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Component
public class GetPokemonApi {

    private Pokemon pokemon;
    private final RestTemplate restTemplate;
    private final String url = "https://pokeapi.co/api/v2/pokemon/";

    public GetPokemonApi(Pokemon pokemon, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon(){
        int randomId = new Random().nextInt(500);
        this.pokemon = this.restTemplate.getForObject(this.url + randomId, Pokemon.class);
        return this.pokemon;
    }
}
