package Inheritance;

public class Trainee {
     int id;
     String name;
     String address;
     int phone;
     double salary;

    public Trainee(int id, String name, String address, int phone, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }
    //salary calculation
    public double calculateSalary() {
        return salary * 1.1;
    }
    //main method
    public static void main(String[] args) {
    	
    	// create trainee object
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        
        double salary = trainee.calculateSalary(); //invoke calculateSalary method on trainee object
        
        System.out.println("Salary: " + salary); //print calculated salary
    }
}