/*
 * AppletDemo1.java
 *
 * Creation Date: 25th Jan 2005
 * 
 * This program demonstrates a simple Applet.
 * 
 */

import java.awt.*;
import java.applet.*;

public class AppletDemo1 extends Applet {

	Font f;

	public void init() {

		setBackground(Color.pink);
		f = new Font("Arial", Font.BOLD, 20);

	}

	public void paint(Graphics g) {

		g.setColor(Color.blue);
		g.setFont(f);
		g.drawString("Welcome to the world of Applets", 50, 100);

	}

}

/*

<applet code="AppletDemo1.class" width="400" height="200">
</applet>

*/