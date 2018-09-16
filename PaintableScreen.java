import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintableScreen extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int thickness; //The radius of the circle created when the user clicks
	
	//Helps associates the input with the screen
	private inputHandler mouse;
	
	
	
	
	//Sets the thickness of the 'pen' and the background color (white)
	//Also initializes the inputHandler
	public PaintableScreen(int Thickness, inputHandler mouse) {
		this.mouse = mouse;
		this.thickness = Thickness;
		super.setBackground(Color.WHITE);
	}
	
	//Will put the thread to sleep for a certain amount of milliseconds.
	private static void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch(Exception e){
			System.out.println("There was an error: " + e + "\nThe program will now exit");
			System.exit(ABORT);
		}	
	}
	
	//Paints everything the user does on the JPanel
	//Assumes the lists of x and y components are identical in length
	private void paintBrush(Graphics g) {
		g.setColor(Color.BLUE);
		int length = mouse.getXHistory().size(); //Gets the length of the x/y ArrayLists
		for(int i = 0; i < length;i++) {
			g.fillOval(mouse.getXHistory().get(i), mouse.getYHistory().get(i), thickness, thickness);
		}
	}
	
	//Will paint the JPanel accordingly. 
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintBrush(g);
		//wait(2);
		repaint();
	}	
}