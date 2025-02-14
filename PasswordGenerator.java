/*
 * Joshua Bazaldua, Assignment 3: Password Generator
 */
import java.util.Scanner; //import library to use scanner to take user input
import java.util.Random; //import library to generate random numbers
public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //allows system to take input
		Random random = new Random(); //random number generator
		
		//prompt user for password length
		System.out.println("How many digits do you want to use for a numeric password?");
		int length = input.nextInt();
		
		System.out.println("Your password is");
		
		//loop to generate password through random digits (0-9)
		for (int i = 0; i < length; i++) {
			int digit = random.nextInt(10); //generates number between 0-9
			System.out.print(digit + " ");
		}
		
		input.close();

	}

}
