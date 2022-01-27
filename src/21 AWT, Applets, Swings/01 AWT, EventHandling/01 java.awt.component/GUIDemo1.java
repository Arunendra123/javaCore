import java.awt.*;
import java.awt.event.*;

class  GUIDemo1 extends Frame implements ActionListener
{
	
	Label fil,sil,trl;
	TextField fitf,sitf,trtf;
	Button add,cancel;

	GUIDemo1()
	{
		setVisible(true);
		setSize(500,500);
		
		//setFont(new Font("Times New Roman",Font.BOLD,30));
		setBackground(Color.blue);
		setForeground(Color.red);		
		fil = new Label("Enter ");
		fil.setBounds(100,20,50,25);
		add(fil);
		fitf = new TextField(20);
		fitf.setBounds(180,20,200,25);
		add(fitf);

		sil = new Label("Enter Second Integer");
		sil.setBounds(100,40,70,40);
		add(sil);
		sitf = new TextField(20);
		sitf.setBounds(180,50,200,25);
		add(sitf);
		
		trl = new Label("Result after addition");
		trl.setBounds(100,70,70,40);
		add(trl);
		trtf = new TextField(20);
		trtf.setBounds(180,80,200,25);
		add(trtf);
		
		add = new Button("Click me");
		add.setBounds(100,100,200,25);
		add(add);
		cancel = new Button("Cancel");
		cancel.setBounds(180,110,200,25);
		add(cancel);
		
		add.addActionListener(this);
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==add)
			{
				try
				{
					int a = Integer.parseInt(fitf.getText());
					int b = Integer.parseInt(sitf.getText());
					int c = a+b;

					trtf.setText(""+c);
				}
				catch(NumberFormatException nfe)
				{
					nfe.printStackTrace();
				}
				catch(NullPointerException nle)
				{
					nle.printStackTrace();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			if(ae.getActionCommand().equals("Cancel"))
			{
				try
				{
					fitf.setText("");
					sitf.setText("");
					trtf.setText("");
				}
				catch(NullPointerException nle)
				{
					nle.printStackTrace();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 public static void main(String[] args) 
	{
		new GUIDemo1().show();
	}
}