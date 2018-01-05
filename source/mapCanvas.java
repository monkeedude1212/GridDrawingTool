import java.util.*;

public class mapCanvas{
	// mapCanvas is the object that holds all of the map elements, it defines
	// the coordinate system. It, however, does not render the map. That
	// responsibility is deligated to the camera and the rendering system.

	// TODO: Make a camera and rendering system.

	// The width and height are experessed in the number of 
	// tiles, from zero. Zero height is the bottom of the map, 
	// zero width is the left most edge of the map. 
	double width;
	double height;

	ArrayList<mapElement> mapElements;

	public mapCanvas(){
		width = 10;
		height = 10;
		mapElements = new ArrayList<mapElement>();
	} 

	public void add(mapElement me){
		mapElements.add(me);
	}

	public ArrayList<mapElement> getElements(){
		return mapElements;
	}

}