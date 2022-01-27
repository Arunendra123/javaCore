import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=MouseEventsDemo1 width=700 height=150></applet> */

public class MouseEventsDemo1 extends Applet implements MouseListener,  MouseMotionListener {
  String msg = "";

  public void init() {
	addMouseListener(this);
	addMouseMotionListener(this);
   }

   public void paint(Graphics g) {
	g.setFont(new Font("Ariel",Font.BOLD,24));
	g.setColor(Color.red);
	g.drawString(msg,50,50);
   }

         public void mouseEntered(MouseEvent me) {
	msg = "mouse entered.";
	repaint();
         }

         public void mouseExited(MouseEvent me) {
	msg = "mouse exited.";
	repaint();
         }

         public void mousePressed(MouseEvent me) {
	msg = "mouse pressed.";
	repaint();
         }

         public void mouseReleased(MouseEvent me) {
	msg = "mouse released.";
	repaint();
         }

         public void mouseClicked(MouseEvent me) {
	msg = "mouse clicked at (" + me.getX() + "," + me.getY() + ").";
	repaint();
         }

         public void mouseMoved(MouseEvent me) {
	msg = "mouse moving at (" + me.getX() + "," + me.getY() + ").";
	repaint();
         }

         public void mouseDragged(MouseEvent me) {
	msg = "mouse dragging at (" + me.getX() + "," + me.getY() + ").";
	repaint();
         }
}