import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiiti {
	public static void main(String[] args) {
		Robot womps= new Robot ();
		womps.penDown();
		womps.setPenWidth(40);
		womps.setSpeed(10);
		womps.setPenColor(200,300,500);
		womps.move(200);
		womps.setAngle(140);
		womps.move(360);
		womps.setAngle(-8);
		womps.move(200);
		womps.hide();
		
	}


}
