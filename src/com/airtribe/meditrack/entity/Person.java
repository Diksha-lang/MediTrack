package com.airtribe.meditrack.entity;

public class Person extends MedicalEntity {

    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getDetails() {
        return id + " - " + name + " - " + age;
    }
}