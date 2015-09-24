import javax.swing.JOptionPane;

public class Awesome {
public static void main(String[] args) {
	String thing=JOptionPane.showInputDialog("Say something random");
	JOptionPane.showInputDialog(null, thing+" is awesome!");
}
}
