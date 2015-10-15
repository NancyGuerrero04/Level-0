
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 6; i++) {
		String color = JOptionPane.showInputDialog("What color would you like to see?");

		// 4. use an if/else statement to set the pen color that the user
		// requested
		

			if (color.equalsIgnoreCase("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			} else if (color.equalsIgnoreCase("red")) {
				Tortoise.setPenColor(Color.RED);
			} else if (color.equalsIgnoreCase("green")) {
				Tortoise.setPenColor(Color.GREEN);

				// 5. if the user doesn’t enter anything, choose a random color
			} else {
				Tortoise.setPenColor(Colors.getRandomColor());
				;
			}
			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setAnimal(Animals.Unicorn);
			Tortoise.setPenWidth(10);
			Tortoise.setSpeed(6);
			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)
			for (int j = 0; j < 4; j++) {
				Tortoise.move(100);
				Tortoise.turn((360 / 4));
			}
		}
	}
}
