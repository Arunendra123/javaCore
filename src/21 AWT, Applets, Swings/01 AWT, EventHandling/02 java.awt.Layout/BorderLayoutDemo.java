/*
This program demonstrates 
BorderLayout Manager.
 */

/*

	BorderLayout Class Constants:
	- public static final java.lang.String 
NORTH;
	- public static final java.lang.String 
SOUTH;
	- public static final java.lang.String 
EAST;
	- public static final java.lang.String 
WEST;
	- public static final java.lang.String 
CENTER;
	- public static final java.lang.String 
BEFORE_FIRST_LINE;
	- public static final java.lang.String 
AFTER_LAST_LINE;
	- public static final java.lang.String 
BEFORE_LINE_BEGINS;
	- public static final java.lang.String 
AFTER_LINE_ENDS;

	BorderLayout Class Constructors:
	- public java.awt.BorderLayout();
	- public java.awt.BorderLayout(int,int);

	* BorderLayout is the default layout 
manager for Frame class.

	* BorderLayout class implements 
LayoutManager2 interface.
*/

import java.awt.*;

class BorderLayoutDemo extends Frame 
{

	Button b1, b2, b3, b4, b5;
	Font f;

	BorderLayoutDemo() 
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("BorderLayout Demo");

		setLayout(new BorderLayout(30, 
30));

		f = new Font("Arial", Font.BOLD, 14);
		setFont(f);

		b1 = new Button("EAST");
		b2 = new Button("WEST");
		b3 = new Button("NORTH");
		b4 = new Button("SOUTH");
		b5 = new Button("CENTER");
/*
		add(b1, BorderLayout.EAST);
		add(b2, BorderLayout.WEST);
		add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
		add(b5, BorderLayout.CENTER);
*/
		add(b1); 
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(400, 400);
		show();

	}

	public static void main(String args[]) 
	{

		new BorderLayoutDemo();

	}

}