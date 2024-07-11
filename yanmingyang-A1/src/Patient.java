public class Patient {
    public String patientName;
    private String patientMobile;


    public Patient() {
    }

    public Patient(String patientName, String patientMobile) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
    }



    public String getPatientName() {
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

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientMobile='" + patientMobile + '\'' +
                '}';
    }
}
