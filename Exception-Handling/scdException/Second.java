package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Second extends JFrame {

	private JPanel contentPane;
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
					Second frame = new Second();
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
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter String");
		lblNewLabel.setBounds(10, 44, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Phone Number");
		lblNewLabel_1.setBounds(213, 44, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(98, 41, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(347, 41, 161, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_2 = new JTextField();
		textField_2.setBounds(148, 173, 167, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Length");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String a = textField.getText();
				int z = a.length();
				if(z == 0) {
					throw new NullPointerException(" Here is Null Pointer");
				}
				else {
				String zs = Integer.toString(z);
				textField_2.setText("String size is " + zs);
				}
				}
				catch(NullPointerException ex) {
					JOptionPane.showMessageDialog(btnNewButton,ex, "Null Pointer Exception", JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(btnNewButton,ex, "Exception", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(21, 108, 105, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check Phone");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				String a = textField_1.getText();
				int z = a.length();
				if (z == 11)
				{
					textField_2.setText(Integer.toString(z));
				}
				else {
					throw new RuntimeException("Invalid Phone no. ");
				}
				}
				catch(RuntimeException ex){
					JOptionPane.showMessageDialog(btnNewButton_1, ex,"Runtime Error", JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(btnNewButton,ex, "Exception", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		btnNewButton_1.setBounds(169, 108, 129, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Array Exception");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String a = textField.getText();
				
					
					textField_2.setText(Character.toString(a.charAt(10)));
				}
				catch(StringIndexOutOfBoundsException ex){
					JOptionPane.showMessageDialog(btnNewButton_2, ex,"String Index Error", JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(btnNewButton_2, ex,"Exception", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnNewButton_2.setBounds(329, 108, 138, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setBounds(56, 176, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		
	}

}
