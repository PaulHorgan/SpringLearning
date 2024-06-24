package com.qa.Spring_Demo.domain;

public class Cat {
    private String name;
    private String colour;
    private int lives;
    private String nature;
    private int age;


    public Cat(String name, String colour, int lives, String nature, int age) {
        this.name = name;
        this.colour = colour;
        this.lives = lives;
        this.nature = nature;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [" +
                "name = '" + name + '\'' +
                ", colour = '" + colour + '\'' +
                ", lives = " + lives +
                ", nature = '" + nature + '\'' +
                ", age = " + age +
                ']';
    }
}
