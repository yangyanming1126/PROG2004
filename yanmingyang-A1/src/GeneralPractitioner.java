public class GeneralPractitioner extends HealthProfessional {
    private String GeneralPractitioners;

    public GeneralPractitioner(){
        super();
        this.GeneralPractitioners = "General Doctor";
    }
    public GeneralPractitioner(int id,String name, String department,String GeneralPractitioners) {
        super(id, name, department);
        this.GeneralPractitioners = GeneralPractitioners;
    }
    @Override
    public void printDetails(){
        System.out.println("Details:");
        super.printDetails();
        System.out.println("GeneralPractitioners:" + GeneralPractitioners);
    }
    public String getGeneralPractitioners(){
        return GeneralPractitioners;
    }
    public void setGeneralPractitioners(String GeneralPractitioners) {
        this.GeneralPractitioners = GeneralPractitioners;
    }
}
