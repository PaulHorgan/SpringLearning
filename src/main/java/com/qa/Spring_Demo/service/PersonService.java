package com.qa.Spring_Demo.service;

import com.qa.Spring_Demo.domain.Person;
import com.qa.Spring_Demo.repos.PersonRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepo repo;

    public List<Person> getAll() {
        return this.repo.findAll();
    }

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }

    public Person createPerson(Person newPerson) {
        return this.repo.save(newPerson);
    }

    public Person get(int id) {
        return this.repo.findById(id).get();
    }

    public Person deletePerson(Integer id) {
        Person removed = this.get(id);
        this.repo.deleteById(id);
        return removed;
    }

    public Person updatePerson(Integer id, String name, Integer age, String role) {
        Person toUpdate = this.repo.findById(id).get();
        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (role != null) toUpdate.setRole(role);
        return this.repo.save(toUpdate);

    }


}
