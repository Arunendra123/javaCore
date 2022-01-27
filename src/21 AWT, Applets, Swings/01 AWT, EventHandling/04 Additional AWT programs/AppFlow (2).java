//prg demonstrating flow layout
import java.awt.*;
import java.applet.*;
/*<applet code="AppFlow" width=300 height=300></applet>*/
public class AppFlow
     extends Applet{
    Panel p1,p2,p3,main;
    FlowLayout f1,f2,f3;
    public void init(){
       main=new Panel();
      f1=new FlowLayout(FlowLayout.LEFT);
     f2=new FlowLayout(FlowLayout.CENTER);
     f3=new FlowLayout(FlowLayout.RIGHT,30,30);
p1=new Panel();  p1.setLayout(f1);
p2=new Panel();  p2.setLayout(f2);
p3=new Panel();  p3.setLayout(f3);
p1.setBackground(Color.red);
p2.setBackground(Color.green);
p3.setBackground(Color.blue);
main.setLayout(new GridLayout(3,0));
main.add(p1);   main.add(p2);
main.add(p3);
  for(int i=1;i<=8;i++)
  p1.add(new Button("Button:"+i));

  for(int i=1;i<=8;i++)
  p2.add(new Button("Button:"+i));

   for(int i=1;i<=15;i++)
   p3.add(new Button("Button:"+i));
   add(main); //adding main panel to applet
    }}