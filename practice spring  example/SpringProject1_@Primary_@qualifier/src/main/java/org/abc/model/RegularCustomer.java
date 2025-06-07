package org.abc.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Data
@Component("rcustomer")
@Primary
public class RegularCustomer extends Customer {

    @PostConstruct
    public void init(){
        System.out.println("init called ");
        this.setCustomerId(667767);
        this.setCustomerName("surendra kumar");
        this.setCustomerLocation("new delhi");
    }

    public void getInfo() {
        System.out.println("Regular Customer Data");
        System.out.println("\tId :"+getCustomerId());
        System.out.println("\tName :"+getCustomerName());
        System.out.println("\tLocation :"+getCustomerLocation());
    }
}
