package com.challenge.app.pokebattle.service;

import com.challenge.app.pokebattle.entity.BattleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface BattleService {
    Map<String, String> create() throws Exception;
    List<BattleEntity> findAllBattles() throws Exception;
    Optional<BattleEntity> findById(Long id) throws Exception;
}
