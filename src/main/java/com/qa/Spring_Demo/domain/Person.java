package com.qa.Spring_Demo.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  //this flags the class as a db entity!!!!!!
public class Person {

    @Id  // flags the PK!!
    @GeneratedValue(strategy = GenerationType.IDENTITY) //makes the id field AUTO_INCREMENT
    private Integer id;
    private String name;
    private int age;
    private String role;

    public Person() {  //Required to have a blank constructor for the db set up to fully work!
        super();
    }

    public Person(Integer id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
