import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 0 or less to stop entering numbers.");
		Scanner input = new Scanner(System.in);
		int values = 0; 
		float total = 0;
		int i = 1;
		
		do {
			System.out.print("Enter value #" + i + ": ");
			values = input.nextInt();
			if (values > 0) {
			total += values;
			}
			
			i++;

		}while(values > 0);
		
		
		float theAverage = total/(i-2);
		System.out.print(theAverage);
		
		
	}

}
