/*
 This program demonstrates CardLayout Manager.
 */

/*

	CardLayout Class Constructors:
	- public java.awt.CardLayout();
	- public java.awt.CardLayout(int,int);

	* CardLayout class implements LayoutManager2 interface.

*/

import java.awt.*;
import java.awt.event.*;

class FacePanel extends Panel 
{

	Choice c1;

	FacePanel() 
	{
		setBackground(Color.pink);
		c1 = new Choice();
		c1.add("Arial");
		c1.add("Times New Roman");
		c1.add("Verdana");
		add(c1);
	}
}
class StylePanel extends Panel 
{

	Checkbox r1, r2, r3;

	StylePanel() 
	{
		setBackground(Color.orange);
		CheckboxGroup cbg = new CheckboxGroup();
		r1 = new Checkbox("Bold", cbg, false);
		r2 = new Checkbox("Italic", cbg, false);
		r3 = new Checkbox("Bold-Italic", cbg, false);

		add(r1);
		add(r2);
		add(r3);
	}
}

class SizePanel extends Panel 
{
	List lst;
	SizePanel() 
	{
		setBackground(Color.yellow);
		lst = new List();
		lst.add("12");
		lst.add("16");
		lst.add("20");
		lst.add("24");

		add(lst);
	}
}

class ResultPanel extends Panel 
{

	TextArea ta;
	ResultPanel() 
	{
		setLayout(new BorderLayout());
		ta = new TextArea();
		add(ta);
	}
}

class TabsPanel extends Panel 
{
	Button b1, b2, b3, b4, b5;
	TabsPanel() 
	{
		setBackground(Color.red);
		b1 = new Button("Face");
		b2 = new Button("Style");
		b3 = new Button("Size");
		b4 = new Button("Result");
		b5 = new Button("Exit");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}

class CardsPanel extends Panel 
{
	CardLayout cl;
	FacePanel fp;
	StylePanel sp;
	SizePanel szp;
	ResultPanel rp;

	CardsPanel() 
	{

		cl = new CardLayout();
		setLayout(cl);

		fp = new FacePanel();
		sp = new StylePanel();
		szp = new SizePanel();
		rp = new ResultPanel();

		add(fp, "FP");
		add(sp, "SP");
		add(szp, "SZP");
		add(rp, "RP");
	}
}

class CardLayoutDemo extends Frame implements ActionListener 
{
	Font f;
	CardsPanel cp;
	TabsPanel tp;
	String strFace;
	int style, size;

	CardLayoutDemo() 
	{

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("CardLayout Demo");

		cp = new CardsPanel();
		tp = new TabsPanel();

		tp.b1.addActionListener(this);
		tp.b2.addActionListener(this);
		tp.b3.addActionListener(this);
		tp.b4.addActionListener(this);
		tp.b5.addActionListener(this);

		add(tp, BorderLayout.NORTH);
		add(cp);

		setSize(400, 400);
		show();
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == tp.b1) 
		{
			cp.cl.show(cp, "FP");
		}
		if(ae.getSource() == tp.b2) 
		{
			cp.cl.show(cp, "SP");
		}

		if(ae.getSource() == tp.b3) 
		{
			cp.cl.show(cp, "SZP");
		}

		if(ae.getSource() == tp.b4) 
		{
			cp.cl.show(cp, "RP");

			if(cp.fp.c1.getSelectedItem() != null)
			{
				strFace = cp.fp.c1.getSelectedItem();
			} 
			else
			{
				strFace = "Arial";
			}

			if(cp.sp.r1.getState() == true)
			{
				style = Font.BOLD;
			} 
			else if(cp.sp.r2.getState() == true)
			{
				style = Font.ITALIC;
			}
			else if(cp.sp.r3.getState() == true) 
			{
				style = Font.BOLD + Font.ITALIC;
			} 
			else
			{
				style = Font.PLAIN;
			}
			if(cp.szp.lst.getSelectedItem() != null)
			{
				size = Integer.parseInt(cp.szp.lst.getSelectedItem());
			}
			else 
			{
				size = 12;
			}

			f = new Font(strFace, style, size);
			cp.rp.ta.setFont(f);
		}
		if(ae.getSource() == tp.b5) 
		{
			System.exit(0);
		}
	}
	public static void main(String args[]) 
	{
		new CardLayoutDemo();
	}
}