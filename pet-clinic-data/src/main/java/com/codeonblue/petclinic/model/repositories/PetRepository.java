package com.codeonblue.petclinic.model.repositories;

import com.codeonblue.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
