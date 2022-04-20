package Assignments;
/*

Program: ${Assignment4}.java          Date: ${4/20/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
	 System.out.println("What is your name?");
	 String name = input.next();
	 
     System.out.println("Enter the diameter of the pizza:");
     int diameter = input.nextInt();
      
     double D = ((0.05*diameter*diameter)+1.75);
     System.out.println("Thank you " + name + ", Your total is $" + D);
		
	}

}
/* 
What is your name?
Ashton
Enter the diameter of the pizza:
10
Thank you Ashton, Your total is $6.75


What is your name?
Ashton
Enter the diameter of the pizza:
20
Thank you Ashton, Your total is $21.75

 */