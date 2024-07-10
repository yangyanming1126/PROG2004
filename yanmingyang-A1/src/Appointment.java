public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional doctor;

    public Appointment(){
        this.patientName = "Annie";
        this.patientMobile = "+86 13147712718";
        this.preferredTimeSlot = "14:30";
        this.doctor = null;
    }

    public Appointment(String patientName, String patientMobile, String preferredTimeSlot,HealthProfessional doctor){
    this.patientName = patientName;
    this.patientMobile = patientMobile;
    this.preferredTimeSlot = preferredTimeSlot;
    this.doctor = doctor;
    }
public void printDetails(){
     System.out.println("Patient Name:" + patientName);
     System.out.println("Patient Mobile:" + patientMobile);
     System.out.println("Preferred Time Slot:" + preferredTimeSlot);
     if (doctor !=null){
         doctor.printDetails();
     }else{
         System.out.println("Doctor: Not assigned");
     }
}

//Getter&Setter
        public String getPatientName(){
          return patientName;
}
     public void setPatientName(String patientName) {
         this.patientName = patientName;
}

     public String getPatientMobile() {
        return patientMobile;
}

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
}

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
