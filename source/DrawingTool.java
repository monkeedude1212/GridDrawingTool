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
		
		mapElement me = new mapElement(300, 300, new ImageIcon("missingImage.png").getImage());
		MapPanel mp = new MapPanel();
		mp.setMapElements(me);
		f.add(mp);
		
		f.pack();		
		f.setVisible(true);

		f.repaint();


	}
}

class MapPanel extends JPanel{
	mapElement mapEl;

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
		return new Dimension(640,480);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		// Draw map element
		mapEl.paintElement(g, this);
	}

	public void setMapElements(mapElement me){
		mapEl = me;
	}
}
