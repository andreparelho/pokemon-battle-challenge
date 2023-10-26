package com.challenge.app.pokebattle.service;

import com.challenge.app.pokebattle.entity.Battle;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface BattleService {
    Map<String, String> create() throws Exception;
    List<Battle> findAllBattles() throws Exception;
    Optional<Battle> findById(Long id) throws Exception;
}
