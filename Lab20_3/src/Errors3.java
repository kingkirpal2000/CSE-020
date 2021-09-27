import java.util.Scanner;

public class Errors3 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in);
		//System.in wasn't placed in parentheses 
		int numerator;
		//int was capitalized
		int denominator;
		//in java int is a command not integer

		System.out.println("This program divides two numbers.");
		//this didn't have "out" keyword
		System.out.print("Enter the numerator: ");
		//this didn't have out keyword either 
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();
		//denominator was spelled wrong

		System.out.print(numerator);
		//System wasn't capitalized
		System.out.print("/");
		System.out.print(denominator);
		//System wasn't capitalized print was capitalized
		System.out.print(" = ");
		//fix it so double is happening outside of println
		double numerator1;
		numerator1 = numerator;
		double denominator2;
		denominator2 = denominator;
		System.out.println(numerator1/denominator2);
		//println was capitalized
		/*So I fixed this part using my own logic.
		 * because double can't be placed inside the print parentheses
		 * I created new dummy variables which took the old number and created double types 
		 * then I used those new variables within the println statement
		 */
	kbd.close();
	}
} 
//There wasn't an open { after calling the class