package com.challenge.app.pokebattle.repository.operations;

import com.challenge.app.pokebattle.entity.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonCrudRepository extends CrudRepository<Pokemon,Long>{
}
