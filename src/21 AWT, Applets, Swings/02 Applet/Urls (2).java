import java.net.*;
import java.awt.*;
import java.applet.*;

/* <applet code=Urls width=1000 height=150></applet> */

public class Urls extends Applet {
  public void paint(Graphics g) {
	URL url1 = getCodeBase();
	URL url2 = getDocumentBase();
	g.setFont(new Font("Ariel",Font.BOLD,5));
	g.setColor(Color.red);
	g.drawString(url1.toString(),50,50);
	g.drawString(url2.toString(),50,70);
  }
}