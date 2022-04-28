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
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class CustomerPage extends JFrame {
	private JTable table;
	private JTextField productName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		try {
		    BufferedReader reader = new BufferedReader(new FileReader("mydata.ser"));
		    String customerID = reader.readLine();
		    reader.close();
		}
		catch(Exception ex) {
		    ex.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 555);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(77, 202, 636, 227);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Retail App");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(74, 22, 151, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(77, 57, 90, 21);
		getContentPane().add(lblNewLabel_1);
		
		productName = new JTextField();
		productName.setForeground(Color.BLACK);
		productName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		productName.setBounds(191, 86, 126, 25);
		getContentPane().add(productName);
		productName.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL", "HR", "oracle");
		            PreparedStatement pst = conn.prepareStatement("select * from Products");
		           	ResultSet rs = pst.executeQuery();
		            Statement st = conn.createStatement();
			           //st.executeUpdate("INSERT INTO CART (CUSTOMERID, NAME, EMAIL, PAYMENTMETHOD, AGE, SEX, PHONENUMBER, PASSWORD, ADDRESSID) VALUES ('"+myId+"', '"+name.getText() +"', '"+email.getText()+"',"
		            	//	+ " '3', '"+Integer.parseInt(age.getText())+"', '"+sex.getText()+"', '"+Integer.parseInt(phoneNumber.getText())+"', '"+password.getText()+"', '2')");
			           st.close();
		            
	            	conn.close();
	            	new MainMenu().setVisible(true);
					dispose();
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(331, 152, 112, 31);
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
		btnNewButton_1.setBounds(591, 442, 122, 31);
		getContentPane().add(btnNewButton_1);
		
		Icon icon = new ImageIcon("C:\\Users\\ijahw\\Documents\\IIT\\Spring 2022\\CS 425\\home.png");
		JButton homeButton = new JButton(icon);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		homeButton.setBounds(10, 10, 45, 39);
		getContentPane().add(homeButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(77, 88, 112, 21);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Product Type");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(77, 123, 112, 21);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(191, 121, 126, 25);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Price range");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(77, 157, 112, 21);
		getContentPane().add(lblNewLabel_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(191, 155, 45, 25);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("100");
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(261, 155, 45, 25);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("--");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2_1.setBounds(240, 157, 112, 21);
		getContentPane().add(lblNewLabel_1_1_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Check out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(591, 477, 122, 31);
		getContentPane().add(btnNewButton_1_1);
		
	}
}
