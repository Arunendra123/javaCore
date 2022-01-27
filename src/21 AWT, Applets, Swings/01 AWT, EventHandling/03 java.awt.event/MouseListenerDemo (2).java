/* 
This program demonstrates MouseListener.

	MouseListener Interface Methods:
	- public abstract void mouseClicked(java.awt.event.MouseEvent);
	- public abstract void mousePressed(java.awt.event.MouseEvent);
	- public abstract void mouseReleased(java.awt.event.MouseEvent);
	- public abstract void mouseEntered(java.awt.event.MouseEvent);
	- public abstract void mouseExited(java.awt.event.MouseEvent);
*/

import java.awt.*;
import java.awt.event.*;

class MouseListenerDemo extends Frame implements MouseListener 
{
	Font f;
	String msg = "";
	int x, y;

	MouseListenerDemo()
	{
		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("MouseListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		addMouseListener(this);
		x=50;
		y=50;
		msg="Hello";
		setSize(300, 300);
		setVisible(true);
	}
	public void mouseClicked(java.awt.event.MouseEvent me) 
	{
		x = me.getX();
		y = me.getY();
		msg = "Mouse clicked at (" + x + ", " + y + ")";
		repaint();
	}
	public void mousePressed(java.awt.event.MouseEvent me) 
	{
		msg = "Mouse pressed at (" + x + ", " + y + ")";
		repaint();
	}
	public void mouseReleased(java.awt.event.MouseEvent me)
	{
		msg = "Mouse Released at (" + x + ", " + y + ")";
		repaint();
	}
	public void mouseEntered(java.awt.event.MouseEvent me) 
	{
		msg = "Mouse Entered at (" + x + ", " + y + ")";
		repaint();
	}
	public void mouseExited(java.awt.event.MouseEvent me) 
	{
		msg = "Mouse Exited at (" + x + ", " + y + ")";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
	public static void main(String args[]) 
	{
		new MouseListenerDemo();
	}
}