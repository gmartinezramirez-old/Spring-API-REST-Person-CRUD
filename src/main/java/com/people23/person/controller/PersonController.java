package com.people23.person.controller;

import com.people23.person.model.Person;
import com.people23.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gmartinezramirez on 01/03/18.
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/persons/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable(value = "id") Long personId) {
        Person person = personRepository.findOne(personId);
        if(person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(person);
    }

    @PostMapping("/persons")
    public Person createPerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/persons/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable(value = "id") Long personId,
                                           @Valid @RequestBody Person personDetails) {
        Person person = personRepository.findOne(personId);
        if(person == null) {
            return ResponseEntity.notFound().build();
        }
        person.setFirstName(personDetails.getFirstName());
        person.setLastName(personDetails.getLastName());

        Person updatedPerson = personRepository.save(person);
        return ResponseEntity.ok(updatedPerson);
    }

    @DeleteMapping("/persons/{id}")
    public ResponseEntity<Person> deletePerson(@PathVariable(value = "id") Long personId) {
        Person person = personRepository.findOne(personId);
        if(person == null) {
            return ResponseEntity.notFound().build();
        }

        personRepository.delete(person);
        return ResponseEntity.ok().build();
    }
}
