package Assignments;

import java.util.Scanner;

import org.graalvm.compiler.nodes.TypeCheckHints.Hint;

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
