//prg demonstrating usage of Adapter for Event Handling
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppAdapterEx1" width=300 height=300></applet>*/

//Adapter inheriting class
class MyMouse extends MouseAdapter
{
	AppAdapterEx1 aa;
    MyMouse(AppAdapterEx1 ab)
	{
      aa=ab;
    }
	public void mousePressed(MouseEvent me)
	{
		aa.x1=me.getX();
		aa.y1=me.getY();
	}
	public void mouseReleased(MouseEvent me)
	{
		aa.x2=me.getX(); 
		aa.y2=me.getY();
		aa.repaint();
		//aa.myLine();
	}	
}//Adapter closed

public class AppAdapterEx1 extends Applet
{
	int x1,y1,x2,y2;
	public void init()
	{
		MyMouse mm=new MyMouse(this);
		//"this" refers to AppAdapterEx1 
		addMouseListener(mm);
	}//init closed
	 public void paint(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	} 
	/*public void  myLine()
	{
		this.getGraphics().drawLine(x1,y1,x2,y2);
	}*/
}//Applet closed