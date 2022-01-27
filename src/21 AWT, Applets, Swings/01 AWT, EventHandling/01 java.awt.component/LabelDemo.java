/*
 * LabelDemo.java
 * This program demonstrates Label class.

	Label Class Constants:
	- public static final int LEFT;
	- public static final int CENTER;
	- public static final int RIGHT;

	Label Class Constructors:
	- public java.awt.Label();
	- public java.awt.Label(java.lang.String);
	- public java.awt.Label(java.lang.String,int);

*/

import java.awt.*;

class LabelDemo extends Frame {

	Label l1, l2, l3;
	Font f;

	LabelDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("Label Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("One");
		l1.setBackground(Color.yellow);

		l2 = new Label("Two", Label.CENTER);
		l2.setBackground(Color.yellow);

		l3 = new Label("Three", Label.RIGHT);
		l3.setBackground(Color.yellow);

		add(l1);
		add(l2);
		add(l3);

		setSize(300, 100);
		setVisible(true);

	}

	public static void main(String args[]) {
		new LabelDemo();		
	}
}