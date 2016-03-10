import javax.swing.JOptionPane;


public class Horoscopes {
	public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What is your horoscope?");
if (answer.equalsIgnoreCase("Libra")){
	JOptionPane.showMessageDialog(null, "You will encounter a new friend this week!");

}else if (answer.equalsIgnoreCase("Scorpio")){
	JOptionPane.showMessageDialog(null, "You have many hidden talents!");

}else if(answer.equalsIgnoreCase("Aries")){
	JOptionPane.showMessageDialog(null, "You have a deep secret you're hidding..");
}else if(answer.equalsIgnoreCase("Taurus")){
	JOptionPane.showMessageDialog(null, "You will find a new food-interest this week!");
}else if(answer.equalsIgnoreCase("Cancer")){
	JOptionPane.showMessageDialog(null, "Something sweet will come your way");
}else if(answer.equalsIgnoreCase("Pisces")){
	JOptionPane.showMessageDialog(null, "You will encounter a difficulty this week, but it will lead to happiness and success.");
}else if(answer.equalsIgnoreCase("Capricorn")){
	JOptionPane.showMessageDialog(null, "A lot of positive news will come your way this year!");
}else if(answer.equalsIgnoreCase("Gemini")){
	JOptionPane.showMessageDialog(null, "Keep your head up, your struggles will come to an end");
}else if(answer.equalsIgnoreCase("Virgo")){
	JOptionPane.showMessageDialog(null, "Your wishes will come true this week");
	
}else if(answer.equalsIgnoreCase("Aquarius")){
	JOptionPane.showMessageDialog(null, "Money will come into your pockets this week!");
}else if(answer.equalsIgnoreCase("Sagitarius")){
	JOptionPane.showMessageDialog(null, "Your nice deeds will pay back!");
}
}
}
