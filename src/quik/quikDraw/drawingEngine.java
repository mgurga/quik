package quik.quikDraw;

import java.awt.Graphics;

public class drawingEngine
{
  public void paint(Graphics g)
  {
    for (int i = 0; i < quikDraw.lines; i++)
    {
      g.drawLine(quikDraw.linePos[i][0], quikDraw.linePos[i][1], quikDraw.linePos[i][2], quikDraw.linePos[i][3]);
    }
  }
}
