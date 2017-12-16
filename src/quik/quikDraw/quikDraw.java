package quik.quikDraw;

import java.awt.Graphics;

import javax.swing.JFrame;

public class quikDraw
{
  static JFrame  window;
  static int     height            = -1;
  static int     width             = -1;
  static int     maxShapes         = 1000000;
  static String  windowName        = "DefaultName";
  static boolean windowInitialized = false;
  static int     lines             = -1;                   //simply means how many lines there are
  static int[][] linePos           = new int[maxShapes][4];//change linePos[][#] as more qualities are added
  //How positions are stored
  //at linePos[#][] where # is the number line it is
  //now linePos[][$] where the $ is the positions
  //if $ = 0 means x1
  //if $ = 1 means x2
  //if $ = 2 means y1
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
	  window.getContentPane().add(new drawingEngine());
    window = new JFrame(windowName);
    window.setSize(height, width);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void newLine(int x1, int y1, int x2, int y2)
  {
    lines++;
    linePos[lines][0] = x1;
    linePos[lines][1] = y1;
    linePos[lines][2] = x2;
    linePos[lines][3] = y2;
  }
  public void paint(Graphics g) {
	  g.drawLine(10, 10, 200, 300);
  }
}
