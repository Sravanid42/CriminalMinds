import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;

import criminalinfo.Criminals;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class UI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public UI() {
		getContentPane().setLayout(null);
		
		JLabel lblCriminalDatabase = new JLabel("Criminal Database");
		lblCriminalDatabase.setFont(new Font("Rockwell", Font.PLAIN, 18));
		lblCriminalDatabase.setBounds(329, 0, 164, 37);
		getContentPane().add(lblCriminalDatabase);
		
		textField = new JTextField();
		textField.setBounds(129, 33, 565, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane display = new JTextPane();
		display.setBounds(15, 132, 793, 358);
		getContentPane().add(display);
		
		JButton btnDisplayAll = new JButton("Display all");
		btnDisplayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(Criminals.main(null));
			}
		});
		btnDisplayAll.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnDisplayAll.setBounds(15, 36, 104, 26);
		getContentPane().add(btnDisplayAll);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnSearch.setBounds(704, 36, 104, 26);
		getContentPane().add(btnSearch);
		
		JButton btnSortByAge = new JButton("Sort by Age");
		btnSortByAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSortByAge.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnSortByAge.setBounds(339, 83, 138, 21);
		getContentPane().add(btnSortByAge);
		
		JButton btnSortByState = new JButton("Sort by State");
		btnSortByState.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnSortByState.setBounds(501, 83, 138, 21);
		getContentPane().add(btnSortByState);
		
		JButton btnLastName = new JButton("Last A-Z");
		btnLastName.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnLastName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLastName.setBounds(15, 83, 138, 21);
		getContentPane().add(btnLastName);
		
		JButton btnSortByDate = new JButton("Sort by Date");
		btnSortByDate.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnSortByDate.setBounds(670, 83, 138, 21);
		getContentPane().add(btnSortByDate);
		
		JButton btnFirstName = new JButton("First A-Z");
		btnFirstName.setFont(new Font("Rockwell", Font.PLAIN, 14));
		btnFirstName.setBounds(175, 83, 138, 21);
		getContentPane().add(btnFirstName);

		
		
	}

}