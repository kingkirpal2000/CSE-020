import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the maximum number: ");
		Scanner input = new Scanner(System.in);
		int maxNumber = input.nextInt();
		int total = 0;
		for (int i = 1; i<= maxNumber; i++) {
			System.out.println("Number " + i + " squared is " + (int)(i*i));
			total += i*i;
		}
		System.out.println("The sum of squares of all numbers from 1 till 3 is : " + total);
	}

}
