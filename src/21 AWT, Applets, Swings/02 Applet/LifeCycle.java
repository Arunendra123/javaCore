import java.applet.*;
import java.awt.*;
/*
 <html>
<applet code="LifeCycle.class" width="750" height="500">
</applet>
</html>
*/
public class LifeCycle extends Applet 
{
	int inits, starts, stops, paints;

	public void init()
	{
		inits++;
		System.out.println("Applet is initialized");
	}
	public void start()
	{
		starts++;
			System.out.println("Applet is started");
	 }
	public void stop()
	{
		stops++;
			System.out.println("Applet is stoped");
	}
	public void paint(Graphics g)
	{
		String msg =  "init() = " + inits + "\n" +
								"start() = "+ starts + "\n"+
								"stop() = "+ stops + "\n"+
								"paint() = "+ paints;

		setBackground(Color.yellow);
		Font f = new Font("Courier New",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(msg,50,50);

		paints++;
		System.out.println("Applet paint is called");
	  }

	  public void destroy()
	  {
		  System.out.println("Applet is destroyed");
	  }
}