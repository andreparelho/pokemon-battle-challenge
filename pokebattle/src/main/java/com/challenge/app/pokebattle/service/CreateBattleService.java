package com.challenge.app.pokebattle.service;

import com.challenge.app.pokebattle.facade.apiPokemon.GetPokemonApi;
import com.challenge.app.pokebattle.model.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class CreateBattleService implements BattleService {
    private final GetPokemonApi getPokemonApi;

    public CreateBattleService(GetPokemonApi getPokemonApi) {
        this.getPokemonApi = getPokemonApi;
    }

    @Override
    public Pokemon makeService() {
        return getPokemonApi.getPokemon();
    }
}
