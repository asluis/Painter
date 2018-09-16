
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class inputHandler implements MouseListener, MouseMotionListener{

	//The x and y locations of the user's click
	private int x;
	private int y;
	//Will return a true/false answer if the mouse is/isn't pressed
	private boolean isClicked = false; 
	
	private ArrayList<Integer> xHistory = new ArrayList<Integer>();
	private ArrayList<Integer> yHistory = new ArrayList<Integer>();
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean getIsClicked() {
		return this.isClicked;
	}
	
	//Stores the user's previous changes to the panel so they aren't lost when
	//the panel refreshes
	private void updateHistories() {
		xHistory.add(this.x);
		yHistory.add(this.y);
	}
	
	
	//Lets the xHistory list be accessed outside of the inputHandler class
	public ArrayList<Integer> getXHistory(){
		return this.xHistory;
	}
	
	//Lets the yHistory list be access outside of the inputHandler class
	public ArrayList<Integer> getYHistory(){
		return this.yHistory;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0){}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();	
		isClicked = true;
		System.out.println("MOUSE PRESSED AT: " + "(" + x + ", " + y + ")");
		updateHistories();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		isClicked = false;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(isClicked) {
			x = e.getX();
			y = e.getY();
			updateHistories();
			System.out.println("PRESSED AND DRAGGED"); //TODO: remove
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}