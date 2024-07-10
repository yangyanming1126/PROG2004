public class AssignmentOne {
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

    }
}
