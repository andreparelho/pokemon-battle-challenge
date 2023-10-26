package com.challenge.app.pokebattle.repository.operations;

import com.challenge.app.pokebattle.entity.PokemonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PokemonCrudRepository extends CrudRepository<PokemonEntity,Long>{
}
