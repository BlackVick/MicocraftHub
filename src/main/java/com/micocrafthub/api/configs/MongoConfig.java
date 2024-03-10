package com.micocrafthub.api.configs;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    private final String connectionString = "mongodb+srv://micocrafthub:z9Bi9mmP7Lc23dCZ@micocrafthub.dhdoqq5.mongodb.net/?retryWrites=true&w=majority";
    private final String databaseName = "dev";

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(connectionString);
    }

    @Bean
    public SimpleMongoClientDatabaseFactory mongoDbFactory(MongoClient mongoClient) {
        return new SimpleMongoClientDatabaseFactory(mongoClient, databaseName);
    }

    @Bean
    public MongoTemplate mongoTemplate(SimpleMongoClientDatabaseFactory mongoDbFactory) {
        return new MongoTemplate(mongoDbFactory);
    }

}
