import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingTool {
	
	public static void main (String[] args){
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					createAndShowGUI();
				}
			}				
		);
	}
	
	private static void createAndShowGUI(){
		System.out.println("Created GUI on EDT? "+ SwingUtilities.isEventDispatchThread());
		JFrame f = new JFrame("Grid Drawing Tool");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mapCanvas canvas = new mapCanvas();
		canvas.add(new mapElement(10, 10));

		mapCamera cam = new mapCamera();
		mapPanel mp = new mapPanel(cam);
		mp.setMapCanvas(canvas);

		f.add(mp);
		
		f.pack();		
		f.setVisible(true);

		f.repaint();


	}
}

class mapPanel extends JPanel{
	mapCanvas canvas;
	mapCamera cam;

	public mapPanel(mapCamera camera){
		setBorder(BorderFactory.createLineBorder(Color.black));

		cam = camera;

		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				// do something
				//cam.tranformPixelCoords(e.getX(), e.getY());

			canvas.add(new mapElement(e.getX(), e.getY()));

			repaint();

			}
		});

		addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e){
				// do another thing
			}
		});
	}

	public Dimension getPreferredSize(){
		return new Dimension(640,480);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		// Draw map element
		for ( mapElement mapEl : canvas.getElements()){
			mapEl.paintElement(g, this);
		}
	}

	public void setMapCanvas(mapCanvas can){
		canvas = can;
	}
}
