import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ex2 extends Applet implements ActionListener
{
Button b1;
public void init()
{
b1=new Button("Submit");
b1.addActionListener(this);
add(b1);
}//init
public void actionPerformed(ActionEvent ae)
{
showStatus("Its Working when Clicked"+ae.getActionCommand());
}//AcionPer.,
}//class
/*
<applet code="Ex2.class" height=300 width=300>
</applet>
*/
