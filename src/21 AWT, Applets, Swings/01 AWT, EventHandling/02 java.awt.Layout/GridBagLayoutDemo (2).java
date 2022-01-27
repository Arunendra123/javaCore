/*
 This program demonstrates GridBagLayout Manager.
 */

/*

	GridBagLayout Class Constructors:
	- public java.awt.GridBagLayout();

	GridBagConstraints Constructors:
	- public java.awt.GridBagConstraints();
	- public java.awt.GridBagConstraints(int,int,int,int,double,double,int,int,jav
a.awt.Insets,int,int);

	* GridBagLayout class implements LayoutManager2 interface.

*/

import java.awt.*;
import java.awt.event.*;

class GridBagLayoutDemo extends Frame {

	Panel p1, p2;
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4, b5;
	Font f;
	int num1, num2, res;

	GridBagLayoutDemo() 
	{
			setBackground(Color.pink);
			setForeground(Color.blue);
			setTitle("GridBagLayout Demo");

			f = new Font("Arial", Font.BOLD, 14);
			setFont(f);

			GridBagLayout gridbag = new GridBagLayout();
			GridBagConstraints c = new GridBagConstraints();
			setLayout(gridbag);

			c.fill = GridBagConstraints.BOTH;
	        c.weightx = 1.0;
			makebutton("Button1", gridbag, c);
	        makebutton("Button2", gridbag, c);
	        makebutton("Button3", gridbag, c);

     	        c.gridwidth = GridBagConstraints.REMAINDER; //end row
	        makebutton("Button4", gridbag, c);

	        c.weightx = 0.0;		   //reset to the default
                makebutton("Button5", gridbag, c); //another row

	        c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
         	makebutton("Button6", gridbag, c);

	        c.gridwidth = GridBagConstraints.REMAINDER; //end row
    	        makebutton("Button7", gridbag, c);

		c.gridwidth = 1;	   	   //reset to the default
 	        c.gridheight = 2;
                c.weighty = 1.0;
                makebutton("Button8", gridbag, c);

                c.weighty = 0.0;		   //reset to the default
       	        c.gridwidth = GridBagConstraints.REMAINDER; //end row
 	        c.gridheight = 1;		   //reset to the default
                makebutton("Button9", gridbag, c);
                makebutton("Button10", gridbag, c);

		setSize(300, 200);
		show();

	}

	protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints c) {

	        Button b = new Button(name);
        	gridbag.setConstraints(b, c);
	        add(b);

        }

	public static void main(String args[]) {

		new GridBagLayoutDemo();

	}

}