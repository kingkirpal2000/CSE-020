import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		char charA = 'A';
		
		System.out.println("You have entered " + (int)(num));
		
		if (num > 0 && num < 27)
			System.out.println("Character " + (int)(num) + " of the alphabet is " + (char)(charA + (num-1)));
		else
			System.out.println("Invalid Input! Number is outside of acceptable range.");
	}

}
