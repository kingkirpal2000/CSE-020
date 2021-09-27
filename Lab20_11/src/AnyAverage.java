import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will find the average of any set of numbers.");
		System.out.print("Please chose number of values to average: ");
		Scanner input = new Scanner(System.in);
		int numValues = input.nextInt();
		System.out.print("Please choose column width for output formatting: ");
		int columnWidth = input.nextInt();
		
		
		int[] arr1;
		arr1 = new int[numValues];
		for(int i = 1; i <= numValues; i++) {
			System.out.print("Please enter value #" + i + ":  ");
			arr1[i-1] = input.nextInt();
		}
		
		System.out.println("The numbers being averaged are ...");
		
		for(int j = 1; j <= numValues; j++) {
			System.out.print(arr1[j-1] + "  ");
			if((j % columnWidth) == 0) {
				System.out.print("\n");
			}
		}
		
		double total = 0.0;
		for (int k = 1; k <= numValues; k++) {
			total += arr1[k-1];
		}
		
		double averaged = (double)(total/numValues);
		
		System.out.println("\nAverage is: " + averaged);
	}

}
