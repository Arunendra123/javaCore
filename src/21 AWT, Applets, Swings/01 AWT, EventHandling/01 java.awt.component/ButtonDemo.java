/*
 * ButtonDemo.java
 * This program demonstrates Button class.
 
	Button Class Constructors:
	- public Button();
	- public Button(String name);
*/

import java.awt.*;

class ButtonDemo extends Frame {

	Label l1, l2;
	Button b1, b2;
	Font f;

	ButtonDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("Button Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("Button1:");
		l2 = new Label("Button2:");

		b1 = new Button();
		b2 = new Button("CLICK");

		add(l1);
		add(b1);
		add(l2);
		add(b2);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String args[]) {

		new ButtonDemo();

	}

}