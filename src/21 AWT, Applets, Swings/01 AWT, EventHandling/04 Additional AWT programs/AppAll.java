import java.awt.*;
import java.applet.*;
/*<applet code="AppAll" width=300 height=200></applet>*/
public class AppAll extends Applet{
     Label l1,l2;  TextField t1,t2;
     Button save,exit;
     Checkbox tv,bike,mobile;
     Checkbox win,unix,linux;
     List lstItems; Choice chItems;
     TextArea comments;
      Scrollbar sbar;
     public void init(){
      setFont(new Font("Arial",Font.PLAIN,22));

      l1=new Label("Enter Login:");
      l2=new Label("Enter Password:");

      t1=new TextField(20);
      t2=new TextField(20);
      t2.setEchoChar('$');    

      save=new Button("Save");
      exit=new Button("Exit");
      save.setActionCommand("save");

      tv=new Checkbox("TV",true);
      bike=new Checkbox("Bike",false);
      mobile=new Checkbox("Mobile",true);

      CheckboxGroup cbg1=new CheckboxGroup();
      win=new Checkbox("Windows2k",cbg1,false);
      unix=new Checkbox("Unix",cbg1,false);
      linux=new Checkbox("Linux",cbg1,false);

      lstItems=new List(5,true);
      lstItems.add("Lux");
      lstItems.add("Rin");
      lstItems.add("Vim");
      lstItems.add("Nirma");
      lstItems.add("Ponds");

      chItems=new Choice();
      chItems.add("Lux");
      chItems.add("Rin");
      chItems.add("Vim");
      chItems.add("Nirma");
      chItems.add("Ponds");

      comments=new TextArea(null,5,40,TextArea.SCROLLBARS_BOTH);
   
      sbar=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
      sbar.setUnitIncrement(2);
      sbar.setBlockIncrement(20);
//-adding components
     add(l1); add(t1);add(l2);add(t2);
     add(tv);add(bike);add(mobile);
     add(win);add(unix);add(linux);
     add(lstItems); add(chItems);
     add(comments); add(sbar);
     add(save);add(exit);
     }
}