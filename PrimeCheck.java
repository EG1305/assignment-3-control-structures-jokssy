/*
 * Joshua Bazaldua, Assignment 3: Prime Check
 */
import java.util.Scanner; //import library to use scanner to take user input
public class PrimeCheck {
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows system to take input

        System.out.println("This program will tell you if the number you enter is prime or not");
        System.out.println("You can enter 0 anytime to stop the program");

        while (true) {
            System.out.println("Please enter a number");
            int number = input.nextInt(); //stores input into integer number

            if (number == 0) {
                System.out.println("0 is not prime");
                break; // exit the loop when user enters 0
            }

            boolean isPrime = true;

            if (number < 2) {
                isPrime = false; // numbers less than 2 are not prime
            } else {
                // check divisibility from 2 to sqrt(number)
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break; // No need to continue checking
                    }
                }
            }

            // Print result
            if (isPrime) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }

        input.close(); //closes system input
    }
}
