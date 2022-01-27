import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MultiList" width=400 height=400>
</applet>*/
public class MultiList extends Applet implements ActionListener
{
    List lst1;
     public void init(){
        setFont(new Font("Impact",Font.PLAIN,33));
         lst1=new List(4,true);
         lst1.addItem("Monitor");
         lst1.addItem("KeyBoard");
         lst1.addItem("P-4");
         lst1.addItem("Celeron");
         lst1.addItem("Cyrix");
         lst1.addItem("AMD");
         lst1.addItem("Win2003");
         lst1.addActionListener(this);
         add(lst1);
     }  
     public void actionPerformed(ActionEvent ae){
       //double clicking multiselect listbox  will call actionPerformed
    repaint();
 }
  public void paint(Graphics g){
 String s[]=lst1.getSelectedItems();
 for(int i=0;i<s.length;i++){
     g.drawString(s[i],150,200+(i*30));
 }
  }
}

