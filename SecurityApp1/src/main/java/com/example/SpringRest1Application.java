package com.example;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringRest1Application  implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringRest1Application.class, args);

	}

	@Autowired
	PersonRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Person person[] = new Person[]{

				Person.builder().name("amit kumar").dob(LocalDate.of(1998, 11, 23)).build(),
				Person.builder().name("sumit kumar").dob(LocalDate.of(1991, 2, 24)).build(),
				Person.builder().name("mahesh kumar").dob(LocalDate.of(1996, 12, 2)).build(),
				Person.builder().name("suresh kumar").dob(LocalDate.of(1995, 10, 3)).build(),
				Person.builder().name("veeresh kumar").dob(LocalDate.of(1977, 1, 13)).build(),
		};

		repository.saveAll(Arrays.asList(person));
		Stream.of(person).forEach(System.out::println);

	}
}

/*
{
    "id":77681,
    "name":"hari sharma",
    "salary":56000,
    "dob": "1997-11-20"
}
*/