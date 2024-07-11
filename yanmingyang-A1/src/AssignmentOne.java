import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public class AssignmentOne {

    private static ArrayList<Appointment> appointments = new ArrayList<>();

    // Part 3 – Using classes and objects
    public static void main(String[] args){
        // Create HealthProfessional objects and print their details
        HealthProfessional hp1 = new HealthProfessional(1,"Alex","eyes");
        hp1.printDetails();

        System.out.println("----------------");

        HealthProfessional hp2 = new HealthProfessional();
        hp2.printDetails();

        System.out.println("----------------");
        // Part 3 – Using classes and objects

        // Create GeneralPractitioner objects and print their details
        // Source of information: Assumed to be from a webpage
        GeneralPractitioner gp1 = new GeneralPractitioner(1,"Dr.Andy", "General Medicine", "Family Medicine");
        gp1.printDetails();
        System.out.println("----------------");

        GeneralPractitioner gp2 = new GeneralPractitioner(2,"Dr.Eddy", "General Medicine", "Pediatrics");
        gp2.printDetails();
        System.out.println("----------------");

        GeneralPractitioner gp3 = new GeneralPractitioner();
        gp3.printDetails();

        System.out.println("----------------");

        // Create Specialist objects and print their details
        // Source of information: Assumed to be from a webpage
        Specialist sp1 = new Specialist(3,"Dr.Kris", "Cardiology", "Heart Specialist");
        sp1.printDetails();

        System.out.println("----------------");

        Specialist sp2 = new Specialist();
        sp2.printDetails();
        System.out.println("----------------");

        //
        //
        Appointment appointment1 = new Appointment("Yuri", "1234567", "8:00", gp1);
        appointment1.printDetails();
        System.out.println("----------------");

        Appointment appointment2 = new Appointment("Jiao", "0987654", "10:00", sp1);
        appointment2.printDetails();
        System.out.println("----------------");

        Appointment appointment3 = new Appointment();
        appointment3.printDetails();
        System.out.println("----------------");

        //
        //
        CreateAppointment("Amy", "345678", "9:00", gp1);
        CreateAppointment("Booby", "23768432", "11:00", gp2);
        CreateAppointment("Cindy", "768345", "1:00", sp1);
        CreateAppointment("David", "123678", "15:00",sp2);


        printExistingAppointments();
        System.out.println("----------------");

        CancelBooking("23768432");

        //
        printExistingAppointments();



    }
    //
    public static void CreateAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || preferredTimeSlot == null || doctor == null) {
            System.out.println("All appointment details must e provided.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created for " + patientName);
    }
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
    //
    public static void CancelBooking(String patientMobile) {
        Appointment appointmentToCancel = null;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointmentToCancel = appointment;
                break;
            }
        }
        if (appointmentToCancel != null) {
            appointments.remove(appointmentToCancel);
            System.out.println("Appointment for" + patientMobile + "has been cancelled.");
        }else {
            System.out.println("No appointment found for mobile number:" + patientMobile);
        }
    }
}
