package elseif;

import java.awt.Shape;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
public static void main(String[] args) {
	






String answer=JOptionPane.showInputDialog("What shape do you want? Circle, square or triangle?");



if ("circle".equals(answer.equalsIgnoreCase(null))) {
	drawCircle();
	
}

if ("triangle".equals(answer.equalsIgnoreCase(null))) {
	drawTriangle();

}

if ("square".equals(answer.equalsIgnoreCase(null))) {
	drawSquare();

}

}



static void drawSquare() {
	
	Robot rob=new Robot();
	String color=JOptionPane.showInputDialog("What color do you want this shape to be; red, green, or blue?");
	if ("red".equals(color)) {
		rob.setPenColor(300, 0, 0);
	}
		
		if ("green".equals(color)) {
			rob.setPenColor(0, 300, 0);
		}
			if ("blue".equals(color)) {
				rob.setPenColor(0, 0, 300);
			}
	rob.setSpeed(20);
	rob.miniaturize();
	rob.setAngle(0);
	rob.penDown();
	rob.move(90);
	rob.turn(90);
	rob.move(90);
	rob.turn(90);
	rob.move(90);
	rob.turn(90);
	rob.move(90);
	rob.turn(90);
}

static void drawTriangle() {
	Robot rob=new Robot();
	String color=JOptionPane.showInputDialog("What color do you want this shape to be; red, green, or blue?");
	if ("red".equals(color)) {
		rob.setPenColor(300, 0, 0);
	}
		
		if ("green".equals(color)) {
			rob.setPenColor(0, 300, 0);
		}
			if ("blue".equals(color)) {
				rob.setPenColor(0, 0, 300);
			}
	rob.penDown();
	rob.setSpeed(20);
	rob.miniaturize();
	rob.setAngle(30);
	rob.move(90);
	rob.turn(120);
	rob.move(90);
	rob.turn(120);
	rob.move(90);
	
}

static void drawCircle() {
	Robot rob=new Robot();
	String color=JOptionPane.showInputDialog("What color do you want this shape to be; red, green, or blue?");
	if ("red".equals(color)) {
		rob.setPenColor(300, 0, 0);
	}
		
		if ("green".equals(color)) {
			rob.setPenColor(0, 300, 0);
		}
			if ("blue".equals(color)) {
				rob.setPenColor(0, 0, 300);
			}
	rob.penDown();
	rob.setSpeed(1000);
	rob.miniaturize();
	rob.setAngle(0);
	for (int i = 0; i < 360; i++) {
		
	rob.move(1);
	rob.turn(1);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
}
