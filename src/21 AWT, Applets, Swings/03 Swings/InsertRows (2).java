import javax.swing.*;
import javax.swing.table.*;

public class InsertRows{
	public static void main(String[] args) {
		new InsertRows();
	}

	public InsertRows(){
		JFrame frame		= new JFrame("Inserting rows in the table!");
		JPanel panel		= new JPanel();
		
		String data[][]		= {{"Vinod","100"},{"Raju","200"},{"Ranju","300"}};

		String col[]			= {"Name","code"};
		
		DefaultTableModel model = new DefaultTableModel(data,col);

		JTable table = new JTable(model);
		
		//Insert first position
		model.insertRow(0,new Object[]{"Ranjan","50"});
		
		//Insert 4 position
		model.insertRow(3,new Object[]{"Amar","600"});
		
		//Insert last position
		model.insertRow(table.getRowCount(),new Object[]{"Sushil","600"});
		
		panel.add(table);
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}