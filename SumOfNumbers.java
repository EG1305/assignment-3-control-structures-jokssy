/*
 * Joshua Bazaldua, Assignment 3: Sum of Numbers
 */
import java.util.Scanner; //import library to use scanenr to take user input
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //allows system to take input
		
		//display program purpose
		System.out.println("This program will add all the numbers from 1 to the number you enter");
		
		//prompts user for input
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		//tells user what they entered
		System.out.println("You entered: " + num);
		
		int sum = 0; //placeholder for sum
		
		//loop to sum numbers from 1 to num
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		//display sum from 1 to num
		System.out.println("The sum of all numbers from 1 to " + num + " is " + sum);
		
		input.close(); //closes system input

	}

}
