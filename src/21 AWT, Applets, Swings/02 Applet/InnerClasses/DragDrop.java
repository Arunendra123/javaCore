/*<applet code="DragDrop.class" height=400 width=400></applet>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class DragDrop extends Applet
{
TextField t,c;
Button ad,cl,ex,count;
String msg;
Button g,gg,l,ll;
List sou,tar;
public void init()
{
t = new TextField(10);
 add(t);
ad = new Button("Add");
add(ad);
cl = new Button("Clear");
add(cl);
sou = new List(5,true);
add(sou);
tar = new List(5,true);
add(tar);
 g  = new Button(">");
add(g);
gg  = new Button(">>");
add(gg);
l  = new Button("<");
add(l);
ll  = new Button("<<");
add(ll);
count = new Button("Count");
add(count);
c = new TextField(2);
add(c);
ex = new Button("Exit");
add(ex);
 } //end of init
public void start()
{
ad.addActionListener(new FunctCare(this));
cl.addActionListener(new FunctCare(this));
ex.addActionListener(new FunctCare(this));
count.addActionListener(new FunctCare(this));
g.addActionListener(new CopyCare(this));
gg.addActionListener(new CopyCare(this));
l.addActionListener(new CopyCare(this));
ll.addActionListener(new CopyCare(this));
}//start
} //end of class DragDrop

class FunctCare implements ActionListener
{
DragDrop app;
FunctCare(DragDrop app)
{
 this.app = app;
 }//constr
public void actionPerformed(ActionEvent a){
if ( a.getSource() == app.ad )
{
boolean flag = doesExists(app.t.getText(),app.sou);
if ( !flag )
{
int place = insertWhere(app.t.getText(),app.sou);
app.sou.add(app.t.getText(),place);
Integer i = new Integer(app.sou.getItemCount());
app.c.setText(i.toString());
 }//if
 app.t.setText(null);
}//if
else if ( a.getSource() == app.cl )
{     
 app.sou.removeAll();
 app.c.setText("0");  
}//else 
//else
// System.exit(0);
}//else

boolean doesExists(String s,List l)
{
String lst[] = l.getItems();
 int i=0;
boolean flag= false;
while ( i < lst.length && !flag ) 
{
if ( s.equals(lst[i++]))
 flag = true;
  }
return flag;
} //end of doesExists
int insertWhere(String s,List l)
{
 String lst[]= l.getItems();
 int i=0;
boolean stop = false;
while ( i < lst.length && !stop ) { 
  if ( s.compareTo(lst[i]) < 0 )
 stop = true;
 else i++;
} 
 return i;}} 
class CopyCare implements ActionListener
{
 DragDrop app;
CopyCare(DragDrop app)
{
 this.app = app;
  }
public void actionPerformed(ActionEvent a) {
 FunctCare f = new FunctCare(app);
boolean flag;
 int place;
if ( a.getSource() == app.g )
{
String s[] = app.sou.getSelectedItems();
if ( s.length != 1  )
return;
 flag = f.doesExists(s[0],app.tar);
if ( !flag )
{
 place = f.insertWhere(s[0],app.tar);
 app.tar.add(s[0],place);
 } }
else if ( a.getSource() == app.gg )
 { 
 String s[] = app.sou.getSelectedItems();
if ( s.length < 1 )
 return;
for(int i=0;i<s.length;i++)
 {
flag = f.doesExists(s[i],app.tar);
 if ( !flag ) 
{
  place = f.insertWhere(s[i],app.tar);
app.tar.add(s[i],place);
 } }}
else if ( a.getSource() == app.l ) {
String s[] = app.tar.getSelectedItems();
if ( s.length != 1  )
return; 
flag = f.doesExists(s[0],app.sou);
if ( !flag ){
 place = f.insertWhere(s[0],app.sou);
app.sou.add(s[0],place);
 } }
else if ( a.getSource() == app.ll )
  {
 String s[] = app.tar.getSelectedItems();   
if ( s.length < 1 )
 return;
 for(int i=0;i<s.length;i++) {
 flag = f.doesExists(s[i],app.sou);
if ( !flag ) {  
 place = f.insertWhere(s[i],app.tar);
app.sou.add(s[i],place);
  } }  } }  } 