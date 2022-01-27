/*
 * AppletDemo3.java
 * This program demonstrates displaying a message in the status bar using Applet.
 */

import java.awt.*;
import java.applet.*;

public class AppletDemo3 extends Applet {

	Font f;

	public void init() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		f = new Font("Arial", Font.BOLD, 20);
		setFont(f);
	}

	public void paint(Graphics g) {
		g.drawString("Welcome to the world of Applets", 50, 100);
		g.setColor(Color.yellow);
		g.drawString("Please see the message in the status bar", 8, 120);
		showStatus("This is shown in the status window.");
	}
}

/*

<applet code="AppletDemo3.class" width="400" height="200">
</applet>

*/