import java.awt.*;
import javax.swing.*;

public class mapElement{
	public mapElement(int x, int y){
		X = x;
		Y = y;
	}

	public mapElement(int x, int y, Image image){
		X = x;
		Y = y;
		img = image;
	}	
	// A map element is anything that has an X and Y location as defined by the
	// mapCanvas. Many map elements will also have a rotation (and maybe a
	// center of rotation), but that is not a requirement.

	// Maybe this should be an int? I'm not sure, the int could represent its
	// location in terms of grid coordinates, but a double easily lets you turn
	// of grid snapping. I suspect a double is the way to go, and enforce grid
	// snapping elsewhere in the code.
	double X;
	double Y;

	public double getX(){
		return X;
	}

	public void setX( double newX ){
		X = newX;
	}

	public double getY(){
		return Y;
	}
	
	public void setY( double newY ){
		Y = newY;
	}

	// Some mapElements may not be renderable, such as light objects (i.e. for
	// use with dynamic lighting). This would mean that they would need to be
	// able to be "turned off" when creating the final image of the map. This
	// flag is to determine which elements are to be rednered or not.
	boolean isRenderable = true;

	public boolean getRenderable(){
		return isRenderable;
	}

	public void setRenderable(boolean newRend){
		isRenderable = newRend;
	}

	// Whether or not the element is able to be rendered, there needs to be some
	// sort of sprite associated with the element, so that it can be seen while
	// it is being placed is the canvas.
	Image img = new ImageIcon("missingImage.png").getImage();

	public Image getImg(){
		return img;
	}

	public void setImg(Image image){
		img = image;
	}

	public void paintElement(Graphics g, MapPanel mp){
		g.drawImage(this.img, (int) X, (int) Y, mp);
	}
	

}