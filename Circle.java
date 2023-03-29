package Assignment;
import java.util.Scanner;

	//Problem Statement 1
public class Circle {
private float radius; //declaring instance variable radius
static float pi=3.4f;
//default constructor 1

 Circle1() {
radius=1.5f;
 }
//const 2
 Circle (float radius) {
	 this.radius=radius;
 }
 //const 3
 Circle(float radius,radius,float pi){
	 //cons chaining using cons2
	 this.radius=radius;
 }
 //method1
 static float claculateCircleArea(float radius) {
	 return 2*pi*radius;
 }
 //method 2
 static float claculateCircleArea(float radius) {
return 2*pi*radius;
}
public static void main(String[] args) {
	Circle obj=new Circle();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	float radius=sc.nextFloat();
	System.out.println("The area is : "+calculateCircleArea(radius));
	System.out.println("the circumference is :"+calculateCircumference(radius));
}
}


}