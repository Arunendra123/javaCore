import java.awt.*;
import javax.swing.*;

class JTableDemo
{
	public static void main(String[] args) 
	{
			new JTableDemo();
	}

	JTableDemo()
	{
		JFrame frame = new JFrame("JTable Demo");
		
		String[][] rowsData = {{"HariKrishna", "B"}, {"Venkatesh","A"}};
		String[]	  columns  = {"Student Name", "Grade"};

		JTable table = new JTable(rowsData, columns);
		JPanel panel = new JPanel();
		panel.add(table,BorderLayout.CENTER);
		frame.add(panel);
	
		frame.setSize(450, 350);
		frame.setLayout(new FlowLayout());	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		frame.setVisible(true);
	}

}
