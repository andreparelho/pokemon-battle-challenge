package com.challenge.app.pokebattle.repository;

import com.challenge.app.pokebattle.entity.BattleEntity;
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
    public BattleEntity saveBattle(BattleEntity battleEntity) {
        return this.battleCrudRepository.save(battleEntity);
    }

    @Override
    public List<BattleEntity> listBattles() {
        return (List<BattleEntity>) battleCrudRepository.findAll();
    }

    @Override
    public Optional<BattleEntity> listBattleById(Long id) {
        return battleCrudRepository.findById(id);
    }
}
