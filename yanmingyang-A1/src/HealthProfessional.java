/**
 * Parent class of health professionals
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String department;

    public HealthProfessional() {
        this.id = 123456;
        this.name = "Alex";
        this.department = "eyes";
    }

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("ID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}