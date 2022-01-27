/*  This program demonstrates ItemListener. */
/*
	ItemListener Interface Methods:
	- public abstract void itemStateChanged(java.awt.event.ItemEvent);
*/

import java.awt.*;
import java.awt.event.*;

class ItemListenerDemo1 extends Frame implements ItemListener {

	Choice c1;
	Font f;

	ItemListenerDemo1()
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("ItemListener Demo");
		setLayout(new FlowLayout());
		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);
		c1 = new Choice();
		c1.add("Select Color");
		c1.add("Red");
		c1.add("Green");
		c1.add("Blue");
		c1.addItemListener(this);
		add(c1);
		setSize(400, 200);
		setVisible(true);
	}
	public void itemStateChanged(java.awt.event.ItemEvent ie) 
	{

		if(c1.getSelectedIndex() == 1)
		{
			setBackground(Color.red);
		}
		if(c1.getSelectedIndex() == 2) 
		{
			setBackground(Color.green);
		}
		if(c1.getSelectedIndex() == 3) 
		{
			setBackground(Color.blue);
		}
	}
	public static void main(String args[]){
		new ItemListenerDemo1();
	}
}