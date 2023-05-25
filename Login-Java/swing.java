package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class swing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing frame = new swing();
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
	public swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(84, 28, 169, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(24, 73, 76, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(24, 119, 76, 21);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(94, 73, 250, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 119, 250, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Agree");
		rdbtnNewRadioButton.setBounds(65, 156, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("OK");
		chckbxNewCheckBox.setBounds(241, 156, 103, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("Pending...");
		lblNewLabel_3.setBounds(65, 186, 78, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Radio");
		lblNewLabel_4.setBounds(184, 186, 115, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Checkbox");
		lblNewLabel_5.setBounds(309, 186, 90, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Login Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = textField.getText();
				String pass = textField_1.getText();
				
				if(data.equals("Ali") && pass.equals("123")) 
				{
				
					lblNewLabel_3.setText("Verified");
				}
				else {
					lblNewLabel_3.setText("Not Verified");
				}
				
				if(rdbtnNewRadioButton.isSelected())
					{
					lblNewLabel_4.setText("R Check");
					}
				else
				{
					lblNewLabel_4.setText("Not Checked");
				}
				
				if(chckbxNewCheckBox.isSelected())
				{
					lblNewLabel_5.setText("C Check");
				}
				else
				{
					lblNewLabel_5.setText("Unchecked");
				}
				
			}
		});
		btnNewButton.setBounds(164, 227, 115, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		

	}
}
