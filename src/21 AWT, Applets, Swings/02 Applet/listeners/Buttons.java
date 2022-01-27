/*
<applet code="Buttons.class" height=300 width=300>
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Applet 
{
 Label label = new Label("Default Label");//Decl., of Components
 Button button1 = new Button("One");
 Button button2 = new Button("Two");
 Button button3 = new Button("Three");

 public void init() 
 {

button1.addActionListener(new ButtonHandler());//Instatiating the Comp., with ListerInterface
button2.addActionListener(new ButtonHandler());
button3.addActionListener(new ButtonHandler());

add(button1);//Adding the Comp., to the Window
add(button2);
add(button3);
add(label);
 }
 class ButtonHandler implements ActionListener 
 {
  public void actionPerformed(ActionEvent e)
  {
   String s = e.getActionCommand();//Performing ActionEvent
   label.setText(s);//Getting the Output
  }
 }
}
