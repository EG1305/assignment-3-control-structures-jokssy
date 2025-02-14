/*
 * Joshua Bazaldua, Assignment 3: Primes program
 */
import java.util.Scanner; //import library to use scanner to take input
public class Primes {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows system to take input

        // prompt user for input
        System.out.println("enter a number. the system will find all the prime numbers smaller than this number.");
        int number = input.nextInt();

        int primeCount = 0; // placeholder: counter for primes

        // iterate from 2 to number-1 and check for primes
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;

            // check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // if prime, print and count it
            if (isPrime) {
                System.out.print(i + "\t");
                primeCount++;
            }
        }

        System.out.println("\nthere are a total of " + primeCount + " prime numbers");

        input.close(); //closes system input
    }
}
