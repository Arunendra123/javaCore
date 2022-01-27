/*
 * CheckboxDemo.java
 * This program demonstrates Checkbox class.

	Checkbox Class Constructors:
	- public Checkbox();
	- public Checkbox(String label);
	- public Checkbox(String label, boolean state);
	- public Checkbox(String label, boolean state, CheckboxGroup g);
	- public Checkbox(String label, CheckboxGroup g,boolean state);
*/

import java.awt.*;

class CheckboxDemo extends Frame {

	Checkbox c1, c2, c3;
	Font f;

	CheckboxDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("Checkbox Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		c1 = new Checkbox("Red");
		c2 = new Checkbox("Green");
		c3 = new Checkbox("Blue", true);

		add(c1);
		add(c2);
		add(c3);

		setSize(400, 150);
		setVisible(true);
	}
	public static void main(String args[]) {
		new CheckboxDemo();
	}
}