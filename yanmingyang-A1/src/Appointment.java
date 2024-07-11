import java.time.LocalDateTime;

    /**
     * 创建一个类来容纳患者预约
     */
    public class Appointment {
        private Patient patient;

        /**
         * 预约时间
         */
        public String timeOfAppointment;

        /**
         * 选择的医生
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
            System.out.println("预约时间："+this.timeOfAppointment);
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
