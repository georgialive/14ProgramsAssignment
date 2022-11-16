package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem12HowMuchDoesTheEmployeeTakeHome {

	public static void main(String[] args) {
		
		Scanner ammountOfMoneyTakenHome = new Scanner(System.in);
		double numberOfHoursWorkedInThatWeek;
		double hourlyPay;
		double ammountOfTaxesNeedToBePaid=0;
		
		System.out.println("Please enter the number of hours you have worked this week" + "\n" + "\n"
							+ "(Please enter it in as a numerical value not written in words, " 
							+ "and hit enter between values):" + "\n");

		numberOfHoursWorkedInThatWeek = ammountOfMoneyTakenHome.nextDouble();
		hourlyPay = ammountOfMoneyTakenHome.nextDouble();
		
		double ammountMadePerWeekBeforeTaxes = (numberOfHoursWorkedInThatWeek * hourlyPay);
		
		double ammountMadeInAYear = (ammountMadePerWeekBeforeTaxes * 52.1429);
		
		
		if (ammountMadeInAYear <= 46226)
			{ammountOfTaxesNeedToBePaid = 0.0505;}
		
		else if (ammountMadeInAYear > 46226
				&& ammountMadeInAYear <= 92454)
			{ammountOfTaxesNeedToBePaid = 0.0915;}

		else if (ammountMadeInAYear > 92454
				&& ammountMadeInAYear <= 150000)
			{ammountOfTaxesNeedToBePaid = 0.01116;}
		
		else if (ammountMadeInAYear > 150000
				&& ammountMadeInAYear <= 220000)
			{ammountOfTaxesNeedToBePaid = 0.01216;}

		else if (ammountMadeInAYear > 220000)
			{ammountOfTaxesNeedToBePaid = 0.01316;}
		
		
		double ammountOfMoneyPayedinTaxes = (ammountMadePerWeekBeforeTaxes * ammountOfTaxesNeedToBePaid);
		
		double theAmmountOfMoneyTakenHome = (ammountMadePerWeekBeforeTaxes - ammountOfMoneyPayedinTaxes);
		
		System.out.println("The ammount of money you take home would be: " + theAmmountOfMoneyTakenHome);

	}

}
