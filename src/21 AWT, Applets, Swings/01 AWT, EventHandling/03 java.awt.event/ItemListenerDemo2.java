/* ItemListenerDemo2.java */

import java.awt.*;
import java.awt.event.*;

class ItemListenerDemo2 extends Frame implements ItemListener, ActionListener {

	Label l1;
	TextField t1;
	Checkbox r1, r2, r3;
	Button b1;
	Font f;

	ItemListenerDemo2() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("ItemListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("Enter Text");

		t1= new TextField(28);
		t1.setFont(new Font("Arial", Font.PLAIN, 15));

		CheckboxGroup cbg = new CheckboxGroup();

		r1 = new Checkbox("Bold", cbg, false);
		r1.addItemListener(this);

		r2 = new Checkbox("Italic", cbg, false);
		r2.addItemListener(this);

		r3 = new Checkbox("Bold-Italic", cbg, false);
		r3.addItemListener(this);

		b1 = new Button("Exit");
		b1.addActionListener(this);

		add(l1);
		add(t1);
		add(r1);
		add(r2);
		add(r3);
		add(b1);

		setSize(300, 300);
		show();

	}

	public void itemStateChanged(java.awt.event.ItemEvent ie) {

		if(ie.getSource() == r1) {

			if(r1.getState() == true) {

				f = new Font("Arial", Font.BOLD, 15);
				t1.setFont(f);
			} 
			else 
			{
				f = new Font("Arial", Font.PLAIN, 15);
				t1.setFont(f);
			}
		}

		if(ie.getSource() == r2) {

			if(r2.getState() == true) {

				f = new Font("Arial", Font.ITALIC, 15);
				t1.setFont(f);
			} 
			else 
			{
				f = new Font("Arial", Font.PLAIN, 15);
				t1.setFont(f);
			}
		}

		if(ie.getSource() == r3) {

			if(r3.getState() == true) {

				f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
				t1.setFont(f);
			} 
			else 
			{
				f = new Font("Arial", Font.PLAIN, 15);
				t1.setFont(f);
			}
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1)
			System.exit(0);
	}
	public static void main(String args[]) {
		new ItemListenerDemo2();
	}
}