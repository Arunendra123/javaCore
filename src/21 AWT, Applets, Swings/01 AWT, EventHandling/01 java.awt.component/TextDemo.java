/*
 * TextDemo.java
 * This program demonstrates TextField class.
	
	TextField Class Constructors:
	- public TextField();
	- public TextField(int columns);
	- public TextField(String textData);
	- public TextField(String textData, int columns);
*/

import java.awt.*;

class TextDemo extends Frame {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Font f;

	TextDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("TextField Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);


		l1 = new Label("TextField1:");
		l2 = new Label("TextField2:");
		l3 = new Label("TextField3:");

		t1 = new TextField();
		t2 = new TextField(20);
		t3 = new TextField("Welcome");

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);

		setSize(600, 150);
		setVisible(true);

	}

	public static void main(String args[]) {
		new TextDemo();		
	}
}