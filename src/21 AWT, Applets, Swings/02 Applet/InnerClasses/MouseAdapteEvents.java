import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=MouseAdapteEvents width=300 height=150></applet> */
public class MouseAdapteEvents extends Applet
 {
	 String msg = "";
	 public void init() 
	 {
		 addMouseListener(new MouseHandler());
		 addMouseMotionListener(new MouseMotionHandler());
	 }
	 public void paint(Graphics g) 
	 {
		 g.setFont(new Font("Arial",Font.BOLD,40));
		 g.setColor(Color.blue);
		 g.drawString(msg,50,50);
	 }
	class MouseHandler extends MouseAdapter 
	{
		public void mouseEntered(MouseEvent me)
		{
		msg = "mouse entered.";
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e){}
		repaint();
	}
	public void mouseExited(MouseEvent me) 
	{
		msg = "mouse exited.";
		repaint();
	}
	public void mousePressed(MouseEvent me) 
	{
		msg = "mouse pressed.";
		repaint();
	}
	public void mouseReleased(MouseEvent me) 
	{
		msg = "mouse released.";
		repaint();
	}
	/*public void mouseClicked(MouseEvent me) 
	{
		msg = "mouse clicked at (" + me.getX() + "," + me.getY() + ").";
		repaint();
	}*/
}
class MouseMotionHandler extends MouseMotionAdapter 
{
	public void mouseMoved(MouseEvent me) 
	{
		msg = "mouse moving at (" + me.getX() + "," + me.getY() + ").";
		repaint();
	}
	public void mouseDragged(MouseEvent me) 
	{
		msg = "mouse dragging at (" + me.getX() + "," + me.getY() + ").";
		repaint();
	}
}
}