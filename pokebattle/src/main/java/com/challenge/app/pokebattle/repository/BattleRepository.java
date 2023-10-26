package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.Battle;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BattleRepository {
    Battle saveBattle(Battle battle);
    List<Battle> listBattles();
    Optional<Battle> listBattleById(Long id);
}
