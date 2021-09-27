import java.util.Scanner;

public class SumSquareArr {

	public static void main(String[] args) {
		System.out.println("Please enter the maximum number.");
		Scanner input = new Scanner(System.in);
		int maxNumber = input.nextInt();
		
		System.out.println("Contents of Arr1(for-loop), Arr2 (while-loop), Arr3 (do-while-loop) are:");
		
		// for loop arr1
		int[] arr1;
		arr1 = new int[maxNumber+1];
		
		
		for (int i = 1; i <= maxNumber; i++) {
			arr1[i] = arr1[i-1]+(i*i);
			
		}
		
		//while loop arr2
		int[] arr2;
		arr2 = new int [maxNumber + 1];
		int i = 1;
		while(i <= maxNumber) {
			arr2[i] = arr2[i - 1] + (i*i);
			i++;
			
			
		}
		
		//do while loop arr3
		int[] arr3;
		arr3 = new int[maxNumber + 1];
		i = 1;
		do {
			arr3[i] = arr3[i - 1] + (i*i);
			
		}while(++i <= maxNumber);
		
		
		for (int b = 0; b<= maxNumber; b++) {
			System.out.println("Arr1  " + arr1[b] + "  Arr2  " + arr2[b] + "  Arr3  " + arr3[b]);
		}
		
		System.out.println("Sum of Squares of numbers from 1 to " + maxNumber + " is: " + arr1[maxNumber]);

	}

}
