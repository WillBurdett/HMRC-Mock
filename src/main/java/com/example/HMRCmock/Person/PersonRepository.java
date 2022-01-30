package com.example.HMRCmock.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    // SELECT * FROM student WHERE email = email;
    Optional<Person> findPersonByEmail(String email);
}
