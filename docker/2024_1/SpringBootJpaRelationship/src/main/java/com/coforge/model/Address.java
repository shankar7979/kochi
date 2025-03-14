package com.coforge.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
 public class Address {

    @Id
    @GeneratedValue
    private  int id;
    private  String sector ;
    private  String city ;
    private   long pin;

}
