import javax.swing.*;
import javax.swing.table.*;

public class RemoveRows{
	public static void main(String[] args) {
		new RemoveRows();
	}

	public RemoveRows(){
		JFrame frame = new JFrame("Inserting rows in the table!");
		
		JPanel panel = new JPanel();
		
		String data[][] = {{"Vinod","100"},{"Raju","200"},{"Ranju","300"},
										{"Rahul","400"},{"Noor","600"}};

		String col[] = {"Name","code"};

		DefaultTableModel model = new DefaultTableModel(data,col);
		JTable table = new JTable(model);
		
		System.out.println("Befoure removing, number of rows: " + model.getRowCount());

		//Remove first row
		model.removeRow(0);
		System.out.println("After removing first row, number of rows: " + model.getRowCount());

		//Remove lase row
		model.removeRow(table.getRowCount()-1);

		System.out.println("After removing last row, number of rows: " + table.getRowCount());

		panel.add(table);
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}