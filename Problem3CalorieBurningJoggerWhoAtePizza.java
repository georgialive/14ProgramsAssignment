package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem3CalorieBurningJoggerWhoAtePizza {

	public static void main(String[] args) {
		
		Scanner runningCalories = new Scanner(System.in);
		Double numberofCalorieseaten;
		
		double numberofBurnedCaloriesPersecond = 0.16666666666666;
		
		System.out.println("Please enter the number of calories you have eaten" + "\n" + "\n"
							+ "(Please enter it in as a numerical value not written in words, " 
							+ "and hit enter):" + "\n");

		numberofCalorieseaten = runningCalories.nextDouble();
		
		int equationofCaloriestoBurnoff = (int) (numberofCalorieseaten / numberofBurnedCaloriesPersecond);

		
/*		The following code is to format the computer answers into hour:minute:second
 * 		answers as they are more understandable than 5890 seconds of running.
 * 
 * 		(I also added a line break after it because I want there to be a space before
 * 		the answer/solution is outputted into the console for formatting)
 * 
 * 		let H = the # of hours the person will have to run for.
 * 		let M = the # of minutes the person will have to additionally run for.
 * 		let S = the # of seconds the person will additionally have to run for.
 * 
 * 
 * 		fix the negative */
		
		int seconds = equationofCaloriestoBurnoff;
		int S = seconds % 60;
		int H = seconds / 60;
		int M = H % 60;
		H = H / 60;
		
		System.out.println("\n");
		
/*		The if statements below are for the computer output responses to be more human and/or natural.
 * 		(I also just wanted to practice useing if and else if statements in this project :3)*/
		
		if (H == 0 &&
			S == 0 &&
			M == 0)
			{System.out.println("\n" + "Congradulations! You do not have to run at all!\n You have no calories to burn :).");}
		
		else if (H == 1 &&
				S == 0 &&
				M == 0)
				{System.out.println("\n" + "You will have to run for one hour to burn off all of those calories! Have fun!");}
		
		else if (H == 1 &&
				S == 1 &&
				M == 0)
				{System.out.println("You will have to run for 1 hour and 1 second to burn off those calories, get to work!");}

		else if (H == 1 &&
				S == 1 &&
				M == 1)
				{System.out.println("You will have to run for 1 hour 1 minute and 1 second to burn off the calories you just ate.");}
		
		else if (H == 0 &&
				S == 1 &&
				M == 1)
				{System.out.println("You will have to run for 1 minute and 1 second to burn off the calories you just ate.");}	
		
		else if (H == 0 &&
				S == 0 &&
				M == 1)
				{System.out.println("You will have to run for 1 second to burn off the calories you just ate.");}
			
			
		else if (H >= 1 &&
				S == 1 &&
				M == 1)
				{System.out.println("You will have to run for " + H + " hours " + M + " minute and " + S + " second " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else if (H >= 1 &&
				S >= 1 &&
				M == 1)
				{System.out.println("You will have to run for " + H + " hours " + M + " minutes and " + S + " second " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else if (H >= 1 &&
				S >= 1 &&
				M >= 1)
				{System.out.println("You will have to run for " + H + " hours " + M + " minutes and " + S + " seconds " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else if (H == 1 &&
				S >= 1 &&
				M >= 1)
				{System.out.println("You will have to run for " + H + " hour " + M + " minutes and " + S + " seconds " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else if (H == 1 &&
				S == 1 &&
				M >= 1)
				{System.out.println("You will have to run for " + H + " hour " + M + " minute and " + S + " seconds " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else if (H >= 1 &&
				S == 0 &&
				M == 0)
		{System.out.println("You will have to run for " + H + " hours in order to burn off the calories you just ate." + "\n");}

		else if (H == 0 &&
				S >= 1 &&
				M == 0)
		{System.out.println("You will have to run for " + S + " seconds in order to burn off the calories you just ate." + "\n");}
		
		else if (H == 0 &&
				S == 0 &&
				M >= 1)
		{System.out.println("You will have to run for " + M + " minutes in order to burn off the calories you just ate." + "\n");}
		
		else if (H >= 1 &&
				S >= 1 &&
				M == 0)
		{System.out.println("You will have to run for " + H + " hours " + S + " minutes in order to burn off the calories you just ate." + "\n");}
		
		else if (H == 0 &&
				S >= 1 &&
				M >= 1 )
				{System.out.println("You will have to run for " + M + " minutes and " + S + " seconds " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		else if (H >= 1 &&
				S == 0 &&
				M >= 1 )
				{System.out.println("You will have to run for " + H + " hours and " + M + " minutes " + "\n" 
									+ "in order to burn off the calories you just ate." + "\n");}
		
		else
			{System.out.println("\n" + "You will have to run for " + H + " hours " + M + " minutes and " + S + " seconds " + "\n"
								+ "in order to burn off the calories you just ate." + "\n");}
		

		System.out.println("ε=ε=ε=ε=ε=(っ*´w`)っ   have a good day!");
		
		
		
/*		I know that there is most likely a more easy way to do this, however I don't think I have learned it 
 * 		yet, so I just copied and pasted "else if" statements so that the console would print more human statements. 
 * 		
 * 		There also may be some instances that I did not think of, in the case that there is please let me know! I think I have all of them, 
 * 		however one can never be too sure! :) */
		
		
	
	}

	
}
