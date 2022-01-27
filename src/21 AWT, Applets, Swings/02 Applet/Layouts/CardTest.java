import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardTest extends Applet implements ActionListener
{
	Button b1=new Button("First");
	Button b2=new Button("Second");
	Button b3=new Button("Third");
	CardLayout c=new CardLayout();
	public void init()
	{
		//setSize(250,250);
		setLayout(c);
		add(b1,"first");
		add(b2,"Second");
		add(b3,"Third");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
public void actionPerformed (ActionEvent e)
	{

		c.next(this);

	}


}
/*
<applet code="CardTest.class" height=300 width=150>
</applet>
*/
