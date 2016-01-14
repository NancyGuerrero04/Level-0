import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?");
	int realheight = Integer.parseInt(height);
	if (realheight > 4) {
		JOptionPane.showMessageDialog(null, "You can ride!");
		
	}else {
		JOptionPane.showMessageDialog(null, "Sorry, you can't ride..");
	}
}
}
