import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		

		System.out.print("Enter a number and I will ");
		//; was not added to close the line
		System.out.print("square it for you:  ");
		//this string was never ended using "
		number =  kbd.nextInt();
		//scanner is called kbd not keyboard now 
		//nextInt didn't have () 

		// I had to bring down this line because if i kept it up there it was still using number = 0
		//now by the time this program runs the number it is the updated number from scanner
		int theSquare = number * number;

		System.out.print(number + " squared = ");
		//Parentheses weren't closed here
		System.out.println(theSquare);
		//I had to change theSquare from a string value to the variable value
		
		kbd.close();
		
	}
}