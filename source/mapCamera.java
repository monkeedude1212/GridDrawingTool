import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mapCamera{
	
	double X;
	double Y;

	double scale; // In pixels per tile

	public mapCamera(){
		X = 0;
		Y = 0;
		scale = 100;
	}

	public void tranformPixelCoords(int x, int y){
		mapElement me = new mapElement(x, y, new ImageIcon("missingImage.png").getImage());
	}
}