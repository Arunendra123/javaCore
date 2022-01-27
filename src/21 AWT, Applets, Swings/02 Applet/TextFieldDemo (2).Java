import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo extends Applet  implements ActionListener
{
	TextField myname,mypassword;
        Button b1;
	public void init()
	{
		Label namep = new Label("Name : ",Label.RIGHT);
		Label passp = new Label("PassWord : ",Label.RIGHT);

		myname = new TextField(12);
		mypassword = new TextField(8);
		mypassword.setEchoCharacter('*');

		add(namep);
		add(myname);
		
		add(passp);
		add(mypassword);

                b1=new Button("Submit");
                add(b1);
                b1.addActionListener(this);
     	}


  public void actionPerformed(ActionEvent ae)
    {
      repaint();
    }
  
   public void paint(Graphics g)
	{
                g.drawString("Name :   "+myname.getText(),60,160);
                g.drawString("Selected Text in Name    "+myname.getSelectedText(),60,180);
                g.drawString("PassWord   "+mypassword.getText(),60,200);

	}
     
}
/*
<applet code="TextFieldDemo" width=300 height=300>
</applet>
*/
	
