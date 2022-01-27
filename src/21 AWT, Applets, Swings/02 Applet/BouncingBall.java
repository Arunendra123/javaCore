import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<html>
 <applet code="BouncingBall.class"width=300 height=150>
</applet> 
</html>
*/
interface Animation
{
	void animate();
}

class AnimationTimer implements Runnable 
{
	Thread th;
	boolean stopFlag;
	Animation an;
	int delay;

	AnimationTimer(Animation an, int delay)
	{
		this.delay = delay;
		this.an = an;
		stopFlag = true;
	}

	void startAnimation()
	{
		if(stopFlag) {
			th = new Thread(this);
			stopFlag = false;
			th.start();
		}
	}
	void stopAnimation() 
	{
		stopFlag = true;
		th = null;
	}
	public void run() 
	{
		for(;;) 
		{
			an.animate();
			
			if(stopFlag) 
				break;
			
			try {	Thread.sleep(delay);	}
			catch(InterruptedException e) { }
		}
	}
}

public class BouncingBall extends Applet implements Animation 
{
	AnimationTimer timer;
	int delay = 5;
	int x = 150, y = 75, r = 18;
	int dx = 11, dy = 7;

	public void init() 
	{
		timer = new AnimationTimer(this,delay);
		addMouseListener(new AnimationHandler());
	}//init

	public void start()
	{
		timer.startAnimation();
	}
	public void stop()
	{
		timer.stopAnimation();
	}
	public void paint(Graphics g) 
	{
		setBackground(Color.yellow);
		g.setColor(Color.red);
		g.fillOval(x,y,r,r); 
	}//paint

	public void animate() 
	{
		Dimension d = getSize();
		int width = (int) d.getWidth();
		int height = (int) d.getHeight();

		if((x - r + dx< 0) || (x  + r + dx > width)) dx = -dx;
		if((y - r + dy < 0) || (y + r + dy  > height)) dy = -dy;
		x += dx;
		y += dy;
		repaint();
	}//animate()

	class AnimationHandler extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent me) 
		{ 
			if(!timer.stopFlag)
				timer.stopAnimation();
			else
				timer.startAnimation();
		}
	}
}

