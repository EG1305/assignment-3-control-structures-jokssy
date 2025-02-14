/*
 * Joshua Bazaldua, Assignment 3: Speed Detector program
 */

import javax.swing.JOptionPane; //import library to use dialog boxes and take user input
public class SpeedDetector {

	public static void main(String[] args) {
		
		String input; //string placeholder
		input = JOptionPane.showInputDialog("Please enter your speed"); //prompts user to enter speed
		int speed = Integer.parseInt(input); //converting string to integer
		
		JOptionPane.showMessageDialog(null, "Your speed is " + speed); //shows their speed
		
		if (speed > 60) { //if speed greater than 60, displays warning message
			JOptionPane.showMessageDialog(null, "Slow down! Drive safe.", "Ticket warning", JOptionPane.WARNING_MESSAGE);
		}
		
		System.exit(0); //exits system
	}

}
