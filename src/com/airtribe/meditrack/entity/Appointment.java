package com.airtribe.meditrack.entity;

public class Appointment extends MedicalEntity {

    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    public Appointment(int id, Patient patient, Doctor doctor) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.status = AppointmentStatus.PENDING;
    }

    public int getId() {
        return id;
    }

    public void confirm() {
        status = AppointmentStatus.CONFIRMED;
    }

    public void cancel() {
        status = AppointmentStatus.CANCELLED;
    }

    @Override
    public String getDetails() {
        return "Appointment ID: " + id +
                ", Patient: " + patient.getName() +
                ", Doctor: " + doctor.getName() +
                ", Status: " + status;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}