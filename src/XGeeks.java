import javax.swing.JOptionPane;

public class XGeeks {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			String name = JOptionPane.showInputDialog(null, "Who's power do you want to know?");
			if (name.equalsIgnoreCase("Gerry")) {
				JOptionPane.showMessageDialog(null, "Gerry is the fastest typer!");

			} else if (name.equalsIgnoreCase("Diego")) {
				JOptionPane.showMessageDialog(null, "Diego is the best at last minute projects!");

			} else if (name.equalsIgnoreCase("Noelani")) {
				JOptionPane.showMessageDialog(null, "Adaptability!");
			} else {
				JOptionPane.showMessageDialog(null, "Being amazing!");
			}
		}
	}
}