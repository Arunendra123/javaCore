import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="AppColorMixer" width=500 height=500>
</applet>*/
public class AppColorMixer extends Applet implements AdjustmentListener
{
  Label red,green,blue,result;
  Scrollbar redbar,greenbar,bluebar;
  public void init()
  {
   red=new Label();
   green=new Label();
   blue=new Label();
   result=new Label();
   redbar=new Scrollbar(Scrollbar.HORIZONTAL,0,2,0,257);
   greenbar=new Scrollbar(Scrollbar.HORIZONTAL,0,2,0,257);
   bluebar=new Scrollbar(Scrollbar.HORIZONTAL,0,2,0,257);
redbar.addAdjustmentListener(this);
greenbar.addAdjustmentListener(this);
bluebar.addAdjustmentListener(this);
 setLayout(null);
 add(red).setBounds(50,50,100,100);
add(green).setBounds(50,160,100,100);
add(blue).setBounds(50,270,100,100);
add(redbar).setBounds(160,50,100,100);
add(greenbar).setBounds(160,160,100,100);
add(bluebar).setBounds(160,270,100,100); 
add(result).setBounds(270,50,100,320);
setBackground(Color.cyan);

  }
public void adjustmentValueChanged(AdjustmentEvent ae)
 { if(ae.getSource()==redbar)
  red.setBackground(new Color(redbar.getValue(),0,0));
else 
 if(ae.getSource()==greenbar)
 green.setBackground(new Color(0,greenbar.getValue(),0)); 
else
  blue.setBackground(new Color(0,0,bluebar.getValue()));

 result.setBackground(new Color(redbar.getValue(),greenbar.getValue(),bluebar.getValue()));

 }
}
