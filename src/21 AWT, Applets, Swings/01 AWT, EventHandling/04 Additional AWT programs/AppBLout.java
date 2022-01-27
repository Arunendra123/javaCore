import java.awt.*;
import java.applet.*;
/*<applet code="AppBLout" 
width=400 height=400></applet>*/
public class AppBLout
 extends Applet{
BorderLayout bl;
    public void init(){
    bl=new BorderLayout();
    setLayout(bl);
add(new Button("North"),BorderLayout.NORTH);
add(new Button("South"),BorderLayout.SOUTH);
add(new Button("East"),BorderLayout.EAST);
add(new Button("West"),BorderLayout.WEST);
add(new Button("Center"),BorderLayout.CENTER);
    }//init closed
}//app closed
