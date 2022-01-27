//prg demonstrating usage of Adapter for Event Handling with INNER CLASS
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppAdapterEx2" width=300 height=300></applet>*/
public class AppAdapterEx2 
     extends Applet{
     int x1,y1,x2,y2;
public void init(){
MyMouse mm=new MyMouse(); //"this" operator is missing from MyMouse() constructor
addMouseListener(mm);
    }//init closed
public void  myLine(){
this.getGraphics().drawLine(x1,y1,x2,y2);
}
//Adapter inheriting class
//MyMouse is Inner class
class MyMouse 
        extends MouseAdapter{
public void mousePressed(MouseEvent me){
  x1=me.getX(); y1=me.getY();
 }
public void  mouseReleased(MouseEvent me){
 x2=me.getX(); y2=me.getY();
  myLine();
 }
 }//Adapter -Inner class closed
}//Applet closed