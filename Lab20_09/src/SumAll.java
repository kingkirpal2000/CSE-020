import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		System.out.print("Please enter the max amount of numbers to add: ");
		Scanner input  = new Scanner(System.in);
		int maxNumbers;
		maxNumbers = input.nextInt();
		int i = 0;
		int total = 0;
		while (i <= maxNumbers) {
			total += i;
			System.out.println("Number " + i);
			i++;
			
		}
		System.out.println("The sum of all numbers from 0 till " + maxNumbers + " is: " + total);
		

	}

}
