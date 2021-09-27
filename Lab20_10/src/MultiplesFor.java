import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program prints out multiples of a base number till a specified maximum.");
		System.out.println("Please enter the maximum number:");
		Scanner input = new Scanner(System.in);
		int maxNumber = input.nextInt();
		System.out.println("Please enter the base number whose multiples to print:");
		int multiples = input.nextInt();
		
		System.out.println("Multiples of " + multiples + " from 1 till " + maxNumber + " are:");
		int answer = 0;
		
		for (int i = 1; (int)(i*multiples) <= maxNumber; i++) {
			System.out.println("Number " + (int)(i*multiples));
		
		}
	}

}
