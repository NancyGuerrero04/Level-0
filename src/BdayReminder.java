 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 19th";
		String dadsBirthday = "March 9th";
		String myBirthday = "January 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String person = JOptionPane.showInputDialog("Who's birthday are you seeking?");
		// 3. Print out what the user typed
		//JOptionPane.showMessageDialog(null, person);
		// 4. if user asked for "mom"
		if (person.equalsIgnoreCase("mom")) {
			//print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if(person.equalsIgnoreCase("dad")) {
			// print dad's birthday
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		else if(person.equalsIgnoreCase("mine")){
			// print myBirthday
			JOptionPane.showMessageDialog(null, myBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't recall that person's birthday!");
		}
	} 
}
