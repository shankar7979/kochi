package com;

import com.model.Person;
import com.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main  implements CommandLineRunner {
    public static void main(String[] args)  {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
        User bean = ctx.getBean(User.class);
        System.out.println(bean);

        Person person = ctx.getBean(Person.class);
        System.out.println("person details"+person);
    }

    @Value("${user1.country}")
    String  country;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("country "+country);
    }
}
