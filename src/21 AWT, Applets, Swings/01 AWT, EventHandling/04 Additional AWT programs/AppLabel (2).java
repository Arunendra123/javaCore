import java.awt.*;
import java.applet.*;
/*<applet code="AppLabel" width=300 height=200></applet>*/
public class AppLabel extends Applet{
     Label l1,l2;
     public void init(){
        l1=new Label("Enter Name:");
       l2=new Label("Enter Address:",Label.CENTER);
       l1.setBackground(Color.red);
       l2.setBackground(Color.cyan);
    add(l1); add(l2);
     }
}