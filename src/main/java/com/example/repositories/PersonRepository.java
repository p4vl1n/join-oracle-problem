package com.example.repositories;

import com.example.entities.Person;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.ORACLE)
public interface PersonRepository extends CrudRepository<Person, Long> {
    @Join(value = "address", type = Join.Type.LEFT_FETCH, alias = "a")
    Iterable<Person> findAll();

}
