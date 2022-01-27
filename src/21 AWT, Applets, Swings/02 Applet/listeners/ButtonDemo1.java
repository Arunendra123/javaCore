/*
<applet code="ButtonDemo1.class" height=300 width=300>
</applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonDemo1 extends Applet implements ActionListener
{
Button b1,b2,b3;
String msg=" ";
Label l1,l2;

public void init()
{
Button b1=new Button("Yes");//Decl., of Components
Button b2=new Button("No");
Button b3=new Button("Maybe");



               add(b1);
               add(b2);
               add(b3); 

               b1.addActionListener(this);//Instatiating the Comp., with ListerInterface
    b2.addActionListener(this);
               b3.addActionListener(this);

        }

public void actionPerformed(ActionEvent evt)
{

String str=evt.getActionCommand();//Performing ActionEvent
                if(str.equals("Yes") )
{
msg="You have Pressed Yes";
}
                else if(str.equals("No") )
{
msg="You have Pressed No";
                }
                else
                {
                msg="You have Pressed Undecided";
                }
                repaint();
        }

public void paint(Graphics g)
        {
	setBackground(Color.cyan);
	g.setColor(Color.red);
	Font f = new Font("TimesNewRoman",Font.BOLD,40);
	g.setFont(f);
                g.drawString(msg,10,100);//Getting the Output
        }


}

