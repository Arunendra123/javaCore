import java.awt.*;
import java.applet.*;
public class App1 extends Applet{
      public void paint(Graphics g){
         g.setFont(new Font("Impact",Font.PLAIN,32));
         g.setColor(Color.red);
         g.drawString("My First Applet",50,150);
      }//paint() closed
}//App closed