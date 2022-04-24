package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Canvas;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 555); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(90, 208, 85, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(167, 372, 113, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(514, 372, 113, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(90, 286, 85, 43);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(427, 208, 85, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword_1.setBounds(427, 286, 85, 43);
		contentPane.add(lblPassword_1);
		
		textField = new JTextField();
		textField.setBounds(204, 215, 122, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 300, 122, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(548, 219, 122, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(548, 300, 122, 26);
		contentPane.add(textField_3);
		
		JLabel lblCustomer = new JLabel("Customer Sign in");
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCustomer.setBounds(90, 144, 160, 43);
		contentPane.add(lblCustomer);
		
		JLabel lblEmployee = new JLabel("Employee Sign in");
		lblEmployee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmployee.setBounds(427, 144, 169, 43);
		contentPane.add(lblEmployee);
		
		JLabel lblOnlineRetailer = new JLabel("Online Retailer");
		lblOnlineRetailer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOnlineRetailer.setBounds(327, 44, 180, 43);
		contentPane.add(lblOnlineRetailer);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSignUp.setBounds(167, 447, 113, 43);
		contentPane.add(btnSignUp);
		
		JLabel lblOr = new JLabel("Or");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOr.setBounds(204, 410, 85, 43);
		contentPane.add(lblOr);
	}
}
