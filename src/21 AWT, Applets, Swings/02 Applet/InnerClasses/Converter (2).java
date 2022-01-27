
/* <applet code="Converter" height=100 width = 150></applet>*/

        import java.applet.*;
        import java.awt.*;
        import java.awt.event.*;

public class Converter extends Applet
           {
                TextField amt,rs;
                Choice c;
String s[]={"Dollar","Hnk Dollar","Euro","Pound"};
int val[] ={48,25,54,72};
 Label l;
public void init()
                   {
     amt = new TextField(10);
         rs = new TextField(10);
 c = new Choice();
for(int i=0;i<s.length;i++)
  c.add(s[i]);

   //adding components
add(new Label("Amount in Rs., "));
 add(amt);
 add(c);
add(new Label("Equalent Amount"));
 add(rs);
rs.setEditable(false);
amt.addActionListener(new ActionHandler(this));
c.addItemListener(new ItemHandler(this));
                   } //end of init

           } //end of class 

class ActionHandler implements ActionListener
           {
                Converter app;
                float rs,amt;
 ActionHandler(Converter a)
                    {
                        app = a;
                    }
public void actionPerformed(ActionEvent ae)
                    {
                        try
                          {
rs = Float.parseFloat(ae.getActionCommand());
                          }
 catch(NumberFormatException nfe)
                          {
 app.showStatus("Invalid Entry");
 app.amt.setText("");
                          }
amt = rs / app.val[app.c.getSelectedIndex()];
 Float f = new Float(amt);
app.rs.setText(f.toString());
app.showStatus("");
                    }
           } //end of class


        class ItemHandler implements ItemListener
           {
                Converter app;
                float rs,amt;
ItemHandler(Converter a)
                    {
                        app = a;
                    }
public void itemStateChanged(ItemEvent ae)
                    {
 try
{
   rs = Float.parseFloat(app.amt.getText());
                          }
                        catch(NumberFormatException nfe)
                          {
                             app.showStatus("Invalid Entry");
                             app.amt.setText("");
                          }
                        amt = rs / app.val[app.c.getSelectedIndex()];
                        Float f = new Float(amt);
                        app.rs.setText(f.toString());
                        app.showStatus("");
                    }
           } //end of class


                        




