package com.airtribe.meditrack;

import com.airtribe.meditrack.service.*;
import com.airtribe.meditrack.util.CSVUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService ps = new PatientService();
        DoctorService ds = new DoctorService();
        AppointmentService as = new AppointmentService(ps, ds);
        BillingService bs = new BillingService();

        List<String> fileData = new ArrayList<>();

        while (true) {

            System.out.println("\n1 Add Patient");
            System.out.println("2 View Patients");
            System.out.println("3 Add Doctor");
            System.out.println("4 Book Appointment");
            System.out.println("5 View Appointments");
            System.out.println("6 Generate Bill");
            System.out.println("7 Save Data");
            System.out.println("8 Load Data");
            System.out.println("9 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    ps.addPatient(name, age);
                    fileData.add(name + "," + age);
                }

                case 2 -> ps.viewPatients();

                case 3 -> {
                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    System.out.print("Specialization: ");
                    String spec = sc.next();

                    ds.addDoctor(name, age, spec);
                }

                case 4 -> {
                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();

                    as.bookAppointment(pid, did);
                }

                case 5 -> as.viewAppointments();

                case 6 -> {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    System.out.println(bs.generateBill(amt));
                }

                case 7 -> CSVUtil.save(fileData, "data.csv");

                case 8 -> System.out.println(CSVUtil.load("data.csv"));

                case 9 -> System.exit(0);
            }
        }
    }
}