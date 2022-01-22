package com.example.HMRCmock.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class PersonService {
    public List<Person> getPersons(){
        return List.of(
                new Person(3333L,
                        "Will",
                        "Burdett",
                        LocalDate.of(1995, Month.APRIL, 26),
                        30_000,
                        30,
                        10_000,
                        false)
        );
    }
}
