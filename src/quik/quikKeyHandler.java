package quik;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

class Main {
	public static void main(String[] args) {
		
	}
}

public class quikKeyHandler extends KeyAdapter {
	public static boolean keyPressed = false;
	public char keyCode = '/';
	public boolean keyRunBoolean = true;
	
	
	public void keyPressed(KeyEvent evt) {
		if (evt.getKeyChar() == 'a') {
			System.out.println("Check for key characters: " + evt.getKeyChar());
		}
		if (evt.getKeyCode() == KeyEvent.VK_HOME) {
			System.out.println("Check for key codes: " + evt.getKeyCode());
		}
	}

}
