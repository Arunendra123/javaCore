import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppAnony2" width=300 height=300></applet>*/
public class AppAnony2
     extends Applet{
     int x1,y1,x2,y2;
public void init(){
addMouseListener(
new MouseAdapter(){
public void mousePressed(MouseEvent me){
  x1=me.getX(); y1=me.getY();
 }
public void  mouseReleased(MouseEvent me){
 x2=me.getX(); y2=me.getY();
  myLine();
 }
 }

);
    }//init closed
public void  myLine(){
this.getGraphics().drawLine(x1,y1,x2,y2);
}
}//Applet closed