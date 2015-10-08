import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotOctagon {
	public static void main(String[] args) {
		Robot octo = new Robot();
		octo.penDown();
		octo.setSpeed(10);
		String answer = JOptionPane.showInputDialog("What shape would you like?");
		if (answer.equalsIgnoreCase("octagon"))
			for (int i = 0; i < 9; i++) {
				octo.move(50);
				octo.turn(360 / 8);
			}
		if (answer.equalsIgnoreCase("square")) {
			for (int i = 0; i < 5; i++) {
				octo.move(50);
				octo.turn(360 / 4);
			}
		}
		if (answer.equalsIgnoreCase("triangle")) {
			for (int i = 0; i < 4; i++) {
				octo.move(50);
				octo.turn(360 / 3);
			}
		}
	}
}
