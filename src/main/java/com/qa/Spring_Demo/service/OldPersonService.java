package com.qa.Spring_Demo.service;

import com.qa.Spring_Demo.domain.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OldPersonService {

        private final List<Person> people = new ArrayList<>();
        public List<Person> getAll() {return this.people;
        }

        public Person createPerson(Person newPerson) {
            this.people.add(newPerson);
            return this.people.get(this.people.size() - 1);
        }

        public ResponseEntity<?> deletePerson ( Integer id){
            if(id == null|| id<0 || id >= this.people.size())
                return new ResponseEntity<>("no Person found" + id, HttpStatus.NOT_FOUND);
            else return ResponseEntity.ok(this.people.remove(id.intValue()));
        }


        public Person updatePerson (int id, String name, Integer age, String role) {
            Person toUpdate = this.people.get(id);

            if (name != null) toUpdate.setName(name);
            if ( age != null) toUpdate.setAge(age);
            if (role != null) toUpdate.setRole(role);

            return toUpdate;

        }



    }
