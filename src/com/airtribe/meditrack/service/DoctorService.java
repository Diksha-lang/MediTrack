package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(String name, int age, String specialization) {
        int id = IdGenerator.generateId();
        doctors.add(new Doctor(id, name, age, specialization));
    }

    public Doctor getDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    public void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found");
            return;
        }
        doctors.forEach(System.out::println);
    }
}