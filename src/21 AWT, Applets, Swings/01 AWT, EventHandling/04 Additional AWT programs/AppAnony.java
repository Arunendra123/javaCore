//Prg demonstrating anonymous class.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppAnony" width=400 height=400></applet>*/

public class AppAnony 
extends Applet
{
     Button b1;
     public void init()
	 {
       b1=new Button("Start");
	   add(b1);
       b1.addActionListener(new ActionListener()
							{ 
		   public void actionPerformed(ActionEvent ae){
      if(b1.getLabel().equals("Start"))
        b1.setLabel("Stop");
      else
        b1.setLabel("Start");
    }//method colsed
  } //anonymous class closed
);//addActionListener initialization context closed
 
  }//init closed
}//class closed