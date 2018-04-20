package quik;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class quikDraw extends Canvas
{
  static JFrame  window;
  static int     height            = -1;
  static int     width             = -1;
  static int     maxShapes         = 1000000;
  static String  windowName        = "DefaultName";
  static boolean windowInitialized = false;
  static int     lines             = -1;                   
  static int     rects             = -1;
  static Color   backgroundColor   = new Color(207,207,207);
  static int[][] linePos           = new int[maxShapes][4];
  static int[][] rectPos           = new int[maxShapes][4];
  static int images 			   = -1;
  static Image[] imageArr		   = new Image[maxShapes];
  	static int[] imagex			   = new int[maxShapes];
  	static int[] imagey			   = new int[maxShapes];
  //simply means how many lines there are
  //change linePos[][#] as more qualities are added
  //How positions are stored
  //at linePos[#][] where # is the number line it is
  //now linePos[][$] where the $ is the positions
  //if $ = 0 means x1
  //if $ = 1 means y1
  //if $ = 2 means x2
  //if $ = 3 means y2
  //if $ = x and so on as new things get added
  public void setWindow(int height, int width, String name)
  {
    if (windowInitialized == false)
    {
      if (height < 0 || width < 0)
      {
        System.out.println("Invalid window resolution");
      }
      else
      {
        quikDraw.height = height;
        quikDraw.width = width;
        windowName = name;
        initializeWindow();
      }
      System.out.println("Window initialized with width of " + width + " and height of " + height
          + " with the name of '" + name + "'");
    }
    else
    {
      System.out.println("Only one Windows at a time, closing...");
      System.exit(0);
    }
  }
  public static void main(String[] args)
  {
	  
  }
  private void initializeWindow()
  {
	windowInitialized = true;
    window = new JFrame(windowName);
    Canvas canvas = new quikDraw();
    window.setSize(quikDraw.height, quikDraw.width);
    window.add(canvas);
    window.setVisible(true);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.pack();
  }
  public void drawLine(int x1, int y1, int x2, int y2)
  {
    lines++;
    linePos[lines][0] = x1;
    linePos[lines][1] = y1;
    linePos[lines][2] = x2;
    linePos[lines][3] = y2;
  }
  
  public void drawRect(int x1, int y1, int xsize, int ysize)
  {
    rects++;
    rectPos[rects][0] = x1;
    rectPos[rects][1] = y1;
    rectPos[rects][2] = xsize;
    rectPos[rects][3] = ysize;
  }
  
  public void drawImage(Image image, int x, int y) {
	  images++;
	  imageArr[images] = image;
	  imagex[images] = x;
	  imagey[images] = y;
  }
  
  public void backgroundColor(int r, int g, int b) {
	  Color newBKColor = new Color(r,g,b);
	  window.getContentPane().setBackground(newBKColor);
  }
  
  public void backgroundColor(int rgb) {
	  Color newBKColor = new Color(rgb,rgb,rgb);
	  window.getContentPane().setBackground(newBKColor);
  }
  
  public void paint(Graphics g){
	  	
		for(int i = 0; i < lines+1; i++) {
			g.drawLine(linePos[i][0], linePos[i][1], linePos[i][2], linePos[i][3]);
		}
		for(int i = 0; i < rects+1; i++) {
			g.drawRect(rectPos[i][0], rectPos[i][1], rectPos[i][2], rectPos[i][3]);
		}
		for(int i = 0; i < images+1; i++) {
			g.drawImage(imageArr[i], imagex[i], imagey[i], null);
		}
		
	  
	}
}