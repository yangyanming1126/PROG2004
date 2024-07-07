public class GeneralPractitioner extends HealthProfessional {
    private String professional;

    public GeneralPractitioner(){
        super();
        this.professional = "General Doctor";
    }
    public GeneralPractitioner(int id,String name, String department,String professional) {
        super(id, name, department);
        this.professional = professional;
    }
    @Override
    public void printDetails(){
        System.out.println("Details:");
        super.printDetails();
        System.out.println("professional:" + professional);
    }
    public String getProfessional(){
        return professional;
    }
    public void setProfessional(String professional) {
        this.professional = professional;
    }
}
