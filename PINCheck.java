/*
 * Joshua Bazaldua, Assignment 3: Pin Check program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class PINCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //allows system to take input
		
		//prompt user to enter pin
		System.out.println("Please enter your PIN");
		int originalPin = input.nextInt(); //store orginal pin as integer
		
		int enteredPin; //placeholder 
		
		System.out.println("Please confirm your PIN");
		
		//loop until user enters correct pin
		while (true) {
			enteredPin = input.nextInt();
			
			if (originalPin == enteredPin) {
				System.out.println("PIN accepted. You can access your account");
				break; //exit when correct pin is entered
			} else {
				System.out.println("Incorrect PIN. Try again\nEnter your PIN");
			}
		}
		input.close(); //closes system input

	}

}
