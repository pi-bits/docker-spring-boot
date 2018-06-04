package com.example.dockerhelloworld.mongo.repository;

import com.example.dockerhelloworld.HelloWorldMainApplication;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldMainApplication.class)
@ActiveProfiles("mongo")

public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;



    @Test
    public void shouldHaveAtleastOnePerson() throws Exception {
        assertThat(customerRepository.findAll().size(), Matchers.greaterThanOrEqualTo(5));

    }
    @Test
    public void shouldHaveCustomerWithLastName() throws Exception {

        assertThat(customerRepository.findByLastName("naik").size(), Matchers.greaterThanOrEqualTo(2));
    }

    @Test
    public void shouldGetCustomerBetweenAge() throws Exception {
        assertThat(customerRepository.findCustomerByAgeBetweenOrderByAgeAsc(2,30).size(), Matchers.greaterThanOrEqualTo(2));
    }
}