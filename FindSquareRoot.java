/*
 * Joshua Bazaldua, Assignment 3: Find Square Root program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class FindSquareRoot {
    
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in); //allows system to take input

        // display programs purpose
        System.out.println("The program will find the square root of a number");
        System.out.println("Enter a positive integer");
        int n = input.nextInt();

        double lastGuess = 1.0; // initial guess
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;
        int iterations = 0;

        // iterate until the difference is less than 0.000001
        while (Math.abs(nextGuess - lastGuess) >= 0.000001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
            iterations++;
        }

        // display results
        System.out.println("The square root of " + n + " is " + nextGuess);
        System.out.println("The program found the result in " + iterations + " iterations.");

        input.close(); //closes system input
    }
}

