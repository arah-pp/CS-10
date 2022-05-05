package Credit5;
/*

Program: ${Assignment11}.java          Date: ${5/5/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment11 {

	  public static void main(String args[])
	  {
		  Scanner userinput = new Scanner(System.in); //The scanner for users input

		  System.out.println("Please enter any three digit number: "); //Displaying text on screen

			int threeDigits = userinput.nextInt(); //Scanning and saving users input

			int one = threeDigits / 100; //Separating the first digit from the other two and saving as digit "one"

			int two =  (threeDigits % 100)/10; //Separating the second digit from the last two and saving as "two"

			int three =  (threeDigits % 100)%10; //Taking the remaining number and saving It as "three"

			 
			int max = 0;
			int min = 0;
			

			 if (two > one && (three > two) && (one < three)) //Creating the condition for 579
			   {
				 max = three;
		         min = one;
		         System.out.println( );
		          System.out.println("The largest of the three digits is: " + max); //Displaying all of the following text on the users screen
				  System.out.println( );
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println( );
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println( );
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println( );
				  System.out.println("The average of the three digits is: " + two );

			   }
			   
			   else if (one > two && (two > three) && (one > three)) //Creating the condition for 931
			   {
				 max = one;
		         min = three;
		          System.out.println( );
				  System.out.println("The largest of the three digits is: " + max); //Displaying all of the following text on the users screen
				  System.out.println( );
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println( );
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println( );
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println( );
				  System.out.println("The average of the three digits is: " + two );

			   }
			   else if (three > one && (two > three) && (one < two)) //Creating the condition for 486
			   {
				 max = two;
		         min = one;
		          System.out.println( );
				  System.out.println("The largest of the three digits is: " + max); //Displaying all of the following text on the users screen
				  System.out.println( );
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println( );
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println( );
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println( );
				  System.out.println("The average of the three digits is: " + three );

			   }
			   else if (one > three && (two > one) && (three < two)) //Creating the condition for 452
			   {
				 max = two;
		         min = three;
		          System.out.println( );
				  System.out.println("The largest of the three digits is: " + max); //Displaying all of the following text on the users screen
				  System.out.println( );
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println( );
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println( );
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println( );
				  System.out.println("The average of the three digits is: " + one );


			   }
			   else if (one > two && (three > one) && (two < three)) //Creating the condition for 536
			   {
				 max = three;
		         min = two;
		          System.out.println( );
				  System.out.println("The largest of the three digits is: " + max); //Displaying all of the following text on the users screen
				  System.out.println( );
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println( );
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println( );
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println( );
				  System.out.println("The average of the three digits is: " + one );




			   }

		         
	  

	  }
	  }
	

/* Screen Dump
Please enter any three digit number: 
674

The largest of the three digits is: 7

The smallest of the three digits is: 4

The sum of the three digits is: 17

The product of the three digits is: 168

The average of the three digits is: 6
  */