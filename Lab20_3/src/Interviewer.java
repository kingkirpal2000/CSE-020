import java.util.Scanner;
public class Interviewer {

	public static void main(String[] args) {
		
/*
 * q1 What are some of your weaknesses?
 * q2 How would your past experiences contribute to our team?
 * q3 How would you handle working with difficult coworkers?
 * q4 Why do you think you would make a good fit for our company.
 * q5 How would you approach a problem you know nothing about.
*/
	
		
		String weaknesses;
		System.out.print("What are some of your weaknesses\n");
		Scanner q1 = new Scanner (System.in);
		weaknesses = q1.next();
		
		System.out.println("Their biggest weakness is " + weaknesses);
		
		String pastExperiences;
		System.out.print("How would your past experiences contribute to our team?\n");
		Scanner q2 = new Scanner (System.in);
		pastExperiences = q2.next();
		
		System.out.println("Their past experiences will contribute to our team by " + pastExperiences);
		
		String difficultCoworkers;
		System.out.print("How would you handle working with difficult coworkers\n");
		Scanner q3 = new Scanner (System.in);
		difficultCoworkers = q3.next();
		
		System.out.println("They would handle working with difficult coworkers by " + difficultCoworkers);
		
		String fit;
		System.out.print("Why do you think you would make a good fit for our company.\n");
		Scanner q4 = new Scanner (System.in);
		fit = q4.next();
		
		System.out.println("They think they will be a good fit for the company because " + fit);
		
		String problemApproach;
		System.out.print("How would you approach a problem you know nothing about.\n");
		Scanner q5 = new Scanner (System.in);
		problemApproach = q5.next();
		
		System.out.println("They would approach a problem they know nothing about by " + problemApproach);
		
		
		q1.close();
		q2.close();
		q3.close();
		q4.close();
		q5.close();
		
		
		

		// TODO Auto-generated method stub

	}

}
