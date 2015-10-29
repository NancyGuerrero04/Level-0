import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Soundtrack To Life", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "In Love" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 0) {
			playVideo("https://www.youtube.com/watch?v=ZbZSe6N_BXs");
		}
		// 4. Play different songs for other moods.
		else if (userMood == 1) {
			playVideo("https://www.youtube.com/watch?v=iN9CjAfo5n0");
		} else if (userMood == 2) {
			playVideo("https://www.youtube.com/watch?v=B8FTyEdLjqA");
		}
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
