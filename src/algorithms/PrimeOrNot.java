package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(
				"Give me a random number!*Be careful I will be asking you a question about it later!*");
		String primer = JOptionPane.showInputDialog("Is " + number + " prime or not?");
		int prime = Integer.parseInt(number);
		boolean primerr = false;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
primerr=true;
			}
		} 
		if (primerr==true) { 
			JOptionPane.showMessageDialog(null, +prime+" is NOT prime.");
		} 
		else { 
			JOptionPane.showMessageDialog(null, +prime+" IS prime.");
		}

	}
}
