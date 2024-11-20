import appointment.Appointment;
import health.professional.GeneralPractitioner;
import health.professional.HealthProfessional;
import health.professional.Nurse;

import java.util.ArrayList;
import java.util.List;

/**
 *main function class, containing the main method
 */
public class AssignmentOne {

    public static List<Appointment> appointments = new ArrayList<>();

    // main function
    public static void main(String[] args) {
        // Initializing General Practitioner Wang Fu
        HealthProfessional doctorWang = new GeneralPractitioner(1,
                "WangFu",
                "age:38,gender:man,working-time:08:00~16:00",
                "BeiHai Street");
        // Initializing General Practitioner Zhang Yum
        HealthProfessional doctorZhang = new GeneralPractitioner(2,
                "ZhangYun",
                "age:42,gender:woman,working-time:10:00~17:00",
                "FuRong Street");
        // Initializing General Practitioner GuiShan
        HealthProfessional doctorGui = new GeneralPractitioner(3,
                "GuiShan",
                "age:52,gender:man,working-time:09:00~17:00",
                "DongLai Street");
        // Initialize Nurse Li Fang
        HealthProfessional nurseLi = new Nurse(4,
                "LiFang",
                "age:28,gender:woman,working-time:07:00~17:00",
                "N1");
        // Initialize nurse Dou Jing
        HealthProfessional nurseDou = new Nurse(5,
                "DouJing",
                "age:29,gender:woman,working-time:08:00~18:00",
                "N3");
        // Print information for all healthcare professionals
        doctorWang.print();
        doctorZhang.print();
        doctorGui.print();
        nurseLi.print();
        nurseDou.print();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        // Creating an Appointment 1
        createAppointment("ZhanSan", "13660640001", "08:30", doctorWang);
        // Creating an Appointment 2
        createAppointment("LiSi", "13660640002", "09:30", doctorZhang);
        // Creating an Appointment 3
        createAppointment("WangWu", "13660640003", "10:00", nurseLi);
        // Creating an Appointment 4
        createAppointment("MaLiu", "13660640004", "11:00", nurseDou);
        // Creating an Appointment 5
        printExistingAppointments();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        //
        //Cancel reservation 4
        cancelBooking("13660640004");
        printExistingAppointments();
    }

    /**
     * Cancel an appointment. 4 Create an appointment
     * @param name Patient name
     * @param phone Patient mobile phone
     * @param timeSlot appointment time
     * @param doctor Make an appointment
     * @return true-successful appointment false-Reservation failure
     */
    public static boolean createAppointment(String name, String phone, String timeSlot, HealthProfessional doctor) {
        // Verify that all information is not empty.
        if (name != null && phone != null && timeSlot != null && doctor != null) {
            // new appointment information and returns true as appointments to the static list.
            Appointment appointment = new Appointment(name, phone, timeSlot, doctor);
            appointments.add(appointment);
            return true;
        }
        System.out.println("Failed to create an appointment" + " || " + name + " || " + phone + " || " + timeSlot);
        // Default return failure.
        return false;
    }

    /**
     * Print existing reservation information
     */
    public static void printExistingAppointments() {
        //
        // If the list is empty
        if (appointments.isEmpty()) {
            System.out.println("No reservation information at the moment...");
            return;
        }
        // Call the reservation print function
        for (Appointment appointment : appointments) {
            appointment.print();
        }
    }

    /**
     * Cancel reservation information based on mobile phone number
     * @param phone Patient's mobile phone number
     * @return true- Cancelling succeeded false- cancelling failed
     */
    public static boolean cancelBooking(String phone) {
        for (Appointment appointment : appointments) {
            if (appointment.phone.equals(phone)) {
                appointments.remove(appointment);
                return true;
            }
        }
        System.out.println("No reservation information found: " + phone);
        return false;
    }
}
