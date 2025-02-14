/*
 * Joshua Bazaldua, Assignment 3: Multiples of Ten program
 */
public class MultiplesOfTen {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 1000; i += 10) { //for loop that ends when i is equal or greater than 1000
			System.out.print(i + " "); //prints number along with 10
			
			if (i % 100 == 0) { //prints new line when remainder is 0
				System.out.println();
			}
		}

	}

}
