import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {

	inputHandler mouse;
	
	public ClearButtonListener(inputHandler io) {
		this.mouse = io;
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mouse.clearScreen();
	}

}
