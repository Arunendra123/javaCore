/* ActionListenerDemo2.java */

import java.awt.*;
import java.awt.event.*;

class ActionListenerDemo2 extends Frame implements ActionListener {

	Label l1, l2, l3, l4;
	TextField t1, t2, t3, t4;
	Button b1;
	Font f;	
	int l, t, w, h;

	ActionListenerDemo2()
	{
		setBackground(Color.black);

		setTitle("ActionListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("LEFT:  ");
		l1.setForeground(Color.orange);
		l2 = new Label(" TOP:    ");
		l2.setForeground(Color.orange);
		l3 = new Label("WIDTH: ");
		l3.setForeground(Color.orange);
		l4 = new Label("HEIGHT:");
		l4.setForeground(Color.orange);

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
	
		b1 = new Button("DRAW");
		b1.addActionListener(this);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);

		setSize(340, 250);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1) {

			l = Integer.parseInt(t1.getText());
			t = Integer.parseInt(t2.getText());
			w = Integer.parseInt(t3.getText());
			h = Integer.parseInt(t4.getText());

			repaint();
		}
	}

	public void paint(Graphics g) 
	{
		g.setColor(Color.yellow);
		g.drawRect(l, t, w, h);
	}

	public static void main(String args[]) {
		new ActionListenerDemo2();
	}
}