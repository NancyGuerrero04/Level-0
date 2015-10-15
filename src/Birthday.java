import javax.swing.JOptionPane;

public class Birthday {
public static void main(String[] args) {
	String day = JOptionPane.showInputDialog("When's your birthday?");
	if(day.equals("10/14")){
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}else{
		JOptionPane.showMessageDialog(null, "Happy (UN) Birthday!");
	}
	
}
}