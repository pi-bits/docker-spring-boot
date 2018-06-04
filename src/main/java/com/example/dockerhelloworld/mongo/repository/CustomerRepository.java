package com.example.dockerhelloworld.mongo.repository;

import com.example.dockerhelloworld.mongo.repository.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    @Query("{'age' : {$gt: ?0, $lt: ?1}}")
    public List<Customer> findCustomerByAgeBetweenOrderByAgeAsc(int ageGT, int ageLT);

}
