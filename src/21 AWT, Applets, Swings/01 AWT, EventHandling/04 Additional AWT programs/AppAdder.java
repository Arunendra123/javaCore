import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppAdder" 
width=400 height=400></applet>*/
public class AppAdder extends Applet
implements FocusListener
{
       Label l1,l2,l3; 
       TextField no1Tf,no2Tf,resultTf;  
        public void init(){
           setFont(new Font("Arial",Font.PLAIN,22));
           l1=new Label("Enter No1:");
           l2=new Label("Enter No2:");
           l3=new Label("Result Is:");
           no1Tf=new TextField(20);
           no2Tf=new TextField(20);
           resultTf=new TextField(20);
          
           no1Tf.addFocusListener(this);	
           no2Tf.addFocusListener(this);
   
           add(l1);add(no1Tf);
           add(l2);add(no2Tf);
           add(l3);add(resultTf); 
        }
        public void focusGained(FocusEvent fe){
          if(fe.getSource()==no1Tf){
	no1Tf.setText("");
	no2Tf.setText("");
	resultTf.setText("");
          }
      }
     public void focusLost(FocusEvent fe){
          if(fe.getSource()==no2Tf)
          {
            double n1,n2,r;
n1=Double.parseDouble(no1Tf.getText());
n2=Double.parseDouble(no2Tf.getText());
r=n1+n2;
resultTf.setText(Double.toString(r));
 // or resultTf.setText(r+""); 
          }
     }
}
