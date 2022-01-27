/*
 This program demonstrates FlowLayout Manager.
 */

/*

	FlowLayout Class Constants:
	- public static final int LEFT;
	- public static final int CENTER;
	- public static final int RIGHT;
	- public static final int LEADING;
	- public static final int TRAILING;

	FlowLayout Class Constructors:
	- public java.awt.FlowLayout();
	- public java.awt.FlowLayout(int);
	- public java.awt.FlowLayout(int,int,int);

	* FlowLayout is the default layout manager for Panel and Applet classes.

	* FlowLayout class implements LayoutManager interface.

*/

import java.awt.*;

class FlowLayoutDemo extends Frame {

	Button b1;//, b2, b3, b4, b5, b6;
	Font f;

	FlowLayoutDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("FlowLayout Demo");
		setLayout(new FlowLayout());
	//	setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		

		f = new Font("Arial", Font.BOLD, 14);
		setFont(f);

		b1 = new Button("Button1");
		/*
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");
		b6 = new Button("Button6");
*/
		add(b1);
		/*
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
*/
		setSize(300, 300);
		show();

	}

	public static void main(String args[]) {

		new FlowLayoutDemo();

	}

}