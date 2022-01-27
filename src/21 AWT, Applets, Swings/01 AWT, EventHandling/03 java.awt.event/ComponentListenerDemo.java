/* ComponentListenerDemo.java 

	ComponentListener Interface Methods:
	- public abstract void componentResized(java.awt.event.ComponentEvent);	
	- public abstract void componentMoved(java.awt.event.ComponentEvent);
	- public abstract void componentShown(java.awt.event.ComponentEvent);
	- public abstract void componentHidden(java.awt.event.ComponentEvent);
*/

import java.awt.*;
import java.awt.event.*;

class ComponentListenerDemo extends Frame implements ComponentListener {

	Button b1, b2;
	Font f;
	Dimension d = getSize();


	ComponentListenerDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Component Listener Demo");
		setLayout(null);

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		addComponentListener(this);

		b1 = new Button("BUTTON1");
		b2 = new Button("BUTTON2");

		b1.reshape(0, 0, 200, 200);
		b2.reshape(200, 200, 200, 200);

		add(b1);
		add(b2);

		setSize(400, 400);
		show();

	}

	public void componentResized(ComponentEvent ce) {

		d = getSize();
		b1.reshape(0, 0, (d.width/2), (d.height/2));
		b2.reshape((d.width/2), (d.height/2), (d.width/2), (d.height/2));
	}

	public void componentMoved(ComponentEvent ce) {}

	public void componentShown(ComponentEvent ce) {}

	public void componentHidden(ComponentEvent ce) {}

	public static void main(String args[]) {
		new ComponentListenerDemo();
	}
}