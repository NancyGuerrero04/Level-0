import javax.swing.JOptionPane;

public class LastSummer {
	
public static void main(String[] args) {
	

String name = JOptionPane.showInputDialog("What is your name?");
String hobby = JOptionPane.showInputDialog("What's your hobby?");

JOptionPane.showMessageDialog(null, "Interesting " + name + ", I know you went " + hobby + " last summer.");
}

}