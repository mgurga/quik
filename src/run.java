import quik.*;

@SuppressWarnings("serial")
public class run extends quikDraw
{
  public static void main(String[] args)
  {
    quikDraw qD = new quikDraw();
    qD.setWindow(800, 600, "quik");
    qD.drawLine(50, 100, 150, 100);
    qD.drawRect(20, 20, 100, 100);
    
  }
}
