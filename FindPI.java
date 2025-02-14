/*
 * Joshua Bazaldua, Assignment 3: Find PI program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class FindPI {
   
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows system to take input

        // display programs purpose
        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.println("How many iterations should we use? Please enter an integer: ");

        int iterations = input.nextInt(); //store input into iterations

        // measure start time
        long startTime = System.currentTimeMillis();

        // compute PI using the Leibniz series
        double pi = 0.0;
        for (int i = 0; i < iterations; i++) {
            double term = 4.0 / (2 * i + 1);
            pi += (i % 2 == 0) ? term : -term; // alternating signs
        }

        // measure end time
        long endTime = System.currentTimeMillis();
        double elapsedTime = (endTime - startTime) / 1000.0; // Convert milliseconds to seconds

        // display results
        System.out.println("PI = " + pi);
        System.out.println("After " + iterations + " iterations.");
        System.out.println("This operation took " + elapsedTime + " seconds.");

        input.close(); //closes system input
    }
}
