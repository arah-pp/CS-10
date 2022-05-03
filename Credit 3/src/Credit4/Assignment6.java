package Credit4;
/*

Program: ${Assignment6}.java          Date: ${4/21/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment6 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //Scanning and saving the input
		
		System.out.println("What is your first name?"); //Displaying "What is your first name?" to the user
		String Fname = input.next(); //Scanning the input of the user and storing under "Fname"
		System.out.println("What is your last name?"); //Displaying "What is your last name?"
		String Lname = input.next(); //Scanning the users input and saving as "Lname"
		System.out.println("What grade are you in?"); //Displaying "What grade are you in?" on users screen
		String Grade = input.next(); // Saving users input under "Grade"
		System.out.println("What school do you attend?"); //Displaying "What school do you attend?"
		String School = input.next(); //Saving "What school do you attend?" under "School"
		System.out.println("What is your favourite hobby?"); //Displaying "What is your favorite hobby?" on users screen
		String Hobby = input.next(); //Saving users input as Hobby
		System.out.println("Hello, your name is "+ Fname + " " + Lname +", you are\r\n" //Putting all the code together as as sentence
				+ "currently in grade " + Grade + " at " + School + ". Your\r\n"
				+ "favorite hobby is " + Hobby + ".");
		

	}

}
/* 
What is your first name?
Ashton
What is your last name?
Hirdle
What grade are you in?
10
What school do you attend?
Crecent
What is your favourite hobby?
Soccer
Hello, your name is Ashton Hirdle, you are
currently in grade 10 at Crecent. Your
favourite hobby is Soccer.
 */