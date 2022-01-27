import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* Handling the events in the same class by implementing interface methods 
  <applet code=DrawFigure1 width=600 height=400></applet> */

public class DrawFigure1 extends Applet implements MouseListener, MouseMotionListener {
  int x, y;

  public void init() {
	addMouseListener(this);
	addMouseMotionListener(this);
   }

   public void mouseReleased(MouseEvent me) { }
   public void mouseEntered(MouseEvent me) { }
   public void mouseExited(MouseEvent me) { }
   public void mouseClicked(MouseEvent me) { }
   public void mousePressed(MouseEvent me) { 
	x = me.getX();
	y = me.getY();
   }

   public void mouseMoved(MouseEvent me) { }
   public void mouseDragged(MouseEvent me) { 
	Graphics g = getGraphics();
	g.setColor(Color.red);
	g.drawLine(x,y,me.getX(),me.getY());
	x = me.getX();
	y = me.getY();
   }
}
