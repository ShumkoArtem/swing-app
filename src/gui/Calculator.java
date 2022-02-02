package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField num1textField;
	private JTextField num2textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Calculator frame = new Calculator();
					frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1textField = new JTextField();
		num1textField.setBounds(31, 29, 94, 69);
		contentPane.add(num1textField);
		num1textField.setColumns(10);
		
		num2textField = new JTextField();
		num2textField.setBounds(148, 29, 94, 69);
		contentPane.add(num2textField);
		num2textField.setColumns(10);
		
		JButton plusButton = new JButton("+");
		plusButton.setBounds(31, 154, 62, 54);
		contentPane.add(plusButton);
		
		JButton minusButton = new JButton("-");
		minusButton.setBounds(133, 154, 62, 54);
		contentPane.add(minusButton);
		
		JButton multButton = new JButton("*");
		multButton.setBounds(240, 154, 62, 54);
		contentPane.add(multButton);
		
		JButton divisionButton = new JButton("/");
		divisionButton.setBounds(341, 154, 62, 54);
		contentPane.add(divisionButton);
		
		JLabel resultLabel = new JLabel("");
		resultLabel.setBounds(295, 29, 108, 69);
		contentPane.add(resultLabel);
		
		JLabel ravnoLabel = new JLabel("=");
		ravnoLabel.setBounds(269, 56, 35, 14);
		contentPane.add(ravnoLabel);
		
		JLabel znakLabel = new JLabel(" ");
		znakLabel.setBounds(125, 44, 23, 38);
		contentPane.add(znakLabel);
		
		plusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = num1textField.getText();
				String num2 = num2textField.getText();
				
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				
				double sum = n1 + n2;
				
				resultLabel.setText(sum + "");
				znakLabel.setText("+");
				
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = num1textField.getText();
				String num2 = num2textField.getText();
				
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				
				double diff = n1 - n2;
				
				resultLabel.setText(diff + "");
				znakLabel.setText("-");
				
			}
		});
		
		multButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = num1textField.getText();
				String num2 = num2textField.getText();
				
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				
				double mult = n1 * n2;
				
				resultLabel.setText(mult + "");
				znakLabel.setText("*");
				
			}
		});
		
		divisionButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = num1textField.getText();
				String num2 = num2textField.getText();
				
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				
				double div = n1 / n2;
				
				resultLabel.setText(div + "");
				znakLabel.setText("/");
				
			}
		});
	}

}
