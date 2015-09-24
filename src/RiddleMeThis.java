import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable Ïto hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String riddle = JOptionPane.showInputDialog("I can only live where there is light, but I die if the light shines on me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equalsIgnoreCase("a shadow")){
	JOptionPane.showMessageDialog (null, "Correct.");
score = score + 1;
		// 5. Otherwise, say "wrong" and tell them the answer
}else{
	JOptionPane.showMessageDialog(null, "You're dumb.");
	score = score - 1;
}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("I have keys but no locks. I have space but no room. You can enter, but you can't go outside. What am I?");
if(riddle2.equalsIgnoreCase("a keyboard")){
	JOptionPane.showInputDialog("Correct.");
score=score + 1;
	}else

	{
		JOptionPane.showMessageDialog(null, "You're dumb.");
score=score - 1;
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
}
