package quik.quikDraw;

import javax.swing.JFrame;

public class quikDraw extends JFrame{
	static JFrame window;
	static int height = -1;
	static int width = -1;
	static int maxShapes = 1000000;
	static String windowName = "DefaultName";
	static boolean windowInitialized = false;
	int lines = 0;//simply means how many lines there are
	int[][] linePos = new int[maxShapes][4];//change linePos[][#] as more qualities are added
	//How positions are stored
	//at linePos[#][] where # is the number line it is
	//now linePos[][$] where the $ is the positions
	//if $ = 0 means x1
	//if $ = 1 means x2
	//if $ = 2 means y1
	//if $ = 3 means y2
	//if $ = x and so on as new things get added

	public void setWindow(int height, int width, String name) {
		if(windowInitialized == false) {
		if(height < 0||width < 0) {
			System.out.println("Invalid window resolution");
		} else {
			quikDraw.height = height;
			quikDraw.width = width;
			windowName = name;
			windowInitialized = true;
			initializeWindow();
		}
		System.out.println("Window initialized with width of "+ width + " and height of "+height+" with the name of '"+name+"'");
		} else {
			System.out.println("Only one Windows at a time, closing...");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		if(windowInitialized == true) {
			for(;;) {
				window.repaint();
			}
		}
	}
	private void initializeWindow() {
		window = new JFrame(windowName);
		window.setSize(height, width);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
