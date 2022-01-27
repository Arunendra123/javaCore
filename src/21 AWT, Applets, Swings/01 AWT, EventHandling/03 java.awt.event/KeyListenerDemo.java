/* KeyListenerDemo.java 

	KeyListener Interface Methods:
	- public abstract void keyTyped(java.awt.event.KeyEvent);
	- public abstract void keyPressed(java.awt.event.KeyEvent);
	- public abstract void keyReleased(java.awt.event.KeyEvent);
*/

import java.awt.*;
import java.awt.event.*;

class KeyListenerDemo extends Frame implements KeyListener {

	int x = 30;
	int y = 30;

	KeyListenerDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("KeyListener Demo");
		addKeyListener(this);

		setSize(300, 250);
		setVisible(true);

	}

	public void keyTyped(KeyEvent ke) {}

	public void keyPressed(KeyEvent ke) {

		if(ke.getKeyCode() == KeyEvent.VK_LEFT) {

			x = x - 10;
			repaint();
		}

		if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
		
			x = x + 10;
			repaint();
		}

		if(ke.getKeyCode() == KeyEvent.VK_UP) {
		
			y = y - 10;
			repaint();

		}

		if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
		
			y = y + 10;
			repaint();
		}
	}

	public void keyReleased(KeyEvent ke) {}

	public void paint(Graphics g) {
		g.fillRect(x, y, 100, 25);
	}

	public static void main(String args[]) {
		new KeyListenerDemo();
	}
}