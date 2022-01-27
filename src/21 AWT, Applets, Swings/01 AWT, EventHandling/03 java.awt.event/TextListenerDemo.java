/* This program demonstrates TextListener. */

/*
	TextListener Interface Methods:
	- public abstract void textValueChanged(java.awt.event.TextEvent);
*/

import java.awt.*;
import java.awt.event.*;

class TextListenerDemo extends Frame implements TextListener {

	Label l1, l2;
	TextField t1, t2;
	Font f;
	String str;

	TextListenerDemo() 
	{
		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("TextListener Demo");
		setLayout(new FlowLayout());
		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);
		l1 = new Label("Enter Name:     ");
		l2 = new Label("Re-enter Name:");

		t1 = new TextField(20);
		t1.addTextListener(this);
		t2 = new TextField(20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		setSize(300, 150);
		setVisible(true);
	}
	public void textValueChanged(java.awt.event.TextEvent te)
	{
			if(te.getSource() == t1)
			{
				str = t1.getText();
				t2.setText(str);
			}
	}
	public static void main(String args[])
	{
		new TextListenerDemo();
	}
}