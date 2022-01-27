/*
 * TextAreaDemo.java
 * This program demonstrates TextArea class.

	TextArea Class Constants:
	- static int SCROLLBARS_BOTH
	- static int SCROLLBARS_HORIZONTAL_ONLY
	- static int SCROLLBARS_VERTICAL_ONLY
	- static int SCROLLBARS_NONE

	TextArea Class Constructors:
	- public TextArea();
	- public TextArea(int rows, int columns);
	- public TextArea(String text);
	- public TextArea(String text, int rows, int columns);
	- public TextArea(String text, int rows, int columns, int scrollbars);

*/

import java.awt.*;

class TextAreaDemo extends Frame {

	Label l1, l2, l3;
	TextArea t1, t2, t3;
	Font f;

	TextAreaDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("TextArea Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);


		l1 = new Label("TextArea1:");
		l2 = new Label("TextArea2:");
		l3 = new Label("TextArea3:");

		t1 = new TextArea(5, 20);
		t2 = new TextArea("Welcome", 5, 20);
		t3 = new TextArea("Java is an object-oriented language.", 5, 30, TextArea.SCROLLBARS_HORIZONTAL_ONLY);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);

		setSize(330, 400);
		setVisible(true);

	}

	public static void main(String args[]) {
		new TextAreaDemo();
	}
}