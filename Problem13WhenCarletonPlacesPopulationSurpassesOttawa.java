package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem13WhenCarletonPlacesPopulationSurpassesOttawa {

	public static void main(String[] args) {
		
		Scanner carletonPlaceLargerPopulationThanOttawa = new Scanner(System.in);
		boolean running = true;
		double populationOfCarletonPlace;
		int theCurrentYear;
		double populationOfOttawa;
		
		System.out.println("Please enter the current population of Carleton Place, then the current year,"
				+ "\n and finally the population of Ottawa and hit enter in between values:\n");
		
		populationOfCarletonPlace = carletonPlaceLargerPopulationThanOttawa.nextInt();
		theCurrentYear =  carletonPlaceLargerPopulationThanOttawa.nextInt();
		populationOfOttawa = carletonPlaceLargerPopulationThanOttawa.nextInt();
		
		double growthPerYearCarletonPlace = (theCurrentYear * 0.14);
		double growthPerYearOttawa = (theCurrentYear * 0.08);
		
		while (running == true) {
			
			theCurrentYear ++;
			
			growthPerYearCarletonPlace = (theCurrentYear * 0.14);
			growthPerYearOttawa = (theCurrentYear * 0.08);
			
			populationOfCarletonPlace = (populationOfCarletonPlace + growthPerYearCarletonPlace);
			populationOfOttawa = (populationOfOttawa + growthPerYearOttawa);
			
			//System.out.println(populationOfCarletonPlace + ",     " + populationOfOttawa); for catching bugs
		
			
			if (populationOfCarletonPlace >= populationOfOttawa) {
				
				System.out.println("\nThe year that the population of Carleton Place will surpass "
						+ "\nthe population of Ottawa is the year " + theCurrentYear + ".");
				
				break;
				
			}
			
			
			
			
		}
		
			
		}
		
		
		
		
		
		
		
	}


