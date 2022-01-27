/* This program demonstrates FocusListener.

	FocusListener Interface Methods:
	- public abstract void focusGained(java.awt.event.FocusEvent);
	- public abstract void focusLost(java.awt.event.FocusEvent);
*/

import java.awt.*;
import java.awt.event.*;

class FocusListenerDemo extends Frame implements FocusListener, ActionListener{

	Button b1, b2, b3;
	TextField t1;
	Font f;

	FocusListenerDemo(){

		setBackground(Color.pink);
		setTitle("FocusListener Demo");
		setLayout(new FlowLayout());
		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);
		b1 = new Button("Red");
		
		b1.addFocusListener(this);
		b1.addActionListener(this);

		b2 = new Button("Green");
		b2.addFocusListener(this);
		b2.addActionListener(this);

		b3 = new Button("Blue");
		b3.addFocusListener(this);
		b3.addActionListener(this);

		t1 = new TextField(30);

		add(b1);
		add(b2);
		add(b3);
		add(t1);

		setSize(300, 200);
		setVisible(true);
	}

	public void focusGained(java.awt.event.FocusEvent fe){

		if(fe.getSource() == b1) {
			t1.setText("Focus is on Button - Red");
		}

		if(fe.getSource() == b2) {
			t1.setText("Focus is on Button - Green");
		}

		if(fe.getSource() == b3) {
			t1.setText("Focus is on Button - Blue");
		}
	}
	
	public void focusLost(FocusEvent fe) {}

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
		new FocusListenerDemo();
	}
}