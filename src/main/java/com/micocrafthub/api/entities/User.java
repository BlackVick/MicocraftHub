package com.micocrafthub.api.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Users")
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;

}
