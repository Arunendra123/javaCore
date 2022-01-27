import java.awt.*;
import java.awt.event.*;
public class DialogEx extends Frame
{
     Dialog dlg;  
      Button yes,no;
     DialogEx(){
      setTitle("Dialog-Frame");
   setFont(new Font("Arial",Font.PLAIN,32));
      setSize(400,400);
     setVisible(true);

dlg=new Dialog(this,"MyDialog",false);
dlg.setSize(200,200);
dlg.setLayout(new GridLayout(2,0));
Panel p=new Panel();
p.setLayout(new GridLayout(0,2));
yes=new Button("Yes");
no=new Button("No");
p.add(yes); p.add(no);
dlg.add(new Label("Do You Want To Close?"));
dlg.add(p);
  dlg.show();
     }
  public static void main(String args[]){
    new DialogEx();
}   
}