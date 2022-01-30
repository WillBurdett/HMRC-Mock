package com.example.HMRCmock.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class PersonConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository){
        return args -> {
            Person will = new Person(
                    "Will",
                    "Burdett",
                    LocalDate.of(1995, APRIL, 26),
                    "will@gmail.com",
                    92_000,
                    false);
            Person alex = new Person(
                    "Alex",
                    "Smith",
                    LocalDate.of(2004, JANUARY, 13),
                    "alex@aol.com",
                    400_000,
                    false
            );
            repository.saveAll(
                    List.of(will, alex)
            );
        };
    }
}
