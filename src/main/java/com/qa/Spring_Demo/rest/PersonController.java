package com.qa.Spring_Demo.rest;
import java.util.ArrayList;
import java.util.List;

import com.qa.Spring_Demo.domain.Cat;
import com.qa.Spring_Demo.domain.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private List<Person> people = new ArrayList<>();

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.people;
    }
    @PostMapping("/create")
    public Person createPerson(@RequestBody Person newPerson) {
        this.people.add(newPerson);
        return this.people.get(this.people.size() - 1);
    }

    @DeleteMapping("/remove/{id}")
    public Person deletePerson (@PathVariable int id){
        return this.people.remove(id);
    }

    @PatchMapping("/update/{id}")
    public Person updatePerson (@PathVariable int id,
                                @RequestParam (required = false) String name,
                                @RequestParam (required = false) Integer age,
                                @RequestParam (required = false) String role) {
        Person toUpdate = this.people.get(id);

        if (name != null) toUpdate.setName(name);
        if ( age != null) toUpdate.setAge(age);
        if (role != null) toUpdate.setRole(role);

        return toUpdate;

    }


}
