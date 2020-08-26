package com.evelym.springvscode.dao;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import com.evelym.springvscode.model.Person;

public interface PersonDao {
  int insertPerson(UUID id, Person person);

  default int insertPerson(Person person) {
    UUID id = UUID.randomUUID();
    return insertPerson(id, person);
  }

  List<Person> selectAllPeople();

  Optional<Person> selectPersonById(UUID id);

  int deletePersonById(UUID id);

  int updatePersonById(UUID id, Person person);
}