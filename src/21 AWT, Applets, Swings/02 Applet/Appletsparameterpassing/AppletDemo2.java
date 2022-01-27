/*
 * AppletDemo2.java
 *
 * Creation Date: 25th Jan 2005
 * 
 * This program demonstrates Applet life cycle.
 * 
 */

import java.awt.*;
import java.applet.*;

public class AppletDemo2 extends Applet {

	String msg = "";
	Font f;

	public void init() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		f = new Font("Arial", Font.BOLD, 20);
		setFont(f);

		msg += "Inside init() >> ";

	}

	public void start() {

		msg += "Inside start() >> ";

	}

	public void stop() {

		msg += "Inside stop() >> ";

	}

	public void paint(Graphics g) {

		msg += "Inside paint() >> ";
		g.drawString(msg, 50, 100);

	}

	public void destroy() {

		msg += "Inside destroy()";

	}

}

/*

<applet code="AppletDemo2.class" width="600" height="200">
</applet>

*/