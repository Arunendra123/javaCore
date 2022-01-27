/* ItemListenerDemo3.java */

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

class ItemListenerDemo3 extends Frame implements ItemListener, ActionListener {

	Label l, l1, l2, l3;
	TextField t1, t2, t3;
	List lst1, lst2;
	Button b1, b2;
	Font f;
	Color c;
	String str;
	int r, g, b;

	ItemListenerDemo3() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("ItemListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l = new Label("Enter values for red, green and blue in the range 0-255");
		l1 = new Label("Red");
		l2 = new Label("Green");
		l3 = new Label("Blue");

		t1 = new TextField(3);
		t2 = new TextField(3);
		t3 = new TextField(3);

		lst1 = new List();
		lst1.addActionListener(this);

		lst2 = new List();
		lst2.addItemListener(this);

		b1 = new Button("Add");
		b1.addActionListener(this);

		b2 = new Button("Exit");
		b2.addActionListener(this);

		add(l);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(lst1);
		add(lst2);
		add(b2);

		setSize(340, 300);
		show();
	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1) {
			str = t1.getText() + ", " + t2.getText() + ", " + t3.getText();
			lst1.add(str);
		}

		if(ae.getSource() == lst1) {
			str = lst1.getSelectedItem();
			lst1.remove(str);
			lst2.add(str);
		}

		if(ae.getSource() == b2) {
			System.exit(0);
		}
	}

	public void itemStateChanged(java.awt.event.ItemEvent ie) {

		if(ie.getSource() == lst2) {

			StringTokenizer stk = new StringTokenizer(lst2.getSelectedItem(), ", ");
	
			r = Integer.parseInt(stk.nextToken());
			g = Integer.parseInt(stk.nextToken());
			b = Integer.parseInt(stk.nextToken());

			c = new Color(r, g, b);
			setBackground(c);
		}
	}
	public static void main(String args[]) {
		new ItemListenerDemo3();
	}
}