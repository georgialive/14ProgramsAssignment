package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem2ConvertingCelsiusToFahrenheitToKelvin {

	public static void main(String[] args) {

		Scanner celsiusTemperature = new Scanner(System.in);
		Double celsiusTemperatureinputed;
		
		System.out.println("Please enter the celsius value you wish to convert" + "\n" + "\n"
							+ "(Please enter it in as a numerical value not written in words," + "\n" 
							+ "or with a degrees sign and hit enter):" + "\n");

		celsiusTemperatureinputed= celsiusTemperature.nextDouble();

		
		System.out.println("\n" + "The temperature you entered in celsius is " 
								+ ((celsiusTemperatureinputed * 9/5) + 32.0) 
								+ "°F in degrees fahrenheit." + "\n");
		
		System.out.println("\n" + "The temperature you entered in celsius is "
								+ (celsiusTemperatureinputed + 273.15)
								+ "°K in degrees Kelvin");
		
/*I'm kind of sick right now so I did the pretty much the same code in this programs as 
 * in the last program, just with different variable names, and equations to match
 * how to convert celsius to fahrenheit, and celsius to kelvins.*/

	




	}
}
