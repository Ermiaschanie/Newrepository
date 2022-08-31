package Test1;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("-----Enter your Details----");

   Scanner in =new Scanner(System.in);
   
  System.out.print("Enter your name: ");
  String name = in.next();
  System.out.print("Name:"+ name);
  System.out.print("Enter your age: ");
  int i = in.nextInt();
  System.out.println("Age: " + i );
  System.out.print("Enter your Salary:");
  double D = in.nextDouble();
  System.out.print("Salary: " + D);
  
  in.close();
  
	}
	

}
