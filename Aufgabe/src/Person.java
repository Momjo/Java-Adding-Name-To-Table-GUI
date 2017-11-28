import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Person extends JFrame {

    Object[] columns = {"Name","Alter","Geschlecht"};

    public Person(){

        super("JFrame Name");

        JTable table = new JTable();

        JScrollPane pane = new JScrollPane();

        JButton button = new JButton("Einfügen");

        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel model = (DefaultTableModel)table.getModel();

        model.setColumnIdentifiers(columns);


        pane.setViewportView(table);

        panel.add(pane,BorderLayout.NORTH);

        panel.add(button,BorderLayout.SOUTH);
        
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

             String name;
             String alter;
             String[] mOderw = { "M", "W"};
             name = JOptionPane.showInputDialog("Name:");
             alter = JOptionPane.showInputDialog("Alter");
             String geschlecht = (String) JOptionPane.showInputDialog(null, "Geschlecht:",
            		 	"Geschlecht", JOptionPane.QUESTION_MESSAGE, null, 
            		 	mOderw,
            		 	mOderw[1]
            		 );
             model.addRow(new Object[]{name,alter, geschlecht});
            }
        });
        
        setContentPane(panel);

        setSize(800, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
        
    }
    
    public static void main(String[] args){

         new Person();
    }
    
}