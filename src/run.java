import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

import quik.*;

public class run implements KeyListener {
	
	static quikDraw qD = new quikDraw(true);
	static quikIO qIO = new quikIO(System.getProperty("user.dir") + "\\src");
	static quikMath qM = new quikMath();

	static int playerx = 100;
	static int playery = 100;

	static int speed = 10;
	
	static boolean runBoolean = true;
	static boolean keyPressed = false;
	static boolean[] keys = new boolean[222];
	
	static run key;
	
	static Image koopa = qIO.imagePath("54.png");
	
	public static void main(String[] args) throws FileNotFoundException {
		key = new run();
		
		// setup
		qD.setWindow(800, 600, "quik");
		qD.backgroundColor(100, 10, 13);
		qIO.getJFrame().addKeyListener(key);
		
		startDraw();
	}

	public static void startDraw() {
		while (runBoolean) {
			draw();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void draw() {
		qD.drawRect(playerx, playery, 20, 20);
		qD.drawText("y: "+playerx, 0, 10);
		qD.drawText("x: "+playery, 0, 10);
	
		playerx++;
		
		if(keys[39] == true) {
			playerx+=speed;
			qIO.println("right");
		}
		
		if(keys[37] == true) {
			playerx-=speed;
			qIO.println("left");
		}
		
		if(keys[38] == true) {
			playery+=speed;
			qIO.println("up");
		}
		
		if(keys[40] == true) {
			playery-=speed;
			qIO.println("down");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}
	
