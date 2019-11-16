package com.codeonblue.petclinic.model.repositories;

import com.codeonblue.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
