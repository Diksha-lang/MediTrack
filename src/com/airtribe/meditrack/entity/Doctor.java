package com.airtribe.meditrack.entity;

public class Doctor extends Person {

    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String getDetails() {
        return "Doctor - " + super.getDetails() + " - " + specialization;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}