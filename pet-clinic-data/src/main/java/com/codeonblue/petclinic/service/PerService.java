package com.codeonblue.petclinic.service;

import com.codeonblue.petclinic.model.Owner;
import com.codeonblue.petclinic.model.Pet;

import java.util.Set;

public interface PerService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
