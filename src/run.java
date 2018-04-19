import java.awt.Image;
import java.io.IOException;

import quik.*;

@SuppressWarnings("serial")
public class run extends quikDraw
{
  static quikDraw qD = new quikDraw();
  static quikIO qIO = new quikIO(System.getProperty("user.dir") + "\\src");
  
  public static void main(String[] args)
  {
    qD.setWindow(800, 600, "quik");
    qD.drawLine(50, 100, 150, 100);
    qD.drawRect(20, 20, 100, 100);
    
    Image toView = qIO.imagePath("54.png");
    
    qD.drawImage(toView, 100, 100);
    
  }
}
