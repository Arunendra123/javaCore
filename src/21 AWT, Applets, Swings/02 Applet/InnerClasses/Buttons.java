import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Applet 
{
 Label label = new Label("Default Label");
 Button button1 = new Button("One");
 Button button2 = new Button("Two");
 Button button3 = new Button("Three");
 Panel panel1 = new Panel();
 Panel panel2 = new Panel();
 public void init() 
 {
  setLayout(new BorderLayout());
  panel1.add(label);
  button1.addActionListener(new ButtonHandler());
  button2.addActionListener(new ButtonHandler());
  button3.addActionListener(new ButtonHandler());
  panel2.add(button1);
  panel2.add(button2);
  panel2.add(button3);
  add("North",panel1);
  add("Center",panel2);
 }
 class ButtonHandler implements ActionListener 
 {
  public void actionPerformed(ActionEvent e)
  {
   String s = e.getActionCommand();
   label.setText(s);
  }
 }
}
/*
<applet code=Buttons height=250 width=300>
</applet>
*/