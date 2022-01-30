package com.example.HMRCmock.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    public void addNewPerson(Person person) {
        Optional<Person> personOptional = personRepository.
                findPersonByEmail(person.getEmail());
        if (personOptional.isPresent()){
            throw new IllegalStateException("name taken");
        }
        personRepository.save(person);
    }

    public void deletePerson(Long personId) {
        boolean exists = personRepository.existsById(personId);
        if (!exists){
            throw new IllegalStateException(
                    "Person with id " + personId + " does not exist."
            );
        }
        personRepository.deleteById(personId);
    }

    public void updateStudent(Long personId, String personName, String personEmail){

    }
}
