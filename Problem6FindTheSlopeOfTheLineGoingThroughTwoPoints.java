package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem6FindTheSlopeOfTheLineGoingThroughTwoPoints {

	public static void main(String[] args) {
		
		
		Scanner equationofaLine = new Scanner(System.in);
		Double y1;
		Double y2;
		Double x1;
		Double x2;
		
		System.out.println("Please enter the two points so that we may calculate the equation of a line for you!" + "\n"
						+ "");
		
		// Mr. Snow Notes : input as a string, remove non-numeric characters but subset separated by a comma.
		// 					String.substring, charAt(), Interger.ValueOf(string), Integer.parseInt(string) 
		//					StringName.length(), arrays, replaceAll?
		
		
		x1 = equationofaLine.nextDouble();
		y1 = equationofaLine.nextDouble();
		x2 = equationofaLine.nextDouble();
		y2 = equationofaLine.nextDouble();
		
		
		double m = ((y2 - y1)/(x2 - x1));
		
		double b = ((m * x1) - y1);
		
		if (b < 0)
			{System.out.println("\n" + "The equation of the line given the two points is " + "\n"
					+ "y = " + m + "x " + b + "\n" + "\n"
					+ "Have a good day!!! :3");}
		
		else {System.out.println("\n" + "The equation of the line given the two points is " + 
							"y = " + m + "x + " + b + "\n" +
							"Have a good day!!! :3");}
		

	}

}
