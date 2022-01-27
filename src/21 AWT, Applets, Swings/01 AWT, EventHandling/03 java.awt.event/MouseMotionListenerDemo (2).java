/* 
 This program demonstrates MouseMotionListener.

	MouseMotionListener Interface Methods:
	- public abstract void mouseDragged(java.awt.event.MouseEvent);
	- public abstract void mouseMoved(java.awt.event.MouseEvent);

*/

import java.awt.*;
import java.awt.event.*;

class MouseMotionListenerDemo extends Frame implements MouseMotionListener 
{
	Font f;
	int x, y;
	MouseMotionListenerDemo()
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("MouseMotionListener Demo");
		setLayout(new FlowLayout());
		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);
		addMouseMotionListener(this);
		setSize(700, 300);
		setVisible(true);
	}
	public void mouseDragged(java.awt.event.MouseEvent me) 
	{
		if(me.getModifiers() == MouseEvent.BUTTON1_MASK) 
		{
			x = me.getX();
			y = me.getY();
			repaint();
		}
	}
	public void mouseMoved(java.awt.event.MouseEvent me) 
	{
		repaint();	
	}
	public void update(Graphics g)
	{
		g.drawOval(x, y, 50, 50);
	}
	public static void main(String args[]) 
	{
		new MouseMotionListenerDemo();
	}
}