/* Author: Alyssa Ayala
 * Program # 1
 * Date: Sept 25, 2023
 * Source name: MySchedule.java
 * Program purpose: This program asks for my name, age and
 * prints my schedule. It then tells me my birthplace and 
 * how many days old I am. 
 */

import java.util.Scanner;

public class MySchedule {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String subjectOne = " 9:30 AM CPSC 155 - Intro to Programming";
		String subjectTwo = "11:30 AM CPSC 245 - Operating Systems";
		String subjectThree = " 1:30 PM CIS  120 - Intro to Computer Apps";

		System.out.print("What is your name? ");
		String userName = sc.next();
		System.out.print("How old are you? ");
		int ageYears = sc.nextInt();
		int ageDays = ageYears * 365;
		System.out.printf("%s's Class Schedule\n\n", userName);

		System.out.println("Monday: ");
		System.out.printf("\t%s", subjectOne + "(F2F)\n");
		System.out.printf("\t%s", subjectTwo + "(HYB)\n");
		System.out.printf("\t%s", subjectThree + "(ONL)\n\n");

		System.out.println("Tuesday: ");
		System.out.println("\t1:00 PM - 3:00 PM Office Hours\n\n");

		System.out.println("Wednesday: ");
		System.out.printf("\t%s", subjectOne + "(F2F)\n");
		System.out.printf("\t%s", subjectTwo + "(HYB)\n");
		System.out.printf("\t%s", subjectThree + "(ONL)\n\n");

		System.out.println("Thursday: ");
		System.out.println("\tResearch off-campus\n");

		System.out.println("Friday: ");
		System.out.printf("\t%s", subjectOne + "(F2F)\n");
		System.out.printf("\t%s", subjectTwo + "(HYB)\n");
		System.out.printf("\t%s", subjectThree + "(ONL)\n\n");

		System.out.printf("%s was born in Wheaton, Illinois\n", userName);
		System.out.printf("and is approximately %d days old.", ageDays);

		sc.close();

	}

}
