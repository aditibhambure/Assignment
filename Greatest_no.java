import java.util.Scanner;
public class Greatest_no{

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Type 1st number: ");
  int num1 = in.nextInt();
   
  System.out.print("Type 2nd number: ");
  int num2 = in.nextInt();
   
  System.out.print("Type 3rd number: ");
  int num3 = in.nextInt();
   
   
  if (num1 > num2)
   if (num1 > num3)
    System.out.println("The greatest: " + num1);
   
  if (num2 > num1)
   if (num2 > num3)
    System.out.println("The greatest: " + num2);
   
  if (num3 > num1)
   if (num3 > num2)
    System.out.println("The greatest number is: " + num3);
 }
}
