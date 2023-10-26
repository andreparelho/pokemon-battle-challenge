package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.BattleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BattleRepository {
    BattleEntity saveBattle(BattleEntity battleEntity);
    List<BattleEntity> listBattles();
    Optional<BattleEntity> listBattleById(Long id);
}
