import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		//Integer Manipulation
		System.out.println("Please enter 2 integers.");
		Scanner Integers = new Scanner(System.in);
		
		int n1, n2; 
		n1 = Integers.nextInt();
		n2 = Integers.nextInt();
		int sum = n1 + n2;
		int difference = n1 - n2;
		int product = n1 * n2;
		int divide = n1 / n2;
		int modulus = n1 % n2;
		
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + difference);
		System.out.println("Product of " + n1 + " and " + n2 + " is " + product);
		System.out.println("Integer cast of (" + n1 + " / " + n2 + ") is " + divide);
		System.out.println("Integer cast of (" + n1 + " % " + n2 + ") is " + modulus);
		
		
		
		//Shorts Manipulation 
		System.out.println("Please enter 2 integers.");
		Scanner Shorts = new Scanner(System.in);
		
		short s1, s2; 
		s1 = Shorts.nextShort();
		s2 = Shorts.nextShort();
		short sumShort;
		sumShort = (short) (s1 + s2);
		short differenceShort;
		differenceShort = (short) (s1 - s2);
		short productShort;
		productShort = (short) (s1 * s2);
		short divideShort;
		divideShort = (short) (s1 / s2);
		short modulusShort;
		modulusShort = (short) (s1 % s2);
		
		System.out.println("Sum of " + s1 + " and " + s2 + " is " + sumShort);
		System.out.println("Difference of " + s1 + " and " + s2 + " is " + differenceShort);
		System.out.println("Product of " + s1 + " and " + s2 + " is " + productShort);
		System.out.println("Short cast of (" + s1 + " / " + s2 + ") is " + divideShort);
		System.out.println("Short cast of (" + s1 + " % " + s2 + ") is " + modulusShort);
		
		
		//Floats Manipulation
		System.out.println("Please enter 2 integers.");
		Scanner Float = new Scanner(System.in);
		
		float f1, f2; 
		f1 = Float.nextFloat();
		f2 = Float.nextFloat();
		float sumFloat;
		sumFloat = (float) (f1 + f2);
		float differenceFloat;
		differenceFloat = (float) (f1 - f2);
		float productFloat;
		productFloat = (float) (f1 * f2);
		float divideFloat;
		divideFloat = (float) (f1 / f2);
		float modulusFloat;
		modulusFloat = (short) (f1 % f2);
		
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + sumFloat);
		System.out.println("Difference of " + f1 + " and " + f2 + " is " + differenceFloat);
		System.out.println("Product of " + f1 + " and " + f2 + " is " + productFloat);
		System.out.println("Float cast of (" + f1 + " / " + f2 + ") is " + divideFloat);
		System.out.println("Float cast of (" + f1 + " % " + f2 + ") is " + modulusFloat);
		
		
		//Doubles Manipulation
		System.out.println("Please enter 2 integers.");
		Scanner Doubles = new Scanner(System.in);
		
		double d1, d2; 
		d1 = Doubles.nextDouble();
		d2 = Doubles.nextDouble();
		double sumDouble;
		sumDouble = (double) (d1 + d2);
		double differenceDouble;
		differenceDouble = (double) (d1 - d2);
		double productDouble;
		productDouble = (double) (f1 * f2);
		double divideDouble;
		divideDouble = (double) (d1 / d2);
		double modulusDouble;
		modulusDouble = (double) (d1 % d2);
		
		System.out.println("Sum of " + d1 + " and " + d2 + " is " + sumDouble);
		System.out.println("Difference of " + d1 + " and " + d2 + " is " + differenceDouble);
		System.out.println("Product of " + d1 + " and " + d2 + " is " + productDouble);
		System.out.println("Double cast of (" + d1 + " / " + d2 + ") is " + divideDouble);
		System.out.println("Double cast of (" + d1 + " % " + d2 + ") is " + modulusDouble);
		
		
		

	}

}
