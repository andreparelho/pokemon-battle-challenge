package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.Battle;
import com.challenge.app.pokebattle.repository.operations.BattleCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BattleRepositoryImpl implements BattleRepository {
    private final BattleCrudRepository battleCrudRepository;

    public BattleRepositoryImpl(BattleCrudRepository battleCrudRepository) {
        this.battleCrudRepository = battleCrudRepository;
    }

    @Override
    public Battle saveBattle(Battle battle) {
        return this.battleCrudRepository.save(battle);
    }

    @Override
    public List<Battle> listBattles() {
        return (List<Battle>) battleCrudRepository.findAll();
    }

    @Override
    public Optional<Battle> listBattleById(Long id) {
        return battleCrudRepository.findById(id);
    }
}
