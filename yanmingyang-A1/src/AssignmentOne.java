import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/**
 * Working with classes and objects
 */
public class AssignmentOne {

    private static ArrayList<Appointment> appointments = new ArrayList<>();


    public static void main(String[] args) {

        //Part 3 – Working with Classes and Objects
        //Add three GPs

        System.out.println("Part 3: Working with Classes and Objects");

        HealthProfessional generalPractitioner01 = new GeneralPractitioner(01, "Tade", "3 years of experience", "General practitioners");
        HealthProfessional generalPractitioner02 = new GeneralPractitioner(02, "Yuri", "4 years of experience", "General practitioners");
        HealthProfessional generalPractitioner03 = new GeneralPractitioner(03, "Lisa", "5 years of experience", "General practitioners");
        System.out.println("---------------------------Information from three GPs-------------------");
        generalPractitioner01.printDetails();
        generalPractitioner02.printDetails();
        generalPractitioner03.printDetails();


        HealthProfessional specialist04 = new Specialist(04, "Eddy", "5 years of experience", "Health Professionals");
        HealthProfessional specialist05 = new Specialist(05, "Kris", "6 years of experience", "Health Professionals");
        System.out.println("------------------------Information on two health professionals------------------------");
        specialist04.printDetails();
        specialist05.printDetails();


        //Part five
        /**
         *      2 appointments with your GP。
         *      * 2 more appointments with another health professional.
         *      * Print an existing appointment.
         *      * Cancel one of the existing appointments.
         *      * Print the existing appointment again to demonstrate the updated appointment collection
         */

        System.out.println("Part 5: Demonstrate how appointments work");
        Patient patient01 = new Patient("Alice", "198989831");
        Patient patient02 = new Patient("Bob", "2312312");
        Patient patient03 = new Patient("Cindy", "19898123219831");
        Patient patient04 = new Patient("David", "1989821319831");


        Appointment appointment01 = new Appointment(patient01, Util.getRandomFutureTimeWithin15Days(), generalPractitioner01);
        Appointment appointment02 = new Appointment(patient02, Util.getRandomFutureTimeWithin15Days(), generalPractitioner02);

        Appointment appointment03 = new Appointment(patient03, Util.getRandomFutureTimeWithin15Days(), specialist04);
        Appointment appointment04 = new Appointment(patient04, Util.getRandomFutureTimeWithin15Days(), specialist05);
        Collections.addAll(appointments,appointment01,appointment02,appointment03,appointment04);

        /**
         * Print the current appointment
         */
        printExistingAppointments();

        System.out.println("---------------------------Before deleting-------------------------------");

        /**
         * Delete
         */
        CancelBooking("198989821331");

        System.out.println("---------------------------After deleting-------------------------------");

        /**
         * Print the current appointment
         */
        printExistingAppointments();

    }

    /**
     * Create a new appointment and add it to the ArrayList
     * Provide all the required information when creating a new appointment
     */
    public static void CreateAppointment(Patient patient, String  localDateTime, HealthProfessional healthProfessional) {
        // Check whether the parameter is empty
        if (patient == null) {
            throw new IllegalArgumentException("Patient information cannot be empty");
        }
        if (localDateTime == null) {
            throw new IllegalArgumentException("Appointment time cannot be empty");
        }
        if (healthProfessional == null) {
            throw new IllegalArgumentException("Health Professionals information cannot be empty");
        }

        // Check that the patient member variable is empty
        if (patient.getPatientName() == null || patient.getPatientName().isEmpty()) {
            throw new IllegalArgumentException("The patient's name cannot be empty");
        }
        if (patient.getPatientMobile() == null || patient.getPatientMobile().isEmpty()) {
            throw new IllegalArgumentException("The patient's mobile phone number cannot be empty");
        }

        // If all checks pass, the appointment creation logic is executed
        appointments.add(new Appointment(patient, localDateTime, healthProfessional));
    }

    /**
     * Used to display existing appointments in the ArrayList. If there are no existing appointments, print a message indicating this
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("----------------");
            }
        }
    }

    /**
     * Cancel the appointment through the patient's mobile phone number. If you can't find the mobile number in an existing appointment, print a message to indicate the error
     *
     * @param patientMobile
     */
    public static void CancelBooking(String patientMobile) {
        for (Appointment appointment : appointments) {
            if(appointment.getPatient().getPatientMobile().equals(patientMobile)){
                appointments.remove(appointment);
                return;
            }
        }
        System.out.println("This person's phone number is not included in the appointment form, please check carefully");
    }
}
