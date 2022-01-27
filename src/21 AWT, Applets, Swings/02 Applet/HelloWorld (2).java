import java.applet.*;
import java.awt.*;
/* 
<applet code="HelloWorld.class" width="300" height="150">
</applet>
*/

public class HelloWorld extends Applet 
{
public void paint(Graphics g) 
{
setBackground(Color.yellow);
Font f = new Font("Courier New",Font.BOLD,44);
g.setFont(f);
g.setColor(Color.red);
g.drawString("Hello World!",150,150);
showStatus("It is an applet ..with Colors");
  }}