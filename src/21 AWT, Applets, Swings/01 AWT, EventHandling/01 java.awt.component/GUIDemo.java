import java.awt.*;
import java.awt.event.*;

class  GUIDemo extends Frame implements ActionListener
{
	
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button add,cancel;
	Toolkit tk;
	Dimension d;

	GUIDemo(String name)
	{
		super(name);
		setVisible(true);

		tk = Toolkit.getDefaultToolkit();
		 d = tk.getScreenSize();
		 int h = d.height;
		 int w = d.width;
		setSize(w,h);

		setLayout(null);

		setFont(new Font("Times New Roman",Font.BOLD,30));

		setBackground(Color.blue);
		setForeground(Color.red);		

		l1 = new Label("Fno ");
		l1.setBounds(100,20,50,25);
		add(l1);
		tf1 = new TextField(20);
		tf1.setBounds(180,20,200,25);
		add(tf1);

		l2 = new Label("Seno");
		l2.setBounds(100,40,70,40);
		add(l2);
		tf2 = new TextField(20);
		tf2.setBounds(180,50,200,25);
		add(tf2);
		
		l3 = new Label("Re");
		l3.setBounds(100,70,70,40);
		add(l3);
		tf3 = new TextField(20);
		tf3.setBounds(180,80,200,25);
		add(tf3);
		
		add = new Button("Click me");
		add.setBounds(100,100,200,25);
		add(add);
		cancel = new Button("Cancel");
		cancel.setBounds(300,100,200,25);
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
					int a = Integer.parseInt(tf1.getText());
					int b = Integer.parseInt(tf2.getText());
					int c = a+b;

					tf3.setText(""+c);
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
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
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
		new GUIDemo("Addition frame").show();
	}
}