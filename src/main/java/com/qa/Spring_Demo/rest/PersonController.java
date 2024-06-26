package com.qa.Spring_Demo.rest;

import java.util.ArrayList;
import java.util.List;

import com.qa.Spring_Demo.domain.Cat;
import com.qa.Spring_Demo.domain.Person;
import com.qa.Spring_Demo.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class PersonController {
    private PersonService service;

    public PersonController(PersonService service){
        this.service = service;
    }

    private List<Person> people = new ArrayList<>();

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.service.getAll();
    }

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person newPerson) {
        return this.service.createPerson(newPerson);

    }

    @DeleteMapping("/remove/{id}")
    public Person deletePerson(@PathVariable int id) {
        return this.service.deletePerson(id);
    }

    @PatchMapping("/update/{id}")
    public Person updatePerson(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String role) {
        return this.service.updatePerson(id, name, age, role);
    }


}
