package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Appointment;
import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    private PatientService patientService;
    private DoctorService doctorService;

    public AppointmentService(PatientService ps, DoctorService ds) {
        this.patientService = ps;
        this.doctorService = ds;
    }

    public void bookAppointment(int patientId, int doctorId) {

        Patient p = patientService.searchPatient(patientId);
        Doctor d = doctorService.getDoctorById(doctorId);

        if (p == null || d == null) {
            System.out.println("Invalid IDs");
            return;
        }

        Appointment a = new Appointment(IdGenerator.generateId(), p, d);
        a.confirm();
        appointments.add(a);

        System.out.println("Appointment booked");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments");
            return;
        }

        appointments.forEach(System.out::println);
    }
}