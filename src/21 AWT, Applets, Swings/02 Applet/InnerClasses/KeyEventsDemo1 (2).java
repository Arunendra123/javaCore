import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=KeyEventsDemo1 width=300 height=150></applet> */

public class KeyEventsDemo1 extends Applet implements KeyListener {
  String msg = "";

  public void init() {
	requestFocus();
	addKeyListener(this);
   }

   public void paint(Graphics g) {
	g.setFont(new Font("Ariel",Font.BOLD,24));
	g.setColor(Color.red);
	g.drawString(msg,50,50);
   }

       public void keyPressed(KeyEvent ke) {
	char ch = ke.getKeyChar();
	msg = "" + ch;
       }

       public void keyTyped(KeyEvent ke) {
	msg += " typed.";
	repaint();
       }

       public void keyReleased(KeyEvent ke) {
	int code = ke.getKeyCode();
	switch(code) {
	  case KeyEvent.VK_PAGE_UP:
		msg += "<page_up> pressed.";
		repaint();
		break;
	  case KeyEvent.VK_PAGE_DOWN:
		msg += "<page_down> pressed.";
		repaint();
		break;
	}
       }
}