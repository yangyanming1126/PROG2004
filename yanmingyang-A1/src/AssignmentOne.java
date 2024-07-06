public class AssignmentOne {
    public static void main(String[] args){
        HealthProfessional hp1 = new HealthProfessional(1,"Alex","eyes");
        hp1.printDetails();

        System.out.println("----------------");

        HealthProfessional hp2 = new HealthProfessional();
        hp2.printDetails();
    }
}
