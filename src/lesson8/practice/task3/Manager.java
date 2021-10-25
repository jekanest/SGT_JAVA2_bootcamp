package lesson8.practice.task3;

public class Manager extends Member{

    private String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String name, int age, int phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
