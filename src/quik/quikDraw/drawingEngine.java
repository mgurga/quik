package quik.quikDraw;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class drawingEngine extends JPanel
{
	public void paint(Graphics g){
		g.drawRect(10, 10, 100, 100);	
	}
}
