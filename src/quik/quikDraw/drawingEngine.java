package quik.quikDraw;

import java.awt.Graphics;

public class drawingEngine
{
  public void paint(Graphics g)
  {
    for (int i = 0; i < quikDraw.lines; i++)
    {
      g.drawLine(50, 100, 150, 100);
    }
  }
}
