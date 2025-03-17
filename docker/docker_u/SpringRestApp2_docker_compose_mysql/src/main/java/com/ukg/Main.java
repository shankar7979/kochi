package com.ukg;

import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class Main  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Autowired
    CustomerRepository repository;

    @Override
    public void run(String... args) throws Exception {
           Product  product[]=new Product[]{
           Product.builder().pname("book").cost(1200).build(),
           Product.builder().pname("pant").cost(1100).build(),
           Product.builder().pname("shirt").cost(700).build(),
         };

        Set<Product> prdSet=new HashSet<>(Arrays.asList(product));
        Customer customer=Customer.builder().name("amit kumar").ssn("ssn10001").productSet(prdSet).build();

        repository.save(customer);
      repository.findAll().forEach(System.out::println);
    }
}
//{
//    public static void main(String[] args) {
//        SpringApplication.run(Main.class,args);
//
//        //org.hibernate.dialect.MySQLDialect
//
//
//    }
}
