package Assignment;

import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of a side of the square: ");
    double sideLength = input.nextDouble();
    double area = calculateArea(sideLength);
    double perimeter = calculatePerimeter(sideLength);
    System.out.println("The area of the square is " + area);
    System.out.println("The perimeter of the square is " + perimeter);
  }
  
  public static double calculateArea(double side) {
	    double area = side * side;
	    return area;
	  }

	  public static double calculatePerimeter(double side) {
	    double perimeter = 4 * side;
	    return perimeter;
	  }
	}