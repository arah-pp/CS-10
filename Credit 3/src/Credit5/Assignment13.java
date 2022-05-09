package Credit5;

/*Program: ${Assignment13}.java          Date: ${5/9/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10
*/

import java.util.Scanner;

public class Assignment13 
{

	public static void main(String[] args)
	{
		
		  Scanner userinput = new Scanner(System.in); //This is the scanner
		  
			System.out.println("Enter the number of copies to be printed: "); //Displaying text on users screen
			int copies = userinput.nextInt(); //Scanning users input

		
			if (copies >= 1000) //If copies in equal to or less than 1000 then the following will happen
			{ 
			System.out.println ("Price per copy is: $0.25" ); //Displaying text on users screen
			System.out.println ( "Total cost is: $" + copies * 0.25); //Displaying text on users screen
			}
			else if (copies >= 750) //If copies in equal to or less than 750 then the following will happen
			{ 
			System.out.println ("Price per copy is: $0.26" ); //Displaying text on users screen
			System.out.println ( "Total cost is: $" + copies * 0.26); //Displaying text on users screen
			}
			else if (copies >= 500) //If copies in equal to or less than 500 then the following will happen
			{ 
			System.out.println ("Price per copy is: $0.27" );//Displaying text on users screen
			System.out.println ( "Total cost is: $" + copies * 0.27); //Displaying text on users screen
			}
			else if (copies >= 100) //If copies in equal to or less than 100 then the following will happen
			{ 
			System.out.println ("Price per copy is: $0.28" ); //Displaying text on users screen
			System.out.println ( "Total cost is: $" + copies * 0.28); //Displaying text on users screen
			}
			else if (copies >= 0) //If copies in equal to or less than 0 then the following will happen
			{ 
				System.out.println ( "Price per copy is: $0.30" ); //Displaying text on users screen
				System.out.println ( "Total cost is: $" + copies * 0.3); //Displaying text on users screen
	}

		}
}

/* Screen Dump
Enter the number of copies to be printed: 
700
Price per copy is: $0.27
Total cost is: $189.0

Enter the number of copies to be printed: 
175
Price per copy is: $0.28
Total cost is: $49.00000000000001
  */