package lesson8.practice.task3;

public class Employee extends Member{

   private String specialization;

   public Employee() {
      super();
   }

   public Employee(String name, int age, int phoneNumber, String address, double salary, String specialization) {
      super(name, age, phoneNumber, address, salary);
      this.specialization = specialization;
   }

   public Employee(String specialization) {
      this.specialization = specialization;
   }

   public void setSpecialization(String specialization) {
      this.specialization = specialization;
   }
}
