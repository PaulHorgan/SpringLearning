package com.qa.Spring_Demo.rest;

import com.qa.Spring_Demo.domain.Cat;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication

public class CatController {
    private List<Cat> cats = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hey you guys";

    }

    @PostMapping("/cat/new")
    public Cat createCat(@RequestBody Cat newCat) {
        this.cats.add(newCat);
        return this.cats.get(this.cats.size() - 1);
    }

    @GetMapping("/cat/all")
    public List<Cat> getAll() {
        return this.cats;
    }

    @GetMapping("/cat/{id}")
    public Cat getCat(@PathVariable Integer id) {
        return this.cats.get(id);
    }
}
