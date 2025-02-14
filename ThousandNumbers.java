/*
 * Joshua Bazaldua, Assignment 3: Thousand Numbers program
 */
public class ThousandNumbers {

	public static void main(String[] args) {
		
		int num = 1; // start with 1
		
		while (num <= 1000) {
			System.out.print(num + " "); //prints number along with space
			
			if (num % 10 == 0) {
				System.out.println();
			}
			
			num++; //increments number after each iteration
			
		}

	}

}
