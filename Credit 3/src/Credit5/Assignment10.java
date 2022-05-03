package Credit5;
/*

Program: ${Assignment10}.java          Date: ${5/3/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment10 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in); //Scanning the users input
		
		System.out.println("Enter a integer: "); //Displaying this text
		int integer = input.nextInt(); //Saving the users input
		
		if( integer%2 == 0) //Seeing if the remainder is 0 after dividing by 2, if it is then its even
		{
		System.out.println("The integer " + integer + " is even"); //If the calculation has a remainder of 0 then it displays as even
		}
		else //Saying if the previous statement is not true then to go to this next step
		{
		System.out.println("The integer " + integer + " is odd"); //If the remainder is not 0 and its false it displays as odd
		}
		
		}

}
/* 
Enter a integer: 
22
The integer 22 is even

Enter a integer: 
435
The integer 435 is odd
 */