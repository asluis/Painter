import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen{

	private static final int HEIGHT = 600; //In pixels
	private static final int WIDTH = 800; //In pixels
	private static final int THICKNESS = 5; //Radius of the circles made by the user
	

	private inputHandler mouse = new inputHandler();
	private PaintableScreen Screen = new PaintableScreen(THICKNESS, mouse);
	//Initializes the frame and the PaintableScreen
	public Screen() {
		
		JFrame frame = new JFrame("Painter by Luis Alvarez Sanchez");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		Screen.addMouseListener(mouse);
		Screen.addMouseMotionListener(mouse);
		Screen.setFocusable(true);
		frame.getContentPane().add(Screen);

	}
}