import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String catnum = JOptionPane.showInputDialog("How many cats do you have?");

		// 2. Convert their answer into an int
		int nummy = Integer.parseInt(catnum);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (nummy>3){
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
		
		}else if(nummy<3){
			playVideo("https://www.youtube.com/watch?v=J---aiyznGQ"); 
		}else if(nummy==0){
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
	
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

