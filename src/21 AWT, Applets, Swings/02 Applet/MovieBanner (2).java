//MovieBanner.java

import java.awt.*;
import java.applet.*;

public class MovieBanner extends Applet implements Runnable 
{
	boolean stopFlag;
	String display = "";
	Thread th;

	public void init() 
	{
		setBackground(Color.cyan);
		setForeground(Color.blue);
		stopFlag = true;
		display = getParameter("msg");
	}//init()
	public void start() 
	{
		if(stopFlag) 
		{
			th = new Thread(this);
			stopFlag = false;
			th.start();
		}//if()
	}//start()
	public void stop() 
	{
		stopFlag = true;
		th = null;
	}
	public void paint(Graphics g) 
	{
		g.setFont(new Font("Times Roman", Font.BOLD, 30));
		g.drawString(display, 200, 200);
	}
	public void run() 
	{
		for(;;) 
		{
			repaint();
			repaint();
			char ch = display.charAt(0);
			display = display.substring(1, display.length()) + ch;

			if(stopFlag) 
				break;
			
			try {Thread.sleep(50);}
			catch(InterruptedException e) {}
		}
	}
}

/*
<applet code=MovieBanner width=700 height=150>
<params>
<param name=msg value="Impossible=I'm Possible....">
</params>
</applet> 
*/
