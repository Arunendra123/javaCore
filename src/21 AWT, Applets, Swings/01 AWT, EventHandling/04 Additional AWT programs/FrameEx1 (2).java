import java.awt.*;
import java.awt.event.*;
public class FrameEx1 extends Frame 
{
     FrameEx1(String tit){
         super(tit); //or setTitle(tit);
         setSize(400,400);
         addWindowListener(
	new WindowAdapter(){
public void windowClosing(WindowEvent we){
   System.exit(0);
  }
	}
         );       
         setVisible(true);
      }
      public void paint(Graphics g){
      g.setFont(new Font("Arial",Font.PLAIN,32));
    g.drawString("I am A Frame",20,100);
      }
      public static void main(String args[]){
FrameEx1 f=new FrameEx1("Frame1");
    }
}
