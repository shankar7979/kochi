package com.coforge;

import com.coforge.dao.AddressRepository;
import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Address;
import com.coforge.model.Car;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class EmployeeMain  implements  CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
           Car car[]=new Car[]{
           Car.builder().model("maruti").cost(50000).build(),
           Car.builder().model("kia").cost(120000).build(),
           Car.builder().model("i10").cost(100000).build(),
         };

        Set<Car>  carSet=new HashSet<>(Arrays.asList(car));
        Address address=Address.builder().city("delhi").sector("sec12").pin(110092).build();
        Employee employee=Employee.builder().name("ram kumar").salary(20000).carSet(carSet).address(address).build();

        employeeRepository.save(employee);
        employeeRepository.findAll().stream().forEach(System.out::println);
    }
}
