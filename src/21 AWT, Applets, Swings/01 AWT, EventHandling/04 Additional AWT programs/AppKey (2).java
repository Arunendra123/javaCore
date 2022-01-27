import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppKey" width=400 height=400></applet>*/
public class AppKey extends Applet
implements KeyListener{
StringBuffer msg=new StringBuffer();
   public void init(){
    setFont(new Font("Impact",Font.PLAIN,32));
     requestFocus();
    addKeyListener(this);
   }
   public void keyPressed(KeyEvent ke){
      msg.append(ke.getKeyChar());
      repaint();     
   }
   public void keyReleased(KeyEvent ke){}
   public void keyTyped(KeyEvent ke){   }
   public void paint(Graphics g){
    String s=new String(msg);
    g.drawString(s,10,50);
   }

}