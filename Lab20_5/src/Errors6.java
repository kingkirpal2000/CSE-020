import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);//had to add ln here

		//Scanner input = new Scanner(System.in); you dont need another scanner

		float f1, f2; //you cant name these n1 and n2 because they are already being used as ints you can change the name to f1 and f2
		//float n1, n2; 
		System.out.print("Please enter the first number:");
		f1 = input.nextFloat();

		System.out.print("Please enter the second number: ");
		f2 = input.nextFloat();

		float averageFloat; //int average is already being used i had to name it averageFloat
		//float average; was the old line
		averageFloat = (float) ((f1+f2)/2);
		System.out.println("The average of the numbers is " + averageFloat);// i had to add averageFloat here since it was only using average as in the one from the integers
		//also had to make the last line add a new line
		short s1, s2;

		System.out.print("Please enter the first number: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input.nextShort();

		short shortAvg;
		shortAvg = (short) ((s1+s2)/2); //needed another parentheses around n1 + n2 in order to make it work
		System.out.print("The average of the numbers is " + shortAvg);
	input.close();
	
	}

}
