package com.example.services;

import com.example.entities.Person;
import com.example.repositories.PersonRepository;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class PersonService {
    @Inject
    PersonRepository personRepository;
    public List<Person> fetchAllFreebets() {
        List<Person> actualList = StreamSupport
                .stream(personRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return actualList;
    }
}
