package com.airtribe.meditrack.entity;

public class Patient extends Person implements Cloneable {

    public Patient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public Patient clone() {
        return new Patient(this.id, this.name, this.age);
    }

    @Override
    public String getDetails() {
        return "Patient - " + super.getDetails();
    }

    @Override
    public String toString() {
        return getDetails();
    }
}