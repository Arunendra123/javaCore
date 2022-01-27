import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
 <applet code="MyButtons" width=300 height=300>
 </applet>
 */


 public class MyButtons extends Applet implements  ActionListener
 {
      Label l1 ;
      Button b1,b2;
      String msg;
      public void init()
      {
        l1 = new Label("zutec informatiocs");
        b1=new Button("java");
        b2=new Button("corba");
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
      }
      public void actionPerformed(ActionEvent ae)
      {
        String str;
        str=ae.getActionCommand();
        if (str.equals("java"))
              msg="You have selected java";
        else
              msg="You have selected corba";
              repaint();

        }
       public void paint(Graphics g)
       {g.drawString(msg,50,50);
       }
}
