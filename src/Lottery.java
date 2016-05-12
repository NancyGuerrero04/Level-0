import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Here are the winning lottery numbers..");
		for(int i=0; i < 5; i++){
		int ln = new Random().nextInt(100);
		System.out.println(ln);
	}
  }
}

