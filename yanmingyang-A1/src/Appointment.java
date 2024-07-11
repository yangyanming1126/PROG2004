import java.time.LocalDateTime;

/**
 * Create a class to accommodate patient appointments
 */
public class Appointment {
    private Patient patient;

    /**
     * Make an appointment
     */
    public String timeOfAppointment;

    /**
     * The doctor of choice
     */
    private HealthProfessional doctor;

    public Appointment() {
        this.patient = new Patient("Annie", "13147712718");
        this.doctor = null;
    }

    public Appointment(Patient patient, String timeOfAppointment, HealthProfessional doctor) {
        this.patient = patient;
        this.timeOfAppointment = timeOfAppointment;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println(this.patient);
        System.out.println("Make an appointment："+this.timeOfAppointment);
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("Doctor: Not assigned");
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}

