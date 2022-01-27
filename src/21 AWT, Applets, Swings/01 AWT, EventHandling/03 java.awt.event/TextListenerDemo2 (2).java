/* TextListenerDemo2.java */

import java.awt.*;
import java.awt.event.*;

class TextListenerDemo2 extends Frame implements TextListener, ActionListener {

	Label l1, l2;
	TextField t1, t2;
	List lst1;
	Font f;
	String str;

	TextListenerDemo2() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("TextListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("Enter color names to add to the List box:");
		l2 = new Label("Adding ");

		t1 = new TextField(10);
		t1.addTextListener(this);
		t1.addActionListener(this);
		t2 = new TextField(10);
		t2.setBackground(Color.yellow);
	
		lst1 = new List();

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(lst1);

		setSize(360, 150);
		setVisible(true);
	}

	public void textValueChanged(java.awt.event.TextEvent te) {

		if(te.getSource() == t1) {

			str = t1.getText();
			t2.setText(str);
		}
	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == t1) {

			str = t1.getText();
			lst1.add(str);
			t1.setText("");
			t2.setText("");
		}
	}

	public static void main(String args[]) {
		new TextListenerDemo2();
	}
}