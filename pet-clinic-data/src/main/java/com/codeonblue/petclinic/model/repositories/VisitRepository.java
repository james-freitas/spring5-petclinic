package com.codeonblue.petclinic.model.repositories;

import com.codeonblue.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
