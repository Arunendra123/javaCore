/*
 * DialogDemo.java
 * This program demonstrates creating a custom Dialog box.
 */

import java.awt.*;
import java.awt.event.*;

class MyDialog extends Dialog {

	Button b;
	Font f;

	MyDialog(Frame frm, String name) {

		super(frm, name, true);

		setBounds(50, 150, 220, 100);
		setForeground(Color.blue);
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		b = new Button("Close");
		add(b);

	}

	public void paint(Graphics g) {
		g.drawString("This is a custom dialog box", 30, 80);
	}
}


class DialogDemo extends Frame implements ActionListener {

	MyDialog dlg;
	Button b1;
	Font f;

	DialogDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Dialog Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		dlg = new MyDialog(this, "Dialog Box");

		b1 = new Button("Show Dialog");
		b1.addActionListener(this);

		dlg.b.addActionListener(this);

		add(b1);

		setSize(300, 300);
		show();
	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1)
			dlg.show();

		if(ae.getSource() == dlg.b)
			dlg.dispose();
	}

	public static void main(String args[]) {
		new DialogDemo();
	}
}