/*
 * ScrollbarDemo.java
 * This program demonstrates Scrollbar class.

	Scrollbar Class Constants:
	- public static final int HORIZONTAL;
	- public static final int VERTICAL;

	Scrollbar Class Constructors:
	- public java.awt.Scrollbar();
	- public java.awt.Scrollbar(int);
	- public java.awt.Scrollbar(int,int,int,int,int);

*/

import java.awt.*;

class ScrollbarDemo extends Frame {

	Scrollbar sb1, sb2;
	Font f;

	ScrollbarDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("Scrollbar Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		sb1 = new Scrollbar();
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100);

		add(sb1);
		add(sb2);

		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String args[]) {
		new ScrollbarDemo();
	}
}