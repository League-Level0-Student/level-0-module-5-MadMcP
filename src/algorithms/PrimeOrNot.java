package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean flag = false;
		String number = JOptionPane.showInputDialog("Pick a number");
		int n = Integer.parseInt(number);
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				flag = true;
			}
		}
		if (flag==false) {
			JOptionPane.showMessageDialog(null, "You number is a prime number.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is not a prime number.");
		}
	}
}
