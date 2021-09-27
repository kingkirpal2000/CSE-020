import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the maximum number:");
		int maxNum;
		maxNum = input.nextInt();
		System.out.print("Please enter the number whose multiples to print:");
		int multNum;
		multNum = input.nextInt();
		System.out.println("Multiples of " + multNum + " from 1 till" + maxNum + " are:");
		int i = 1;
		while (i <= maxNum) {
			
			if (i % multNum == 0) {
				System.out.println("Number" + i);
				i++;
			
			}
			else {
				i++;
			}
		}
	}

}
