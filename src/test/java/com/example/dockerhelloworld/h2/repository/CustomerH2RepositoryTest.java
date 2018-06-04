package com.example.dockerhelloworld.h2.repository;

import com.example.dockerhelloworld.HelloWorldMainApplication;
import com.example.dockerhelloworld.h2.repository.model.Customer;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldMainApplication.class)
@ActiveProfiles("h2")
public class CustomerH2RepositoryTest {

    @Autowired
    CustomerH2Repository customerH2Repository;

    @Test
    public void shouldFindByLastName() throws Exception {
        customerH2Repository.save(new Customer("Prashant", "NAIK"));
        assertThat(customerH2Repository.findByLastName("NAIK").size(), Is.is(Matchers.greaterThanOrEqualTo(1)));
    }
}