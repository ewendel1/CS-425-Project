package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Signup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 810, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Sign Up");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 10, 265, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(55, 71, 137, 42);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCustomer = new JLabel("Password");
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCustomer.setBounds(55, 124, 137, 42);
		frame.getContentPane().add(lblCustomer);
		
		JLabel lblCreditCar = new JLabel("Confirm Password");
		lblCreditCar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCreditCar.setBounds(55, 176, 137, 42);
		frame.getContentPane().add(lblCreditCar);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(55, 234, 137, 42);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLastName.setBounds(55, 288, 137, 42);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAge = new JLabel("Age (optional)");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge.setBounds(55, 340, 137, 42);
		frame.getContentPane().add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(197, 85, 137, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 138, 137, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 190, 137, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(197, 248, 137, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(197, 302, 137, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(197, 354, 137, 19);
		frame.getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(137, 413, 126, 42);
		frame.getContentPane().add(btnNewButton);
	}

}
