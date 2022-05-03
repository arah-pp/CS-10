package Credit4;
/*

Program: ${Assignment9}.java          Date: ${4/29/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment9 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //The scanner  scans the users input
		
		System.out.println("Enter an integer:");
		int fI = input.nextInt(); 
		System.out.println("Enter a second integer: ");
		int sI = input.nextInt(); 
		int answer = fI / sI;
		System.out.println(fI + "/" + sI + "=" + answer);
	 
		}

}
/* 
Enter an integer:
81
Enter a second integer: 
9
81/9=9
 */