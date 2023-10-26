package com.challenge.app.pokebattle.httpClient.apiPokemon;

import com.challenge.app.pokebattle.model.PokemonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class GetPokemonApi {

    private PokemonModel pokemonModel;
    private final RestTemplate restTemplate;
    private final String url = "https://pokeapi.co/api/v2/pokemon/";
    @Autowired
    public GetPokemonApi(PokemonModel pokemonModel, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.pokemonModel = pokemonModel;
    }

    public PokemonModel getPokemon() throws Exception {
        int randomId = new Random().nextInt(500);
        this.pokemonModel = this.restTemplate.getForObject(this.url + randomId, PokemonModel.class);

        if (this.pokemonModel == null){
            throw new Exception("Erro ao fazer a requisição");
        }

        return this.pokemonModel;
    }
}
