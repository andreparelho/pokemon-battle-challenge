package com.challenge.app.pokebattle.facade.apiPokemon;

import com.challenge.app.pokebattle.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class GetPokemonApi {

    private Pokemon pokemon;
    private final RestTemplate restTemplate;
    private final String url = "https://pokeapi.co/api/v2/pokemon/";
    @Autowired
    public GetPokemonApi(Pokemon pokemon, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() throws Exception {
        int randomId = new Random().nextInt(500);
        this.pokemon = this.restTemplate.getForObject(this.url + randomId, Pokemon.class);

        if (this.pokemon == null){
            throw new Exception("Erro ao fazer a requisição");
        }

        return this.pokemon;
    }
}
