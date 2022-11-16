package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem11DisplayTheLargestNumberOfFour {

	public static void main(String[] args) {
		
/*		Find a way to make it work with imputted decimals. 
 * */
		
		Scanner findTheLargestOfFourNumbers = new Scanner(System.in);
		Double number1;
		Double number2;
		Double number3;
		Double number4;
		
		System.out.println("Please enter the four numbers and hit enter in-between:");
		
		number1 = findTheLargestOfFourNumbers.nextDouble();
		number2 = findTheLargestOfFourNumbers.nextDouble();
		number3 = findTheLargestOfFourNumbers.nextDouble();
		number4 = findTheLargestOfFourNumbers.nextDouble();
		
		if (number1 > number2 
			&& number1 > number3
			&& number1 > number4)
		{System.out.println("The largest number is: " + number1);}
		
		else if (number2 > number1 
				&& number2 > number3
				&& number2 > number4)
			{System.out.println("The largest number is: " + number2);}
		
		else if (number3 > number2 
				&& number3 > number1
				&& number3 > number4)
			{System.out.println("The largest number is: " + number3);}
		
		else if (number4 > number2 
				&& number4 > number3
				&& number4 > number1)
			{System.out.println("The largest number is: " + number4);}

	}

}
