//AudioImage.java

import java.net.*;
import java.awt.*;
import java.applet.*;

public class AudioImage extends Applet
{
	Image img;

	public void init()
	{
		System.out.println("image path is found");
		img = getImage(getCodeBase(), "image.gif");
		audio = getAudioClip(getCodeBase(), "spacemusic.au");
	}

	public void start()
	{
		audio.play();
	}
	public void stop()
	{
		audio.stop();
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,50,50,this);
	}
}

/* <applet code="AudioImage.class" width=200 height=200></applet> */