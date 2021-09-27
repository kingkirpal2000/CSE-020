import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		
		System.out.print("Please enter the sample size: ");
		int sampleSize;
		Scanner input = new Scanner(System.in);
		sampleSize = input.nextInt();
		double avgT1 = 0.0;
		double avgT2 = 0.0;
		double avgT3 = 0.0;
		double avgT4 = 0.0;
		double averaged1 = 0.0;
		double averaged2 = 0.0;
		double averaged3 = 0.0;
		double averaged4 = 0.0;
		double maxAvg = 0.0;
		double minAvg = 0.0;
		
		
		
		System.out.println("Enter numbers for Trial 1");
		double [] Trial1;
		Trial1 = new double[sampleSize + 1];
		for(int j = 1; j <= sampleSize; j++) {
			System.out.println("Enter sample #" + j + ": ");
			Trial1[j-1] = input.nextDouble();
		}
		for(int d = 0; d <= sampleSize; d++) {
			avgT1 += Trial1[d];
		}
		
		
		System.out.println("Enter numbers for Trial 2");
		double [] Trial2;
		Trial2 = new double[sampleSize + 1];
		for(int a = 1; a <= sampleSize; a++) {
			System.out.println("Enter sample #" + a + ": ");
			Trial2[a-1] = input.nextDouble();
		}
		for(int e = 0; e <= sampleSize; e++) {
			avgT2 += Trial2[e];
		}
		
		
		System.out.println("Enter numbers for Trial 3");
		double [] Trial3;
		Trial3 = new double[sampleSize + 1];
		for(int b = 1; b <= sampleSize; b++) {
			System.out.println("Enter sample #" + b + ": ");
			Trial3[b-1] = input.nextDouble();
		}
		for(int f = 0; f <= sampleSize; f++) {
			avgT3 += Trial3[f];
		}
		
		
		System.out.println("Enter numbers for Trial 4");
		double [] Trial4;
		Trial4 = new double[sampleSize + 1];
		for(int c = 1; c <= sampleSize; c++) {
			System.out.println("Enter sample #" + c + ": ");
			Trial4[c-1] = input.nextDouble();
		}
		for(int g = 0; g <= sampleSize; g++) {
			avgT4 += Trial4[g];
		}
		
		
		
		
		System.out.println("Sample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial4");
		for(int i = 1; i <= sampleSize; i++) {
			System.out.println(i + "\t\t" + Trial1[i-1] + "\t\t" + Trial2[i-1] + "\t\t" + Trial3[i-1] + "\t\t" + Trial4[i-1]);
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		
		averaged1 = (double)(avgT1/sampleSize);
		averaged2 = (double)(avgT2/sampleSize);
		averaged3 = (double)(avgT3/sampleSize);
		averaged4 = (double)(avgT4/sampleSize);
		
		System.out.println("Averages: \t" + averaged1 + "\t\t" + averaged2 + "\t\t" + averaged3 + "\t\t" + averaged4);
		
		//Minimum Average
		
		if (averaged4 <= averaged1 && averaged4 <= averaged2 && averaged4 <= averaged3) {
			System.out.println("Minimum Average: " + averaged4);
			minAvg = averaged4;
		}
		else if (averaged3 <= averaged1 && averaged3 <= averaged2 && averaged3 <= averaged4) {
			System.out.println("Minimum Average: " + averaged3);
			minAvg = averaged3;
		}
		else if (averaged2 <= averaged1 && averaged2 <= averaged4 && averaged2 <= averaged3) {
			System.out.println("Minimum Average: " + averaged2);
			minAvg = averaged2;
		}
		else if (averaged1 <= averaged4 && averaged1 <= averaged2 && averaged1 <= averaged3) {
			System.out.println("Minimum Average: " + averaged1);
			minAvg = averaged1;
		}
		else {
			System.out.println("Having some technical difficulties please try again later...");
		}
		
		//Maximum Average
		
		if (averaged4 >= averaged1 && averaged4 >= averaged2 && averaged4 >= averaged3) {
			System.out.println("Maximum Average: " + averaged4);
			maxAvg = averaged4;
		}
		else if (averaged3 >= averaged1 && averaged3 >= averaged2 && averaged3 >= averaged4) {
			System.out.println("Maximum Average: " + averaged3);
			maxAvg = averaged3;
		}
		else if (averaged2 >= averaged1 && averaged2 >= averaged4 && averaged2 >= averaged3) {
			System.out.println("Maximum Average: " + averaged2);
			maxAvg = averaged2;
		}
		else if (averaged1 >= averaged4 && averaged1 >= averaged2 && averaged1 >= averaged3) {
			System.out.println("Maximum Average: " + averaged1);
			maxAvg = averaged1;
		}
		else {
			System.out.println("Having some technical difficulties please try again later...");
		}
		
		if(maxAvg == minAvg) {
			System.out.println("The trials match EXACTLY!");
		}
		else if(maxAvg < (minAvg*2)) {
			System.out.println("The trials concur with each other!");
		}
		else{
			System.out.println("The trials do NOT concur!");
		}
		
		
	}

}
