package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String value;
	String out;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyCalculator frame = new CurrencyCalculator();
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
	public CurrencyCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Currency Calculator", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(26, 68, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(166, 68, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(299, 68, 46, 14);
		panel.add(lblNewLabel_2);
		
		String currency[]= {"PAKISTANI RUPPEE","BRITISH EURO"};
		DefaultComboBoxModel <String> firstModel = new DefaultComboBoxModel<>(currency);
		JComboBox <String> comboBox = new JComboBox(currency);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try
				{	
					//JComboBox<String> comboBox= (JComboBox<String>)e.getSource();
					value = (String) comboBox.getSelectedItem();
				}
				catch(Exception  e1)
				{
					JOptionPane.showMessageDialog(comboBox, e1);
				}
			}
			
		}
				);
		comboBox.setBounds(275, 105, 149, 22);
		panel.add(comboBox);
		
		String currencyTo [] = {"US DOLLAR","EURO"};
		JComboBox comboBox_1 = new JComboBox(currencyTo);
		comboBox_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				//JComboBox <String> comboBox_1 = (JComboBox<String>)e.getSource();
				out = (String) comboBox_1.getSelectedItem();
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(comboBox_1, e1);
				}
			}
			
		});
		comboBox_1.setBounds(125, 105, 137, 22);
		panel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(21, 106, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Converted Amount");
		lblNewLabel_3.setBounds(61, 182, 108, 14);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 179, 123, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				int num;
				double result = 0;
				num = Integer.parseInt(textField.getText());
				
				
				if(out=="US DOLLAR" && value =="PAKISTANI RUPPEE")
				{
					result = num * 198.67;
					
				}
				else if(out=="EURO" && value=="PAKISTANI RUPPEE")
				{
					result =num * 213.82;
					
				}
				else if(out=="EURO" && value=="BRITISH EURO")
				{
					result =num * 0.85;
					
				}
				else if(out=="US DOLLAR" && value=="BRITISH EURO")
				{
					result =num * 0.79;
					
				}
				textField_1.setText(Double.toString(result));
				}
				catch(Exception e3) {
				JOptionPane.showMessageDialog(btnNewButton, e3);
				}
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(154, 216, 123, 34);
		panel.add(btnNewButton);
	}
}
