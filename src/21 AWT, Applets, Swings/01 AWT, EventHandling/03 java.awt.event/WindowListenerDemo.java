/* WindowListenerDemo.java
  This program demonstrates WindowListener.
 
	WindowListener Interface Methods:
	- public abstract void windowOpened(WindowEvent);
	- public abstract void windowClosing(WindowEvent);
	- public abstract void windowClosed(WindowEvent);
	- public abstract void windowIconified(WindowEvent);
	- public abstract void windowDeiconified(WindowEvent);
	- public abstract void windowActivated(WindowEvent);
	- public abstract void windowDeactivated(WindowEvent);
*/

import java.awt.*;
import java.awt.event.*;

class WindowListenerDemo extends Frame implements WindowListener {

	Font f;

	WindowListenerDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Window Listener Demo");

		f = new Font("Arial", Font.BOLD, 14);
		setFont(f);

		addWindowListener(this);

		setSize(600, 300);
		show();

	}

	public void paint(Graphics g) {

		g.drawString("The Following are the methods of WindowListener interface:", 20, 50);
		g.drawString("> void windowOpened(java.awt.event.WindowEvent)", 20, 70);
		g.drawString("> void windowClosing(java.awt.event.WindowEvent)", 20, 90);
		g.drawString("> abstract void windowClosed(java.awt.event.WindowEvent)", 20, 110);
		g.drawString("> void windowIconified(java.awt.event.WindowEvent)", 20, 130);
		g.drawString("> void windowDeiconified(java.awt.event.WindowEvent)", 20, 150);
		g.drawString("> void windowActivated(java.awt.event.WindowEvent)", 20, 170);
		g.drawString("> void windowDeactivated(java.awt.event.WindowEvent)", 20, 190);

	}

	public void windowOpened(WindowEvent we) {}

	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowActivated(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}

	public static void main(String args[]) {
		new WindowListenerDemo();
	}
}