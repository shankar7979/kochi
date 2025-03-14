package com.coforge.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;
import org.springframework.data.repository.cdi.Eager;

import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private  float salary ;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;

    @OneToMany(cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    private Set<Car> carSet;


}
