import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppDraw" width=500 height=500></applet>*/
public class AppDraw extends Applet
implements MouseListener,
MouseMotionListener{
    int lx1,lx2,ly1,ly2;
    int dx,dy;
    Checkbox lineCk,freehandCk;
    CheckboxGroup cbg;
    public void init(){
         cbg=new CheckboxGroup();
         lineCk=new Checkbox("Lines",cbg,false);
         freehandCk=new Checkbox("Freehand",cbg,true);
    add(lineCk); add(freehandCk);
      addMouseListener(this);
      addMouseMotionListener(this);
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){
        if(lineCk.getState()==true){
             lx1=me.getX(); ly1=me.getY();
        }
    }
    public void mouseReleased(MouseEvent me){
        if(lineCk.getState()==true){
             lx2=me.getX(); ly2=me.getY();
             this.getGraphics().drawLine(lx1,ly1,lx2,ly2);
        }
  
     }
    public void mouseClicked(MouseEvent me){}

    public void mouseMoved(MouseEvent me){}
    public void mouseDragged(MouseEvent me){
           if(freehandCk.getState()==true){
	dx=me.getX(); dy=me.getY();
               this.getGraphics().fillOval(dx,dy,30,30);
     //                    repaint();
           }
    }
/*    public void paint(Graphics g){
        g.fillOval(dx,dy,30,30);
    } */

}
