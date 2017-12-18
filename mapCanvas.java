import java.util.*;

public class mapCanvas{
	// mapCanvas is the object that holds all of the map elements, it defines
	// the coordinate system. It, however, does not render the map. That
	// responsibility is deligated to the camera and the rendering system.

	// TODO: Make a camera and rendering system.

	ArrayList<mapElement> mapElements;
	public mapCanvas(int x, int y){
		mapElements = new ArrayList<mapElement>();	

		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				mapElements.add( new mapElement(x, y));
			}
		}
	} 
}