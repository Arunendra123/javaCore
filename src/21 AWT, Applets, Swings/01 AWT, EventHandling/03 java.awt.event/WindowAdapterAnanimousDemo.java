/*
 * WindowAdapterDemo.java
 *
 * Creation Date: 29th Jan 2005
 * 
 * This program demonstrates FlowLayout Manager.
 * 
 */

/*

	Adapter Clases:
	- ComponentAdapter (ComponentListener)
	- ContainerAdapter (ContainerListener)
	- FocusAdapter (FocusListener)
	- KeyAdapter (KeyListener)
	- MouseAdapter (MouseListener)
	- MouseMotionAdapter (MouseMotionListener)
	- WindowAdapter (WindowListener)

*/

import java.awt.*;
import java.awt.event.*;

class WindowAdapterAnanimousDemo extends Frame 
{
	Font f;
	WindowAdapterAnanimousDemo() {
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Window Adapter Demo");

		f = new Font("Arial", Font.BOLD, 14);
		setFont(f);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});

		setSize(600, 300);
		show();

	}

	public void paint(Graphics g) {

		g.drawString("The Following are the seven Adapter classes:", 20, 50);
		g.drawString("> ComponentAdapter ", 20, 70);
		g.drawString("> ContainerAdapter", 20, 90);
		g.drawString("> FocusAdapter", 20, 110);
		g.drawString("> KeyAdapter", 20, 130);
		g.drawString("> MouseAdapter", 20, 150);
		g.drawString("> MouseMotionAdapter", 20, 170);
		g.drawString("> WindowAdapter", 20, 190);

	}

	public static void main(String args[]) {
	new WindowAdapterDemo();
	}
}