import java.util.Scanner;

public class Mainscreen {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter your name followed by your height, weight, and age.");
		Scanner input = new Scanner(System.in);
		
		int heightx, weightx, agex;
		heightx = input.nextInt();
		weightx = input.nextInt();
		agex = input.nextInt();
		
		player newPlayer = new player();
		newPlayer.myPlayer(heightx, weightx, agex);
		
		
		
		
		
		
		
		
		
	

	}

}
