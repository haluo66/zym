package com.hr.springboot5.service;

import com.hr.springboot5.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> findAll();

    public Person find(Integer id);

    public int save(Person p);

    public int update(Person p);

    public int delete(Integer id);
}
