package com.example.dockerhelloworld.postgres.repository;

import com.example.dockerhelloworld.HelloWorldMainApplication;
import com.example.dockerhelloworld.postgres.model.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = {HelloWorldMainApplication.class})
@RunWith(SpringRunner.class)
@ActiveProfiles("postgres")
public class ApplicationRepositoryTest {

    @Autowired
    ApplicationRepository applicationRepository;

    @Test
    public void contextLoads() throws Exception {

    }

    @Test
    public void shouldShowAllData() throws Exception {
        Iterable<Application> all = applicationRepository.findAll();
        all.forEach(application -> {
            System.out.println("*****" + application.getCase_id() + application.getId());
        });
    }

    @Test
    public void shouldCreate() throws Exception {
        applicationRepository.save(new Application("234567",3456789));
    }

}