/*
 This program demonstrates GridLayout Manager.
 */

/*

	GridLayout Class Constructors:
	- public java.awt.GridLayout();
	- public java.awt.GridLayout(int,int);
	- public java.awt.GridLayout(int,int,int,int);

	* GridLayout class implements LayoutManager interface.

*/

import java.awt.*;
import java.awt.event.*;

class GridLayoutDemo extends Frame implements ActionListener 
{

	Panel p1, p2;
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4, b5;
	Font f;
	int num1, num2, res;

	GridLayoutDemo() 
	{

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("GridLayout Demo");

		f = new Font("Arial", Font.BOLD, 14);
		setFont(f);

		p1 = new Panel();
		p1.setLayout(new GridLayout(3, 2, 0, 20));

		l1 = new Label("Number1:");
		l2 = new Label("Number2:");
		l3 = new Label("Result:");

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);

		p2 = new Panel();
		p2.setBackground(Color.yellow);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		b1 = new Button("ADD");
		b1.addActionListener(this);

		b2 = new Button("SUB");
		b2.addActionListener(this);

		b3 = new Button("MUL");
		b3.addActionListener(this);

		b4 = new Button("DIV");
		b4.addActionListener(this);

		b5 = new Button("EXIT");
		b5.addActionListener(this);

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);

		add(p2, BorderLayout.SOUTH);
		add(p1, BorderLayout.CENTER);

		setSize(300, 200);
		show();

	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1) 
		{

			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			res = num1 + num2;
			t3.setText("" + res);

		}

		if(ae.getSource() == b2) {

			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			res = num1 - num2;
			t3.setText("" + res);

		}

		if(ae.getSource() == b3) {

			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			res = num1 * num2;
			t3.setText("" + res);

		}

		if(ae.getSource() == b4) {

			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			res = num1 / num2;
			t3.setText("" + res);

		}

		if(ae.getSource() == b5) {

			System.exit(0);

		}

	}

	public static void main(String args[]) {

		new GridLayoutDemo();
	}
}