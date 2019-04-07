package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

	SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int d = Integer.parseInt(dimes);
		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + d*10 + " cents");
		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("In inches, how tall are you?");
		int h = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (h < 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console 
		Random r = new Random();
		int m = r.nextInt(20);
		System.out.println(m);
		// Get another random number that is less than 10 and print it to the console 
		Random R = new Random();
		int M = R.nextInt(10);
		System.out.println(M);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
		JOptionPane.showMessageDialog(null, m - M);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in 
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City 
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City");
		}
		// Otherwise, tell them to move to San Diego 
		else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
		String cars = JOptionPane.showInputDialog("How many cars do you have?");
		int c = Integer.parseInt(cars);
		if (c == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transport");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car 
		else if (c == 1) {
			String m = JOptionPane.showInputDialog("What model is your car?");
			JOptionPane.showMessageDialog(null, m);
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
		else {
			JOptionPane.showMessageDialog(null, c*4 + " wheels");
		}


	}

	void skill5() { // In a pop-up, ask the user for the name of their school 
		String school = JOptionPane.showInputDialog("What's the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
		JOptionPane.showMessageDialog(null, school + " is a great school!");
	}
}