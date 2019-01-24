package elseif;

import java.awt.Shape;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
public static void main(String[] args) {
	Robot rob=new Robot();
	rob.setSpeed(20);
	rob.miniaturize();
	rob.setAngle(0);
	



JOptionPane.showInputDialog("What color do you want this shape to be; red, green, or blue?");


String answer=JOptionPane.showInputDialog("What shape do you want? Circle, square or triangle?");
int shape=Integer.parseInt(answer);
System.out.println(shape);

if (shape==("circle")) {
	drawCircle();
	
}

if (shape.equals("triangle")) {
	drawTriangle();

}

if (shape.equals("square")) {
	drawSquare();

}

}



void drawSquare() {
	Robot rob=new Robot();
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

void drawTriangle() {
	Robot rob=new Robot();
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

void drawCircle() {
	Robot rob=new Robot();
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
