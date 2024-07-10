public class Specialist extends HealthProfessional{
    private String field;

    public Specialist() {
        super();
        this.field = "Unknown Field";
    }

    public Specialist(int id, String name, String department, String field) {
        super(id, name, department);
        this.field = field;
    }
    @Override
    public void printDetails() {
        System.out.println("Details:");
        super.printDetails();
        System.out.println("Field:" + field);
    }
    public String getField(){
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}