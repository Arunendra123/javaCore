import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppCube" width=400 height=400></applet>*/
public class AppCube extends Applet
implements ActionListener
{
      Label l1,l2; TextField t1,t2;
       Button calc,clear;
      public void init(){
      setFont(new Font("Impact",Font.PLAIN,22));
     l1=new Label("Enter No:");
     l2=new Label("Cube Is:");
     t1=new TextField(10);
     t2=new TextField(20);
     calc=new Button("Calc");
     clear=new Button("Clear");
     calc.addActionListener(this);
     clear.addActionListener(this);
    add(l1);add(t1);
    add(l2);add(t2);
    add(calc);add(clear);
      } 
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==calc){
    int c=Integer.parseInt(t1.getText());
    t2.setText(Integer.toString((c*c*c)));
      }else{
	t1.setText("");
	t2.setText("");
	t1.requestFocus();//send cursor to t1 box
       }
   }
}