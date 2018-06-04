package com.example.dockerhelloworld.mongo.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.example.dockerhelloworld.mongo")
@Profile("mongo")
public class SpringMongoConfiguration extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.database}")
    private String mongoDB;

    @Value("${spring.data.mongodb.host}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private String mongoPort;

    @Value("${spring.data.mongodb.user}")
    private String mongoUser;

    @Value("${spring.data.mongodb.password}")
    private String mongoPassword;

    @Override
    public MongoClient mongoClient() {
        return null;
    }

    @Override
    protected String getDatabaseName() {
        return mongoDB;
    }

    @Override
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

    @Override
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient("127.0.0.1", 27017), "mycustomers");
    }
}
