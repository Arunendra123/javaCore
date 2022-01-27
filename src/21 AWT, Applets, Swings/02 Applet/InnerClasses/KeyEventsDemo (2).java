import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=KeyEventsDemo width=300 height=150></applet> */

public class KeyEventsDemo extends Applet {
  String msg = "";

  public void init() {
	requestFocus();
	addKeyListener(new KeyHandler());
   }

   public void paint(Graphics g) {
	g.setFont(new Font("Ariel",Font.BOLD,45));
	g.setColor(Color.black);
	g.drawString(msg,50,50);
   }

   class KeyHandler implements KeyListener {
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
		case KeyEvent.VK_HOME:
		msg += "<Home> pressed.";
		repaint();
		break;
		case KeyEvent.VK_F1:
		msg += "<F1> pressed.";
		repaint();
		break;
		case KeyEvent.VK_PRINTSCREEN:
		msg += "<Prin_Screen><Sys_Rq> pressed.";
		repaint();
		break;
		case KeyEvent.VK_SCROLL_LOCK:
		msg += "<Scroll_Lock> pressed.";
		repaint();
		break;
		case KeyEvent.VK_INVERTED_EXCLAMATION_MARK:
		msg += "<INVERTED_EXCLAMATION_MARK> pressed.";
		repaint();
		break;
        case KeyEvent.VK_RIGHT_PARENTHESIS:
		msg += "<VK_RIGHT_PARENTHESIS '('> pressed.";
		repaint();
		break;
	    case KeyEvent.VK_LEFT_PARENTHESIS:
		msg += "<VK_RIGHT_PARENTHESIS '('> pressed.";
		repaint();
		break;
        case KeyEvent.VK_ENTER:
		msg += "<ENTER KEY HAS BEEN> pressed.";
		repaint();
		break;
	}
       }
   }
}