/*
 * Joshua Bazaldua, Assignment 3: Speed Detector 2 program
 */
import javax.swing.JOptionPane; //import library to use dialog boxes and take user input
public class SpeedDetector2 {

	public static void main(String[] args) {
		
		String input; //string placeholder
		input = JOptionPane.showInputDialog("Please enter your speed"); //prompts user to enter speed
		int speed = Integer.parseInt(input); //converts string to integer
		
		JOptionPane.showMessageDialog(null, "Your speed is " + speed); //shows their speed
		
		if (speed > 60) { //if speed greater than 60, displays warning message saying to slow down
			JOptionPane.showMessageDialog(null, "Slow down! Drive safe.", "Ticket warning", JOptionPane.WARNING_MESSAGE);
		}
		else { //if speed less than 60, congratulates the driver for driving safe
			JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
		}
		System.exit(0);

	}

}
