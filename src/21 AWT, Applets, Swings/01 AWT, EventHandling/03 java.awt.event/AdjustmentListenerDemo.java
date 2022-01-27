/* This program demonstrates AdjustmentListener (Scrollbar)

	AdjustmentListener Interface Methods:
	- public abstract void adjustmentValueChanged(java.awt.event.AdjustmentEvent);
*/

import java.awt.*;
import java.awt.event.*;

class AdjustmentListenerDemo extends Frame implements AdjustmentListener{

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Scrollbar sc1, sc2, sc3;
	Font f;
	Color c;

	AdjustmentListenerDemo(){

		setBackground(Color.pink);
		setTitle("AdjustmentListener Demo");
		setLayout(null);
		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("Red");
		l2 = new Label("Green");
		l3 = new Label("Blue");
		sc1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sc1.addAdjustmentListener(this);
		sc2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sc2.addAdjustmentListener(this);
		sc3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sc3.addAdjustmentListener(this);

		t1 = new TextField("0", 10);
		t2 = new TextField("0", 10);
		t3 = new TextField("0", 10);

		l1.setBounds(70, 50, 50, 25);
		sc1.setBounds(130, 50, 100, 25);
		t1.setBounds(250, 50, 50, 25);
		l2.setBounds(70, 100, 50, 25);
		sc2.setBounds(130, 100, 100, 25);
		t2.setBounds(250, 100, 50, 25);
		l3.setBounds(70, 150, 50, 25);
		sc3.setBounds(130, 150, 100, 25);
		t3.setBounds(250, 150, 50, 25);

		add(l1);
		add(sc1);
		add(t1);
		add(l2);
		add(sc2);
		add(t2);
		add(l3);
		add(sc3);
		add(t3);

		setSize(400, 300);
		setVisible(true);
	}
	public void adjustmentValueChanged(java.awt.event.AdjustmentEvent ae) {

		if(ae.getSource() == sc1){
			c = new Color(sc1.getValue(), sc2. getValue(), sc3.getValue());
			t1.setText("" + sc1.getValue());
			repaint();
		}

		if(ae.getSource() == sc2){

			c = new Color(sc1.getValue(), sc2. getValue(), sc3.getValue());
			t2.setText("" + sc2.getValue());
			repaint();
		}

		if(ae.getSource() == sc3){

			c = new Color(sc1.getValue(), sc2. getValue(), sc3.getValue());
			t3.setText("" + sc3.getValue());
			repaint();
		}
	}
	public void paint(Graphics g) 	{
		setBackground(c);
	}

	public static void main(String args[]) {
		new AdjustmentListenerDemo();
	}
}