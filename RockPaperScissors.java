/*
 * Joshua Bazaldua, Assignment 3: Rock Paper Scissors program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //allows system to take input
		String[] choice = {"Scissors", "Rock", "Paper"}; //array so we can display choices
		
		System.out.println("Enter 0, 1, 2\nscissors (0), rock (1), paper (2):"); //prompts user input
		int playerChoice = input.nextInt(); //get user input
		
		/*//validates users input
		if (playerChoice < 0 || playerChoice > 2) {
			System.out.println("Invalid choice! Please try again");
			return;
		}*/
		
		//random generator to give computer value
		int computerChoice = (int)(Math.random() * 3);
		
		if (playerChoice == computerChoice) { //checks for same choice
			System.out.println("tie");
		} else if ((playerChoice == 0 && computerChoice == 2) || //all possible choices for player to win
				   (playerChoice == 1 && computerChoice == 0) ||
				   (playerChoice == 2 && computerChoice == 1)) {
			System.out.println("You won: " + choice[playerChoice] + " beats " + choice[computerChoice]); //output victory message
		} else {
			System.out.println("You lose: " + choice[computerChoice] + " beats " + choice[playerChoice]); //output loser message
		}
		
		input.close(); //closes system input
		
		
		

	}

}
