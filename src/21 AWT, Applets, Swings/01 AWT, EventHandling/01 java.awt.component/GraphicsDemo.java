/*
 * GraphicsDemo.java
 *
 * Creation Date: 29th Jan 2005
 * 
 * This program demonstrates Graphics class.
 * 
 */

import java.awt.*;

class GraphicsDemo extends Frame {

	Font f;

	GraphicsDemo() {

		setBackground(Color.black);
		setForeground(Color.orange);
		setTitle("Graphics Demo");

		f = new Font("Arial", Font.BOLD, 15);
		setFont(f);

		setSize(450, 500);
		show();

	}

	public void paint(Graphics g) {

		g.drawString("Line:", 5, 43);
		g.drawLine(80, 40, 380, 40);

		g.drawString("Rectangle:", 5, 75);
		g.drawRect(110, 50, 100, 50);
		g.fillRect(260, 50, 100, 50);

		g.drawString("Square:", 5, 135);
		g.drawRect(135, 110, 50, 50);
		g.fillRect(285, 110, 50, 50);

		g.drawString("Round Rectangle:", 5, 195);
		g.drawRoundRect(135, 170, 50, 50, 10, 10);
		g.fillRoundRect(285, 170, 50, 50, 10, 10);

		g.drawString("Oval:", 5, 255);
		g.drawOval(110, 230, 100, 50);
		g.fillOval(260, 230, 100, 50);

		g.drawString("Circle:", 5, 315);
		g.drawOval(135, 290, 50, 50);
		g.fillOval(285, 290, 50, 50);

		g.drawString("Arc:", 5, 375);
		g.drawArc(110, 350, 100, 50, 180, 180);
		g.fillArc(260, 350, 100, 50, 0, 180);

		g.drawString("Polygon:", 5, 435);
		int x1[] = {160, 110, 210};
		int y1[] = {410, 460, 460};
		g.drawPolygon(x1, y1, 3);

		int x2[] = {310, 260, 360};
		int y2[] = {410, 460, 460};
		g.fillPolygon(x2, y2, 3);

	}

	public static void main(String args[]) {

		new GraphicsDemo();

	}

}