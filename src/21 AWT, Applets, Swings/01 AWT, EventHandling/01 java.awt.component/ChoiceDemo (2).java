/*
 * ChoiceDemo.java
 * This program demonstrates Choice class.

	Choice Class Constructors:
	- public Choice();
*/

import java.awt.*;

class ChoiceDemo extends Frame {

	Choice c1, c2;
	Font f;

	ChoiceDemo() 
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Choice Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		c1 = new Choice();
		c1.add("Apple");
		c1.add("Banana");
		c1.add("Mango");

		c2 = new Choice();
		c2.add("Red");
		c2.add("Green");
		c2.add("Blue");

		add(c1);
		add(c2);

		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String args[]) {
		new ChoiceDemo();
	}
}