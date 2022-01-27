import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class btn extends Applet implements ActionListener
{
  Button b1,b2;
  Label l1;
  public void init()
  {
   b1=new Button("java");
   b2=new Button("Corba");
   l1=new Label("select one from the above");
   add(b1);
   add(b2);
   add(l1);
   b1.addActionListener(this);
   b2.addActionListener(this);
  }

   public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();
     if(str.equals("java"))
        showStatus("u have selected java");
     else
       showStatus("u have selected corba");
       
   }
}
/*
<applet code=btn height=250 width=300>
</applet>
*/