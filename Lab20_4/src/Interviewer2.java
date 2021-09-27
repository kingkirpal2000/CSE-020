import java.util.Scanner;

public class Interviewer2 {

	public static void main(String[] args) {
		Scanner information = new Scanner(System.in);
		System.out.println("What is your name?");
		String name;
		name = information.next();
		System.out.println("What is your favorite number?");
		int favNumber;
		favNumber = information.nextInt();
		System.out.println("What are your hobbies?");
		String hobbies;
		hobbies = information.next();
		System.out.println("Do you live off campus?");
		String campus;
		campus = information.next();
		System.out.println("What is your favorite color?");
		String favColor;
		favColor = information.next();
		System.out.println("What is your height in inches?");
		float height;
		height = information.nextFloat();
		
		float cmHeight;
		cmHeight = (float)(height * 2.54);
		
		System.out.print("So your name is " + name + ". Your favorite number is " + favNumber + ". You like to " + hobbies + ". \n You live " + campus + " campus. Your favorite color is " + favColor + ". Your height in centimeters is " + cmHeight + ".");
		

	}

}
