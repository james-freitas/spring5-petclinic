package com.codeonblue.petclinic.service;

import com.codeonblue.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
