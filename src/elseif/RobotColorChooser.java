//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2=new Robot();
	for (int i = 1; i < 5; i++) {
		
		//3. Ask the user what color they would like the robot to draw
	String r =	JOptionPane.showInputDialog("What color would you like?");

		//5. Use an if/else statement to set the pen color that the user requested
if (r.equals("red")) {
	r2d2.setPenColor(Color.red);
}
if (r.equals("green")) {
	r2d2.setPenColor(Color.green);
}
if (r.equals("blue")) {
	r2d2.setPenColor(Color.BLUE);
}
        //6. If the user doesn’t enter anything, choose a random color
if (r.equals("")) {
	r2d2.setPenColor(Color.black);
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r2d2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
r2d2.setSpeed(10);
r2d2.miniaturize();
r2d2.penDown();
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(100);

	}
	}
}
