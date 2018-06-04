package com.example.dockerhelloworld.h2.repository;

import com.example.dockerhelloworld.h2.repository.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerH2Repository extends CrudRepository<Customer, Long> {

    public List<Customer> findByLastName(String lastName);

}
