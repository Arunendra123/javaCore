import java.awt.*;
import java.applet.*;
/*<applet code="AppGrid" 
width=400 height=400></applet>*/
public class AppGrid
 extends Applet{
    public void init(){
    setLayout(new GridLayout(4,4,10,20));
    for(int i=1;i<=16;i++){
       if(i%2==0)
     add(new Label());
     else
     add(new Button("Btn:"+i) );
    }

//       add(new Button("Btn:"+i),i );
    }//init closed
}//app closed