package com.challenge.app.pokebattle.repository.operations;

import com.challenge.app.pokebattle.entity.Battle;
import org.springframework.data.repository.CrudRepository;

public interface BattleCrudRepository extends CrudRepository<Battle,Long>{
}
