package com.challenge.app.pokebattle.controller;

import com.challenge.app.pokebattle.service.BattleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pokemon")
public class PokemonBattleController {

    private final BattleService battleService;

    public PokemonBattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping("/create")
    public ResponseEntity<String> createBattle(){
        if (this.battleService.makeService() != null){
            return ResponseEntity.ok("Batalha criada com sucesso. " + this.battleService.makeService());
        }
        return ResponseEntity.badRequest().body("Erro ao criar a batalha");
    }
}
