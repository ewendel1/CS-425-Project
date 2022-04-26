package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.List;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerPage extends JFrame {
	private JTable table;
	private JTextField txtStartSearching;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPage frame = new CustomerPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public CustomerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 555);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(74, 123, 636, 273);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Retail App");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(74, 22, 151, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(94, 80, 90, 21);
		getContentPane().add(lblNewLabel_1);
		
		txtStartSearching = new JTextField();
		txtStartSearching.setForeground(Color.GRAY);
		txtStartSearching.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStartSearching.setText("Start searching...");
		txtStartSearching.setBounds(158, 80, 420, 25);
		getContentPane().add(txtStartSearching);
		txtStartSearching.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(588, 75, 112, 31);
		getContentPane().add(btnNewButton);
		
		
		String[] options = {
				 "Options",
		         "My Profile",
		         "View Cart",
		         "Log out",
		};
		JComboBox settings = new JComboBox(options);
		settings.setEditable(true);
		settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = (String) settings.getSelectedItem();
				if (val.compareTo("My Profile")==0) {
					new CustomerInfo().setVisible(true);
					dispose();
				}
				else if(val.compareTo("View Cart")==0) {
					new Cart().setVisible(true);
					dispose();
				}
				else if(val.compareTo("Log out")==0) {
					new MainMenu().setVisible(true);
					dispose();
				}
			}
		});
		settings.setBounds(684, 10, 102, 39);
		getContentPane().add(settings);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(588, 409, 122, 31);
		getContentPane().add(btnNewButton_1);
		
		Icon icon = new ImageIcon("C:\\Users\\ijahw\\Documents\\IIT\\Spring 2022\\CS 425\\home.png");
		JButton homeButton = new JButton(icon);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		homeButton.setBounds(10, 10, 45, 39);
		getContentPane().add(homeButton);
		
	}
}
