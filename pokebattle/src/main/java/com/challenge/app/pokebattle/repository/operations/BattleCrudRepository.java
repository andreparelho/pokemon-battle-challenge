package com.challenge.app.pokebattle.repository.operations;

import com.challenge.app.pokebattle.entity.BattleEntity;
import org.springframework.data.repository.CrudRepository;

public interface BattleCrudRepository extends CrudRepository<BattleEntity,Long>{
}
