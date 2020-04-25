package com.codeonblue.petclinic.model.repositories;

import com.codeonblue.petclinic.model.Visit;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

// public interface VisitRepository extends Repository<Visit, Integer> {
public interface VisitRepository extends CrudRepository<Visit, Long> {

//    void save(Visit visit) throws DataAccessException;
//
//    List<Visit> findByPetId(Long petId);
//
//    List<Visit> findAll();

}