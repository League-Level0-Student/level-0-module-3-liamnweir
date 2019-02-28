
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 26th";
		String dadsBirthday = "October 5th";
		String myBirthday = "September 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer=JOptionPane.showInputDialog(null, "Which birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (answer.equals(momsBirthday)) {
			System.out.println("August 26th");
			System.exit(0);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if (answer.equals(dadsBirthday)) {
			System.out.println("October 5th");
			System.exit(0);
		}
		// 6. if user asked for your name
			// print myBirthday
		if (answer.equals(myBirthday)) {
			System.out.println("September 10th");
			System.exit(0);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	} 
}
