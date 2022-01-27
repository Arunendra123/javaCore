import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppSquare" width=400 height=400></applet>*/
public class AppSquare extends Applet
 implements TextListener{
    Label l1,l2; TextField t1,t2;
    public void init(){
      l1=new Label("Enter value:");
      l2=new Label("Square Is:");
      t1=new TextField(10);
      t2=new TextField(20);
      t1.addTextListener(this);
      add(l1);add(t1);add(l2);add(t2);
    }
  public void textValueChanged(TextEvent te){
   double n,r;
    n=Double.parseDouble(t1.getText());
    r=n*n;
    t2.setText(Double.toString(r)); 
 }
}