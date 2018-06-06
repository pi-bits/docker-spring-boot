package com.example.dockerhelloworld.postgres.repository;

import com.example.dockerhelloworld.postgres.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {


}
