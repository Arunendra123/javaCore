/*
 * AppletDemo4.java
 * This program demonstrates retrieving parameters in an Applet.
 */

import java.awt.*;
import java.applet.*;

public class AppletDemo4 extends Applet {

	Font f;
	String strFontName;
	String strFontStyle;
	String strFontSize;
	int STYLE = Font.PLAIN;
	int iFontSize;

	public void init() {

		setBackground(Color.pink);

		strFontName = getParameter("fontName");
		strFontStyle = getParameter("fontStyle");
		strFontSize = getParameter("fontSize");

		if(strFontName == null)
			strFontName = "Arial";

		if(strFontStyle.equalsIgnoreCase("PLAIN"))
			STYLE = Font.PLAIN;
		else if(strFontStyle.equalsIgnoreCase("BOLD"))
			STYLE = Font.BOLD;
		else if(strFontStyle.equalsIgnoreCase("ITALIC"))
			STYLE = Font.ITALIC;

		if(strFontSize != null)
			iFontSize = Integer.parseInt(strFontSize);
		else
			iFontSize = 10;

		f = new Font(strFontName, STYLE, iFontSize);

	}

	public void paint(Graphics g) {

		g.setFont(f);
		g.setColor(Color.blue);

		g.drawString("Font Name: " + strFontName, 80, 50);
		g.drawString("Font Style: " + strFontStyle, 80, 80);
		g.drawString("Font Size: " + strFontSize, 80, 110);

	}

}