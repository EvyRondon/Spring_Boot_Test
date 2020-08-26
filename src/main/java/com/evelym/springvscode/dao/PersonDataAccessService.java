package com.evelym.springvscode.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.evelym.springvscode.model.Person;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

  @Override
  public int insertPerson(UUID id, Person person) {
    return 0;
  }

  @Override
  public List<Person> selectAllPeople() {
    return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
  }

  @Override
  public Optional<Person> selectPersonById(UUID id) {
    return null;
  }

  @Override
  public int deletePersonById(UUID id) {
    return 0;
  }

  @Override
  public int updatePersonById(UUID id, Person person) {
    return 0;
  }

}