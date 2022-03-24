package com.example.controllers;

import com.example.entities.Person;
import com.example.services.PersonService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import jakarta.inject.Inject;


import java.util.List;
import java.util.Map;

import static io.micronaut.http.HttpResponse.notFound;
import static io.micronaut.http.HttpResponse.ok;

@Controller("/person")
public class PersonController {
    @Inject
    PersonService personService;

    @Get(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<List<Person>> getAll() {
        var body = personService.fetchAllFreebets();
        return ok(body);
    }

}
