import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="AppCards" width=400 height=400></applet>*/
public class AppCards 
extends Applet
 implements ActionListener
{
     Button first,last,next,previous;
     Panel mPan,p1,p2,p3,p4,bPan;
     CardLayout clo;
     public void init(){
      setLayout(new BorderLayout());
      first=new Button("First");
      next=new Button("Next");
   previous=new Button("Previous");
      last=new Button("Last");
      first.addActionListener(this);
      next.addActionListener(this);
     previous.addActionListener(this);
      last.addActionListener(this); 
bPan=new Panel(); bPan.add(first);
bPan.add(previous);bPan.add(next);
bPan.add(last);
add(bPan,BorderLayout.NORTH);
  
mPan=new Panel();
clo=new CardLayout();
mPan.setLayout(clo);

p1=new Panel();
p1.setLayout(new GridLayout(2,2));
for(int i=1;i<=4;i++)
   p1.add(new Button("B:"+i));

p2=new Panel();
p2.setLayout(new GridLayout(2,2));
for(int i=1;i<=4;i++)
   p2.add(new TextField(10));
p3=new Panel();
p3.setLayout(new GridLayout(2,2));
for(int i=1;i<=4;i++)
  p3.add(new Checkbox("chk:"+i,true));

p4=new Panel();
p4.setLayout(new GridLayout(2,2));
for(int i=1;i<=4;i++)
   p4.add(new Label("Label:"+i));

mPan.add(p1,"Page1");
mPan.add(p2,"Page2");
mPan.add(p3,"Page3");
mPan.add(p4,"Page4");

add(mPan,BorderLayout.CENTER);
     }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==first)
    clo.first(mPan);
   else if(ae.getSource()==previous)
    clo.previous(mPan);
   else if(ae.getSource()==next)
    clo.next(mPan);
   else if(ae.getSource()==last)
    clo.last(mPan);
//note: use show() as clo.show(mPan,"PageName");
}     
}