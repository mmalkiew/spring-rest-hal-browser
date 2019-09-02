package com.mmalkiew.example.springresthalbrowser.model;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.core.Relation;

@Relation(value="sample", collectionRelation="samples")
public class Sample {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
