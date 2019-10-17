package world;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Dimension resolution;
	
	public MainWindow(int width, int height) {
		this.resolution = new Dimension(width, height);
		
		this.setSize(this.resolution);
		this.add(new JLabel("YO"));
		this.setVisible(true);
		
		System.out.println("Lol");
	}
}
