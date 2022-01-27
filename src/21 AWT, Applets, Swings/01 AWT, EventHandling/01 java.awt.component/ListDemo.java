 /*
 * ListDemo.java
 * This program demonstrates List class.
 */

/*
	List Class Constructors:
	- public java.awt.List();
	- public java.awt.List(int);
	- public java.awt.List(int,boolean);
*/

import java.awt.*;

class ListDemo extends Frame {

	List l1, l2, l3;
	Font f;

	ListDemo()
	{

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("List Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new List();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Mango");

		l2 = new List(3);
		l2.add("Red");
		l2.add("Green");
		l2.add("Blue");
		l2.add("Pink");
		l2.add("Orange");

		l3 = new List(3, true);
		l3.add("Red");
		l3.add("Green");
		l3.add("Blue");
		l3.add("Pink");
		l3.add("Orange");

		add(l1);
		add(l2);
		add(l3);

		setSize(400, 150);
		setVisible(true);

	}

	public static void main(String args[]) {
		new ListDemo();
	}
}