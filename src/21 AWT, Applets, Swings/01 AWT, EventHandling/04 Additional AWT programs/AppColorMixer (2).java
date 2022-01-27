import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<Applet code="AppColorMixer" width=500 height=500></applet>
*/
public class AppColorMixer
extends Applet implements
AdjustmentListener{
Label   red,green,blue,result;
Scrollbar redbar,greenbar,bluebar;
 public void init(){
  setLayout(null); //cancelling LayoutManager
 setBackground(Color.cyan);
red=new Label();
red.setBackground(Color.black);
green=new Label();
green.setBackground(Color.black);
blue=new Label();
blue.setBackground(Color.black);
result=new Label();
result.setBackground(Color.black);
redbar=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,265);//265=255 color+10 thumbsize
redbar.setBlockIncrement(10);
greenbar=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,265);
greenbar.setBlockIncrement(10);
bluebar=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,265);
bluebar.setBlockIncrement(10);
redbar.addAdjustmentListener(this);
greenbar.addAdjustmentListener(this);
bluebar.addAdjustmentListener(this);
//adding manually using setBounds
add(red).setBounds(10,10,50,50);
add(green).setBounds(10,70,50,50);
add(blue).setBounds(10,130,50,50);
add(redbar).setBounds(70,10,100,50);
add(greenbar).setBounds(70,70,100,50);
add(bluebar).setBounds(70,130,100,50);
add(result).setBounds(180,10,100,170);
 }
public void adjustmentValueChanged(AdjustmentEvent ae){
   if(ae.getSource()==redbar){
    red.setBackground(new Color(redbar.getValue(),0,0));
   }else   if(ae.getSource()==greenbar){
    green.setBackground(new Color(0,greenbar.getValue(),0));
   }else    if(ae.getSource()==bluebar){
    blue.setBackground(new Color(0,0,bluebar.getValue()));
   }
result.setBackground(new Color(redbar.getValue(),greenbar.getValue(),bluebar.getValue()));
 }
   
}
