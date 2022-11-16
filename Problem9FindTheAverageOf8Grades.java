package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem9FindTheAverageOf8Grades {

	public static void main(String[] args) {
		
		
		Scanner courseMarks = new Scanner(System.in);
		Double courseMark1;
		Double courseMark2;
		Double courseMark3;
		Double courseMark4;
		Double courseMark5;
		Double courseMark6;
		Double courseMark7;
		Double courseMark8;

		System.out.println("Please enter the eight of your course grades (and hit enter in between each number) to find the average:");
		courseMark1 = courseMarks.nextDouble();
		courseMark2 = courseMarks.nextDouble();
		courseMark3 = courseMarks.nextDouble();
		courseMark4 = courseMarks.nextDouble();
		courseMark5 = courseMarks.nextDouble();
		courseMark6 = courseMarks.nextDouble();
		courseMark7 = courseMarks.nextDouble();
		courseMark8 = courseMarks.nextDouble();
		
		System.out.println("Average of all the marks you have is: " + 
						(courseMark1 + courseMark2 + courseMark3 + courseMark4 + courseMark5 + courseMark6 + courseMark7 + courseMark8)/8);
	}

}
