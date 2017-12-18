import javax.swing.*;
import java.awt.*;

public class DrawingTool {
	JFrame theFrame;
	JPanel mainPanel; 	
	mapElement me;
	public static void main (String[] args){
		System.out.println("Map Painter Started");

		new DrawingTool().startUp();

	}

	public void startUp(){
		theFrame = new JFrame("Drawing Tool");
		mainPanel = new JPanel();
		theFrame.add(mainPanel);
		theFrame.setBounds(50,50,300,300);
		theFrame.setVisible(true);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me = new mapElement(10, 10);
	}

}