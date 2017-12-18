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
		f.add(new MapPanel());
		f.pack();		
		f.setVisible(true);
		mapElement me = new mapElement(10, 10);
	}
}

class MapPanel extends JPanel{
	public MapPanel(){
		setBorder(BorderFactory.createLineBorder(Color.black));
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				// do something
			}
		});

		addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e){
				// do another thing
			}
		});
	}

	public Dimension getPreferredSize(){
		return new Dimension(250,200);
	}
}