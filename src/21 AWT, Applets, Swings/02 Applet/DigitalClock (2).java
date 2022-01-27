import java.util.*;
import java.awt.*;
import java.applet.*;

/* <applet code=DigitalClock width=300 height=150>
</applet> 
*/

public class DigitalClock extends Applet implements Runnable 
{
	boolean stopFlag;
	String display = "";
	Thread th;
	int hours, minutes, seconds;
	
	public void init() 
	{
		setBackground(Color.cyan);
		setForeground(Color.blue);
		stopFlag = true;
	}
	public void start() {
		if(stopFlag) 
		{
			th = new Thread(this);
			stopFlag = false;
			th.start();
		}
	}
	public void stop() {
		stopFlag = true;
		th = null;
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Ariel", Font.BOLD, 36));
		display = String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds);
		g.drawString(display, 50, 50);
		g.drawString(String.valueOf(hours), 50, 100);	
	}

	public void run() 
	{
		for(;;) {
			repaint(500);
			Calendar cal = Calendar.getInstance();
			hours = cal.get(Calendar.HOUR);
			minutes = cal.get(Calendar.MINUTE);
			seconds = cal.get(Calendar.SECOND);

			if(stopFlag) 
				break;
			try {	Thread.sleep(500);}
			catch(InterruptedException e) {
				System.out.println("e");
			}
		}
	}
}