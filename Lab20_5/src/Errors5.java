import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {

		System.out.print("What is your weight in kg? " );
		Scanner keyboard = new Scanner(System.in); //added scanner keyword
		//keyboard = new Scanner(System.in); was the old line
		int weight; // weight variable was initialized after it was trying to store something in it already
		
		weight = keyboard.nextInt();

		//Scanner keyboard; this was not needed
		int age;

		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point"); //type casted incorrectly needed parentheses around the two numbers
		//System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point"); was the old line
		keyboard.close();
	
	}

}