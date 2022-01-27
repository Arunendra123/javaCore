import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class NPad extends Frame
implements ActionListener
{
	MenuBar mainBar;
     Menu file,window;
     MenuItem fnew,fopen,fsave,fsaveas,wexit;
	 TextArea doc;
	  FileDialog fdlg;
	  
	  NPad()
	  {
		  setTitle("MyNotePad");
		  setFont(new Font("Arial",Font.PLAIN,32));
		  mainBar=new MenuBar();
		  file=new Menu("File");
		  window=new Menu("Window");
		  fnew=new MenuItem("New");
		  fopen=new MenuItem("Open");
		  fsave=new MenuItem("Save");
		  fsaveas=new MenuItem("Save As");
		  wexit=new MenuItem("Exit");
		  
		  fnew.addActionListener(this);
		  fopen.addActionListener(this);
		  fsave.addActionListener(this);
		  fsaveas.addActionListener(this);
		  wexit.addActionListener(this);
		  
		  addWindowListener(new WindowAdapter()
		  {
			  public void windowClosing(WindowEvent we)
			  {
				  setVisible(false);
				  System.exit(0);
			  }
		  });

		  file.add(fnew);    
		  file.add(fopen);
		  file.add(new MenuItem("-"));
		  file.add(fsave);file.add(fsaveas);
		  window.add(wexit);
		  mainBar.add(file); 
		  mainBar.add(window);
		  setMenuBar(mainBar);
		  doc=new TextArea(40,80);
		  add(doc,BorderLayout.CENTER);
		  setSize(400,400);
		  setVisible(true);
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
		  if(ae.getSource()==wexit)
		  {
			  System.exit(0);
		  }
		  else 
		  if(ae.getSource()==fopen)
		  {
			  fdlg=new FileDialog(this,"File Open",FileDialog.LOAD);
			  fdlg.setVisible(true);
			  String dir="",fname="";
			  try
			  {
				  dir=fdlg.getDirectory();
				  fname=fdlg.getFile();
				  FileInputStream fin=new FileInputStream(dir+"/"+fname);
				  while(fin.available()>0)
				  {
					  int i=fin.read();
					  doc.append(((char)i)+""); //Character.toString((char)i);
				  }
			  }
			  catch(Exception e){}
		  }
		  else if(ae.getSource()==fsaveas)
		  {
			  fdlg=new FileDialog(this,"Save File",FileDialog.SAVE);
			  String dir="",fname="";
			  fdlg.setVisible(true);
			  dir=fdlg.getDirectory();
			  fname=fdlg.getFile();
			  try
			  {
				  FileOutputStream fout=new FileOutputStream(dir+"/"+fname);
				  String s=doc.getText(); 
				  byte b[]=s.getBytes();
				  for(int i=0;i<b.length;i++)
					  fout.write(b[i]);
				  fout.close();
			  }
			  catch(Exception e){}
		  }
		  else if(ae.getSource()==fnew)
		  {
			  doc.setText("");
			  doc.requestFocus();
		  }
	  }
	  public static void main(String args[])
	  {
		  new NPad();
	  }
}