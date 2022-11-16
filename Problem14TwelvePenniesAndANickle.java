package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem14TwelvePenniesAndANickle {

	public static void main(String[] args) {
		
		
		Scanner theNames = new Scanner(System.in);
		String player1;
		String player2;
		int pennies = 13;
		int numberTaken1=0;
		int numberTaken2=0;
		
		boolean player = true;
		
		System.out.println("Please enter the name of player 1 (and hit enter)\n"
						+ "then enter the name of player 2 and hit enter.\n");
		
			player1 = theNames.nextLine();
			player2 =  theNames.nextLine();
		
			
		System.out.println("Welcome " + player1 + " and " + player2 + " to the Poison Penny Game.");	
			
	while (pennies > 1)		
		{
		//player true = player 1
		//player false = player 2
		
		Scanner thePennies = new Scanner(System.in);
		
		System.out.println("\nPlease enter either 1 or 2 for the number of pennies you will be taking " + player1 + "!\n");
		
		numberTaken1 = thePennies.nextInt();
		
		player = !player;
		
		
		System.out.println("\nPlease enter either 1 or 2 for the number of pennies you will be taking " + player2 + "!\n");
		
		numberTaken2 = thePennies.nextInt();
		
		player = !player;
		
		
		pennies -= numberTaken1;
		pennies -= numberTaken2;
		
		}
	
	 if (player == true)
	 {
		 System.out.println(player1 + " is stuck with the poison penny! You lost, but better luck next time!");
		 System.out.println(player2 + " won! Congradulations, you are not stuck with the posion penny!");
		 
	 }
	
	 if (player == false)
	 {
		 System.out.println(player1 + " won! Congradulations, you are not stuck with the posion penny!");
		 System.out.println(player2 + " is stuck with the poison penny! You lost, but better luck next time!");
		 
	 }
	
	//I did not want for the number of pennies to be shown, to add some complexity for the players.
	
	
	
	}
	
	
	}

