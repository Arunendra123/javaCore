import java.net.*;
import java.awt.*;
import java.applet.*;

/* <applet code=xxx width=400 height=200></applet> */

public class xxx extends Applet {
  public void init() {
	AppletContext ac = getAppletContext();
	URL url1 = getCodeBase();
	URL url2=null;

	try {
	  url2 = new URL(url1, "MovieBanner.html");
	}
	catch(MalformedURLException e) {
	}
   
	ac.showDocument(url2);
  }
}