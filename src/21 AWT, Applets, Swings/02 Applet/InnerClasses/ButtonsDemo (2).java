import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonsDemo extends Applet
{
	private Button b1,b2;
	public void init()
	{
		b1 = new Button("JAVA ");
		b1.addActionListener(new JavaMethod(this) );
		add(b1);
		b2 = new Button("CORBA ");
		b2.addActionListener(new CorbaMethod(this) );
		add(b2);
	}
}

class JavaMethod implements ActionListener
{
	Applet applet1;
	public JavaMethod(Applet a)
	{
		applet1 = a;
	}

	public void actionPerformed(ActionEvent e) 
	{
		applet1.showStatus("U Pressed :  "+e.getActionCommand() );
	}
}

class CorbaMethod implements ActionListener
{
	Applet applet2;

	
	public CorbaMethod(Applet a)
	{
		applet2 = a;
	}

	public void actionPerformed(ActionEvent e) 
	{
		applet2.showStatus("U Pressed :  "+e.getActionCommand() );
	}
}


/*
<applet code = "ButtonsDemo" width = 300 height = 200>
</applet>
*/



