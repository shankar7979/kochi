package com.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "user1")
//@PropertySource(value = "user.properties")
public class User {
//    @Value(value = "${user.id}")
    private int id;
//    @Value(value = "${user.name}")
    private String name;
    private String country;
}
