package appointment;

import health.professional.HealthProfessional;

/**
 * Appointment category, including the patient's name, mobile phone, time point, and doctor to see.
 */
public class Appointment {

    // name
    public String name;
    // phone
    public String phone;
    // timing
    public String timeSlot;
    // doctor
    public HealthProfessional doctor;

    //default constructor
    public Appointment() {}

    // Second constructor
    public Appointment(String name, String phone, String timeSlot, HealthProfessional doctor) {
        this.name = name;
        this.phone = phone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // printf
    public void print() {
        String format = "Appointment:【 %-8s || %-11s || %-4s || doctor: %-8s】\n";
        System.out.printf(format,name,phone,timeSlot,doctor.name);
    }
}
