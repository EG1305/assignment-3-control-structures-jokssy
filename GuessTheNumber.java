/*
 * Joshua Bazaldua, Assignment 3: Guess the Number program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class GuessTheNumber {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); //allows system to take user input
        int randomNumber = (int) (Math.random() * 101); // Generates a number between 1 and 100
        
        //placeholders
        int attempts = 0;
        int guess;

        System.out.println("Guess a number between 1 and 100");

        // loop until the correct number is guessed
        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Your guess is too low");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Yes, the number is " + randomNumber);
                System.out.println("\nYou guessed the correct number in " + attempts + " guesses");
                break; // exit the loop when the correct number is guessed
            }
        }

        input.close(); //closes system input
    }
}
