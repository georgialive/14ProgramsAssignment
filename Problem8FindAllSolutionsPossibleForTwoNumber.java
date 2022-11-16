package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem8FindAllSolutionsPossibleForTwoNumber {

	public static void main(String[] args) {
		
		// make it so that it does decimals,
		
		Scanner AllSolutionsPossible = new Scanner(System.in);
		Double firstInteger;
		Double secondInteger;
		
		System.out.println("Please enter the two values and hit enter in between values:");
		
		firstInteger = AllSolutionsPossible.nextDouble();
		secondInteger = AllSolutionsPossible.nextDouble();
		
		double sum = (1.000 * firstInteger + secondInteger);
		double difference1 = (1.000 * firstInteger - secondInteger);
		double difference2 = (1.000 * secondInteger - firstInteger);
		double product = (1.000 * firstInteger * secondInteger);
		double quotient1 = (1.000 * firstInteger/secondInteger);
		double quotient2 = (1.000 * secondInteger/firstInteger);
		double modulus1 = (1.000 * firstInteger % secondInteger);
		double modulus2 = (1.000 * secondInteger % firstInteger);
		
		System.out.println("\nThe sum of the two values is: " + sum + "\n");
		System.out.println("\nThe difference of the two values if the first value you entered is first is: " + difference1 + "\n");
		System.out.println("\nThe difference of the two values if the second value you entered is first is: " + difference2 + "\n");
		System.out.println("\nThe product of the two values is: " + product + "\n");
		System.out.println("\nThe quotient of the two values if the first value you entered is first is: " + quotient1 + "\n");
		System.out.println("\nThe quotient of the two values if the second value you entered is first is: " + quotient2 + "\n");
		System.out.println("\nThe modulus of the two values if the first value is first is: " + modulus1 + "\n");
		System.out.println("\nThe modulus of the two values if the second value is first is: " + modulus2 + "\n");
		

	}

}
