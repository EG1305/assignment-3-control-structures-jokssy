/*
 * Joshua Bazaldua, Assignment 3: Rice Chessboard program
 */
import java.math.BigInteger; //import library to hadnel very large numbers
public class RiceChessboard {
    
	public static void main(String[] args) {
    	
        int squares = 64; // total squares on a chessboard
        BigInteger riceOn64th = BigInteger.valueOf(1); // rice on the 64th square
        BigInteger totalRice = BigInteger.valueOf(1); // total rice on the board

        // start with 1 rice on the first square
        for (int i = 2; i <= squares; i++) {
            riceOn64th = riceOn64th.multiply(BigInteger.valueOf(2)); // Doubling for each square
            totalRice = totalRice.add(riceOn64th);
        }

        // output results
        System.out.println("Rice on the 64th square: " + riceOn64th);
        System.out.println("Total rice on the entire chessboard: " + totalRice);
    }
}
