/*
 * Joshua Bazaldua, Assignment 3: Mersenne
 */
import java.util.Scanner; //import library to take user input
public class Mersenne {
   
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows system to take input

        // prompt user for input
        System.out.println("enter a number. the system will find all the mersenne prime numbers smaller than this number.");
        int number = input.nextInt();

        int count = 0; // counter for mersenne primes

        // iterate through powers of 2 to find mersenne primes
        for (int n = 1; ; n++) {
            int mersenneNumber = (int) Math.pow(2, n) - 1;

            if (mersenneNumber >= number) {
                break; // stop when mersenne number is larger than the input
            }

            boolean isPrime = true;

            // check if mersenneNumber is prime
            if (mersenneNumber < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= mersenneNumber; i++) {
                    if (mersenneNumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // if mersenneNumber is prime, print it and count it
            if (isPrime) {
                System.out.print(mersenneNumber + "\t");
                count++;
            }
        }

        System.out.println("\nthere are a total of " + count + " mersenne prime numbers");

        input.close(); //closes system input
    }
}

