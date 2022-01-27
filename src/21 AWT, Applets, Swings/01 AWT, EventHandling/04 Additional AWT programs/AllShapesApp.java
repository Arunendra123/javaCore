//applet for graphics methods
import java.awt.*;
import java.applet.*;
/*
  <Applet code="AllShapesApp" width=600 height=600></applet>
*/
public class AllShapesApp extends Applet{
  public void init(){
    setBackground(Color.cyan);
    setForeground(Color.red);
  }
  public void paint(Graphics g){
     g.drawLine(10,10,100,10);
     g.drawRect(10,20,100,50);
     g.setColor(Color.yellow);
     g.fillRect(10,90,100,50);
 int x[]={200,150,250,300,350,450,400};
  int y[]={400,300,350,200,350,300,400};
  g.setColor(Color.red);
  g.drawPolygon(x,y,7);
  }
}
