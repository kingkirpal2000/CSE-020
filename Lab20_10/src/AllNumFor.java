import java.util.Scanner;

public class AllNumFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int total = 0;
		for (int i = 0; i <= max; i++) {
			System.out.println("Number " + i);
			total += i;
			
		}
		System.out.println("The total of these numbers is " + total);
	}
}
