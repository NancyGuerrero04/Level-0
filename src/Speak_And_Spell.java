import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class Speak_And_Spell {
	public static void main(String[] args) {
		int score=0;
		String word;
			// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
for (int i = 0; i < 3; i++) {
if(i==0){
	word="mandlebrot";
	
}else if(i==1){
	word="anxiety";
}else{
	word="acknowledgement";
}
		speak(word);
		// 2. Catch the user's answer in a String
String answer = JOptionPane.showInputDialog("Spell the word said.");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase (word)){
	speak("Correct.");
	score++;
}else{
	speak("Incorrect");
	score--;
}
}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
JOptionPane.showMessageDialog(null, "You're total score is" + score);
	
	}
	
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

