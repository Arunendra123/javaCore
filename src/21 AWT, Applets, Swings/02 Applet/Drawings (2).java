import java.awt.*;
import java.applet.*;
/*
<html>
<applet code="Drawings.class" height=400 width=400>
</applet>
</html>
*/
public class Drawings extends Applet
{
public void paint(Graphics g)
{
g.drawString("All Drawing Objects of Java",12,12);
g.drawLine(100,100,200,200);
g.drawOval(22,22,40,40);
g.fillOval(22,22,40,40);
g.drawRect(300,300,100,100);
g.fillRect(300,300,100,100);
g.drawRoundRect(150,150,250,250,350,350);
g.fillRoundRect(150,150,250,250,350,350);
}
}

