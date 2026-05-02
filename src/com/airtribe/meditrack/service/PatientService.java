package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class PatientService {

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(String name, int age) {
        int id = IdGenerator.generateId();
        patients.add(new Patient(id, name, age));
        System.out.println("Patient added successfully");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found");
            return;
        }
        patients.forEach(System.out::println);
    }

    public Patient searchPatient(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}