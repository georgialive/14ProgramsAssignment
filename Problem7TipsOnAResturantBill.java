package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem7TipsOnAResturantBill {

	public static void main(String[] args) {
		
		Scanner tipsinaResturant15 = new Scanner(System.in);
		Double finalbillIncludingTax;
		
		System.out.println("Please enter the total bill of your meal." + "\n"
							+ "(Please enter it in as a number with no symbols.)");
		
		finalbillIncludingTax = tipsinaResturant15.nextDouble();
		
		double howMuchTotal = ((finalbillIncludingTax * 0.15) + finalbillIncludingTax);
		
		System.out.println("\n" + "The total ammount needed would be $" + howMuchTotal + ".");

	}

}
