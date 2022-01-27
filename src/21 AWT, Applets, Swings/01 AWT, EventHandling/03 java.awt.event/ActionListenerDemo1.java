/*
     - ActionListenerDemo1.java
		 - This program demonstrates ActionListener (Button).
		 - ActionListener Interface Methods:
			 - public abstract void actionPerformed(java.awt.event.ActionEvent);
*/

import java.awt.*;
import java.awt.event.*;

class ActionListenerDemo1 extends Frame implements ActionListener {

	Button b1, b2, b3;
	Font f;

	ActionListenerDemo1() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("ActionListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		b1 = new Button("Red");
		b1.setBackground(Color.pink);
		b1.addActionListener(this);

		b2 = new Button("Green");
		b2.addActionListener(this);

		b3 = new Button("Blue");
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);

		setSize(400, 150);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1) {
			setBackground(Color.red);
		}

		if(ae.getSource() == b2) {
			setBackground(Color.green);
		}

		if(ae.getSource() == b3) {
			setBackground(Color.blue);
		}
	}

	public static void main(String args[]) {
		new ActionListenerDemo1();
	}
}