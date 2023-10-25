package com.challenge.app.pokebattle.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pokemon")
public class PokemonBattleController {

    @GetMapping("/create")
    public ResponseEntity<String> createBattle(){
        return ResponseEntity.ok("Batalha criada com sucesso.");
    }
}
