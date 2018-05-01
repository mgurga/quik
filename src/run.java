import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

import quik.*;

public class run implements KeyListener {
	
	static quikDraw qD = new quikDraw();
	static quikIO qIO = new quikIO(System.getProperty("user.dir") + "\\src");
	static quikMath qM = new quikMath();

	static int playerx = 100;
	static int playery = 100;

	static boolean runBoolean = true;
	static boolean keyPressed = false;
	
	static run key;
	
	static Image koopa = qIO.imagePath("54.png");
	
	public static void main(String[] args) throws FileNotFoundException {
		key = new run();
		
		// setup
		qD.backgroundColor(100, 0, 0);
		qD.setWindow(800, 600, "quik");
		qD.drawLine(50, 100, 150, 100);
		qD.drawRect(20, 20, 100, 100);
		qD.drawImage(koopa, 100, 100);
		qD.drawText("hello", 200, 200);
		qIO.getJFrame().addKeyListener(key);
		
		qIO.printList(qIO.loadTextFile("example.txt"));
		
		startDraw();
	}

	public static void startDraw() {
		while (runBoolean) {
			draw();
			qIO.getJFrame().revalidate();
			qIO.getJFrame().repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void draw() {
		qD.drawText( "hi", playerx, 10);
		playerx++;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		qIO.println(e.getKeyCode() + "");
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			playery++;
			qIO.println("up");
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			playery--;
			qIO.println("down");
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			playerx++;
			qIO.println("right");
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			playerx--;
			qIO.println("left");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	
