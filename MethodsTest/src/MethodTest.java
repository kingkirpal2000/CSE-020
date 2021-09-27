import java.util.ArrayList;
import java.util.Scanner;

public class MethodTest {

	static void registerName(String name) {
		System.out.println("Alright I'll register this name.");
		ArrayList<String> namesArr = new ArrayList<String>();
		namesArr.add(name);
		System.out.print("The updated registry says: " + namesArr);
	}
	
	public static void main(String[] args) {
		Boolean turnOn = true;
		
		do {
		
		System.out.println("Please enter a name to enter in the registry");
		System.out.println("Please enter '1' to close the registry");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		if(name != "1") {
			registerName(name);
		}
		else {
			System.out.println("OK CHANGA");
			turnOn = false;
		}
		
		}while(turnOn = true);
		
		}
		
		
		
		

	}


