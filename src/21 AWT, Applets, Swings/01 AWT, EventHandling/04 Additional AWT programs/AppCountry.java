import java.awt.*;
import java.awt.event.*;
import java.applet.*; 
/*<applet code="AppCountry" width=400 height=400></applet>*/
public class AppCountry extends Applet implements ItemListener{
    Choice ch1,ch2;
    public void init(){
       setFont(new Font("Arial",Font.PLAIN,32));
    ch1=new Choice();
    ch2=new Choice();
    ch1.addItemListener(this);

    ch1.add("India");
    ch1.add("China");
    ch1.add("USA");
    ch1.add("Nepal");
    ch1.add("Japan");

    ch2.add("Delhi");
    ch2.add("Beijing");
    ch2.add("Washington");
    ch2.add("Katmandu");
    ch2.add("Tokyo");
    add(ch1);add(ch2);
    }
    public void itemStateChanged(ItemEvent ie){
    int idx=ch1.getSelectedIndex();
     ch2.select(idx);
   }
}