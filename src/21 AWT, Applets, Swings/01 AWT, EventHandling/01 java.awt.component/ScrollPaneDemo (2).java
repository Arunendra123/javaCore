/*
 * ScrollPaneDemo.java
 * This program demonstrates ScrollPaneDemo.
 */


import java.awt.*;
import java.awt.event.*;
import java.io.*;

class ScrollPaneDemo extends Frame {

	Font f;
	ScrollPane sc;

	ScrollPaneDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("ScrollPane Demo");

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		Panel p = new Panel();
		p.setLayout(new GridLayout(20, 20));

		for(int i=1; i<=400; i++) {

			p.add(new Button("Button" + i));

		}

		sc = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sc.add(p);

		add(sc);

		setSize(390, 370);
		show();

	}

	public static void main(String args[]) {

		new ScrollPaneDemo();

	}

}