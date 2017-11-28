import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Personen  {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JTable table = new JTable();
		
		Object[] columns = {"Name","Alter","Geschlecht"};
		DefaultTableModel modal = new DefaultTableModel();
		modal.setColumnIdentifiers(columns);
		
		table.setModel(modal);
		
		JButton add = new JButton("Einfügen");
		
		JScrollPane pane = new JScrollPane(table);
		
		frame.add(pane);
		
		frame.add(add);
		Object[] row = new Object[4];
				    
		 add.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	 	String name = JOptionPane.showInputDialog("Enter The name");
	                 String alter = JOptionPane.showInputDialog("Enter The alter");
	                row[0] = name;
	                row[1] = alter;
//	                row[2] = textAge.getText();
	                
	                // add row to the model
//	                model.addRow(row);
	            }
	        });
	}
	
}