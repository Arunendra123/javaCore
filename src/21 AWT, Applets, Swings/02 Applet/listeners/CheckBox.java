import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="CheckBox.class" height=300 width=300>
</applet>*/
public class CheckBox extends Applet implements ItemListener
{
String msg="";
Checkbox ch1,ch2,ch3;
public void init()
{
ch1=new Checkbox("Windows",null,true);
ch2=new Checkbox("Unix",null,false);
ch3=new Checkbox("Solaris",null,false);
add(ch1);
add(ch2);
add(ch3);
ch1.addItemListener(this);
ch2.addItemListener(this);
ch3.addItemListener(this);
}//init()
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
setBackground(Color.yellow);
g.setColor(Color.blue);
Font f = new Font("TimesNewRoman",Font.BOLD,28);
g.setFont(f);
msg="Current State: ";
g.drawString(msg,6,90);
msg="Windows:	"+ch1.getState();
g.drawString(msg,6,140);
msg="Unix	"+ch2.getState();
g.drawString(msg,6,200);
msg="Solaris	"+ch3.getState();
g.drawString(msg,6,260);
}}