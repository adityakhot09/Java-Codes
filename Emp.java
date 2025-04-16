
public class Emp {
   String firstName;
   String lastName;
   double monthlySalary;
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   public String getFirstName() {
       return firstName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   public String getLastName() {
       return lastName;
   }
   public void setMonthlySalary(double monthlySalary) {
    if(monthlySalary<0){
        this.monthlySalary=0.0;
    }
    else{
         this.monthlySalary=monthlySalary;
    }
   }
   public double getMonthlySalary() {
       return monthlySalary;
   }
public static void main(String[] args) {
    Emp emp1=new Emp();
   emp1.setFirstName("Bob");
   emp1.setLastName("Alinson");
   emp1.setMonthlySalary(10000);
   emp1.getFirstName();
   emp1.getLastName();
   emp1.getMonthlySalary();
}
}
