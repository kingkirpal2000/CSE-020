import java.util.Scanner;
//Because java Scanner was not imported the program didn't know what Scanner was for
public class Errors1 
{

	public static void main(String[] args) 
	{
//First error was found because an open '{' was not placed after main 
		System.out.println("Can you spot and fix the errors?");
//second error was found " was being closed with '
		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		// the line Scanner keyboard... was not closed with ;
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		//n1 was trying to collect information from scanner and store it as string but didn't recall the keyboard variable we added
		//n2 had the same problem as n1 and I wansn't capitalized in nextInt()
		System.out.println("The sum of the numbers is");
		//System.println needs to have the "out" variable to print something on the console
		System.out.println(n1 + n2);
		//This program took n1 and n2 and subtracted them when we told the user that we will add numbers
		//To change this I changed the - operator to a +
		
		keyboard.close();
		
		//Eclipse asked me to close the keyboard scanner which means we are done using it after this point
	}
}