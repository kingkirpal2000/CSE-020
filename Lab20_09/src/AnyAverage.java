import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.print("Please choose the number of values to average: ");
		Scanner input = new Scanner(System.in);
		int numberValues;
		numberValues = input.nextInt();
		int i = 1;
		int total = 0;
		while (i <= numberValues) {
			
			System.out.print("Please enter the " + i + " number:");
			total += input.nextInt();
			i++;
			
		}
		System.out.print((double)(total/numberValues));
		

	}

}
