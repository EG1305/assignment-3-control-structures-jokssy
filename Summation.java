/*
 * Joshua Bazaldua, Assignment 3: Summation program
 */
import java.util.Scanner; //import library to use scanner to take user input
public class Summation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //allows system to take input
		
		int sum = 0; //placeholder
		
		//display programs purpose
		System.out.println("This program will add all the numbers you enter");
		System.out.println("Enter 0 for me to stop adding");
		
		while (true) {
			int num = input.nextInt(); //takes user input
			
			System.out.println("You entered " + num); //outputs input
			
			if (num == 0) {
				System.out.println("The sum is " + sum); //outputs sum
				break; //ends loop
			}
			
			sum += num; //adds num to sum
			System.out.println("The sum is " + sum); //outputs sum
			
		}
		
		System.out.println("The sum of all the numbers you entered is " + sum); //outputs final sum
		
		input.close(); //closes system input

	}

}
