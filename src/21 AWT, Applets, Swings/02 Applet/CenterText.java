import java.awt.*;
import java.applet.*;

/* 
<applet code=CenterText width=300 height=150>
</applet>
 */

public class CenterText  extends Applet 
{
public void paint(Graphics g) {
String display = "Java is fun to Learn" ;
Dimension d = getSize();
int height = (int) d.getHeight();
int width = (int) d.getWidth();

Font f = new Font("Ariel",Font.BOLD,40);
FontMetrics fm = getFontMetrics(f);
int x = (width - fm.stringWidth(display))/2;
int y = (height - (fm.getHeight()) )/2;

g.setFont(f);
g.drawString(display,x,y);
  }
}