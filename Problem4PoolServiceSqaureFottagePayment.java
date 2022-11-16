package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem4PoolServiceSqaureFottagePayment {

	public static void main(String[] args) {
	
	
	Scanner poolSquareFootage = new Scanner(System.in);
	Double poolSquareFootageforServiceEstimate;	
		
		
	System.out.println("Please enter the ammount of square-footage your pool size is " + "\n"
			+ "so you may get an estimate how much our service will cost." + "\n" 
			+ "(Please remember not to type the number as a written word, or add the" + "\n"
			+ "unit of measurement after the number, or the computer will not understand.)" + "\n");
	
	poolSquareFootageforServiceEstimate = poolSquareFootage.nextDouble();
	
	System.out.println("\n");
	
	System.out.println("The estimate to have our service done on your pool before tax is $"
					+ (poolSquareFootageforServiceEstimate * 0.17) + "\n");
	
	System.out.println("The estimate to have our service done on your pool after tax is $"
					+ ((poolSquareFootageforServiceEstimate * 0.17) * 1.13) + "\n");	
	
	}
}
