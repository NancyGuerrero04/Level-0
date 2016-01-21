// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Tortoise_Spiral_Maker {

	public static void main(String[] args) {
	
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		for (int j = 0; j < 4; j++) {
			
		
		String answer = JOptionPane.showInputDialog("Would you like a square, a triangle, or a pentagon?");
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		if (answer.equalsIgnoreCase ("triangle")) {
			sides=3;
		} else if (answer.equalsIgnoreCase("square")){
			sides=4;
		} else if( answer.equalsIgnoreCase("pentagon")){
			sides=5;
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw that..");
		}
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."

		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		int length=10;
		for (int i = 10; i < 200; i++) {
			Tortoise.setSpeed(10);
			Tortoise.penDown();
			Tortoise.move(i*4);
			Tortoise.turn(360/sides);
			length+=10;
		}
		
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}
}


