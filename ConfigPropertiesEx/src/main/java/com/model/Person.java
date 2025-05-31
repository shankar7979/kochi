package com.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(value = "person.properties")
public class Person {
   @Value(value = "${person.id}")
    private int id;
    @Value(value = "${person.name}")
    private String name;
}
