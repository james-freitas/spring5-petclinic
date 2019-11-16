package com.codeonblue.petclinic.model.repositories;

import com.codeonblue.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
