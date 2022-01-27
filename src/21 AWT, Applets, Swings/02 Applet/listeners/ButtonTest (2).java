/*
<applet code="ButtonTest.class" height=300 width=300>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ButtonTest extends Applet implements ActionListener
{
Button b1;//Decl., Of Component

public void init()
{
b1=new Button("Submit");//Instating the Compo.,.
add(b1);//Adding to the Window
b1.addActionListener(this);//Associating the Compo., with the ListerInterface
}

public void actionPerformed(ActionEvent evt)
{
showStatus("Its Working"+evt.getActionCommand());//Getting the action performance
}
}


