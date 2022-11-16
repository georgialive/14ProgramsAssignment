package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem1ConvertingFahrenheitToCelsiusToKelvin {

	public static void main(String[] args) {
		
		
		Scanner fahrenheitTemperature = new Scanner(System.in);
		Double fahrenheitTemperatureinputed;
		
		System.out.println("Please enter the fahrenheit value you wish to convert" + "\n" + "\n"
							+ "(Please enter it in as a numerical value not written in words," + "\n" 
							+ "or with a degrees sign and hit enter):" + "\n");

		fahrenheitTemperatureinputed= fahrenheitTemperature.nextDouble();

		
		System.out.println("\n" + "The temperature you entered in Fahrenheit is " + ((fahrenheitTemperatureinputed - 32.0) * 5/9) 
							+ "°C in degrees celsius." + "\n");
		
		System.out.println("\n" + "The temperature you entered in Farenheit is " + ((fahrenheitTemperatureinputed - 32) * 5/9 + 273.15)
							+ "°K in degrees Kelvin");
	
	
	
	
/* I use fahrenheitTemperature as my scanner variable name because the value being inputed is
 * a temperature in the fahreheit metric system. I am sure to specify what and how they are to 
 * type the value into the computer because I did not program for the computer to understand
 * if a written value or a value with the degrees sign was entered. 
 * 
 * 
 * 
 * I could have put the equations into a seperate variable, however, because this is such a
 * simple demand I don't really need to.
 *
 * If it was more complex and more values would be added and more conversions would be added, I would
 * have, made them into seperate variables to keep things organized.
 * 
 * Looking towards the future, I would like to find a way to make the values
 * round off after the fourth decimal to keep things clean and simple to look at.*/
	
	
	
	
	
	
	
	
	
	
	}

}
