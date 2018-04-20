package quik;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class quikKeyHandler implements KeyListener {
	public static boolean quikKeyPressed = false;
	public char keyCode = '/';
	public boolean keyRunBoolean = true;
	
	static quikKeyHandler quikKeyboard;
	
	String asd = null;
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public static void main(String[] args) {
		quikKeyboard = new quikKeyHandler();
		quikDraw.window.addKeyListener(quikKeyboard);
	}

}
