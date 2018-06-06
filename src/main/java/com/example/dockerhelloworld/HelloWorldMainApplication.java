package com.example.dockerhelloworld;

import com.example.dockerhelloworld.postgres.model.Application;
import com.example.dockerhelloworld.postgres.repository.ApplicationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses=Application.class)
@EnableJpaRepositories(basePackageClasses = ApplicationRepository.class)
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
