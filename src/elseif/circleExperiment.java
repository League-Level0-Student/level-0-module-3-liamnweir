package elseif;

import org.jointheleague.graphical.robot.Robot;

public class circleExperiment {
public static void main(String[] args) {
	Robot rob=new Robot();
	rob.penDown();
	rob.setSpeed(1000);
	rob.miniaturize();
	rob.setAngle(0);
	for (int i = 0; i < 360; i++) {
		
	rob.move(1);
	rob.turn(1);
}
}}
