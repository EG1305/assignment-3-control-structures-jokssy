/*
 * Joshua Bazaldua, Assignment 3: Coin Toss program
 */
import java.util.Random; //imports lirbary to generate random values
import java.util.Scanner; //imports library to use scanner to take user input
public class CoinToss {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // ask the user how many tosses they need
        System.out.println("How many coin tosses do you need?");
        int tosses = input.nextInt(); //stores input
        
        System.out.println("Now I will toss the coin " + tosses + " times."); //displays how many tosses
        
        int headsCount = 0;
        int tailsCount = 0;

        // simulate the coin toss
        for (int i = 0; i < tosses; i++) {
            boolean isHeads = random.nextBoolean(); // randomly choose heads (true) or tails (false)

            if (isHeads) {
                System.out.println("Toss: heads");
                headsCount++;
            } else {
                System.out.println("Toss: tails");
                tailsCount++;
            }
        }

        // display results
        System.out.println("Heads facing up: " + headsCount);
        System.out.println("Tails facing up: " + tailsCount);

        input.close(); //closes system input
        
	}

}
