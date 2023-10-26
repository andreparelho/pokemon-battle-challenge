package com.challenge.app.pokebattle.controller;

import com.challenge.app.pokebattle.entity.Battle;
import com.challenge.app.pokebattle.service.BattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pokemon")
public class PokemonBattleController {

    private final BattleService battleService;
    @Autowired
    public PokemonBattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping("/create")
    public ResponseEntity<String> createBattle() throws Exception {
        if (this.battleService.create() != null){
            return ResponseEntity.ok("Batalha criada com sucesso. " + this.battleService.create());
        }
        return ResponseEntity.badRequest().body("Erro ao criar a batalha");
    }

    @GetMapping("/find-all-battles")
    public ResponseEntity<List<Battle>> findAllBattles() throws Exception {
        return ResponseEntity.ok(this.battleService.findAllBattles());
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<Optional<Battle>> findById(@RequestBody Long id) throws Exception {
        return ResponseEntity.ok(this.battleService.findById(id));
    }
}
