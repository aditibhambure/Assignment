package Inheritance;

class Employee {
     int emp_id;
     String emp_name;
     String emp_address;
     long emp_phone;
     double emp_salary;
     double specialAllowance=250.80;
     double hra=1000.50;

     Employee(int id, String name, String address, long phone, double salary) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_address = address;
        this.emp_phone = phone;
        this.emp_salary = salary;
    }

    void calculateSalary() {
    	double salary=emp_salary+(emp_salary*specialAllowance/100)+(emp_salary*hra/100);
System.out.println("Salary:= " +salary);
}
}

class Manager extends Employee {
     Manager(int id, String name, String address, long phone, double salary)
     {
        super(id, name, address, phone, salary);
        this.emp_salary=salary;
    }

}

 public class InheritanceActivity
 {
    public static void main(String[] args)
    {
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
        m.calculateSalary();    
}
}