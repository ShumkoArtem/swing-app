package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private JPanel num1div;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setForeground(new Color(0, 0, 51));
		setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setBackground(Color.GREEN);
		setTitle("MAIN APP PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		num1div = new JPanel();
		num1div.setForeground(Color.BLACK);
		num1div.setBackground(Color.PINK);
		num1div.setToolTipText("");
		num1div.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(num1div);
		num1div.setLayout(null);
		
		JButton culcButton = new JButton("culc");
		culcButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		culcButton.setForeground(new Color(204, 51, 153));
		culcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		culcButton.setBounds(111, 427, 233, 23);
		num1div.add(culcButton);
		
		textField = new JTextField();
		textField.setBounds(28, 41, 86, 20);
		num1div.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 89, 86, 20);
		num1div.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel oneLabel = new JLabel("1 number");
		oneLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		oneLabel.setBounds(171, 44, 115, 14);
		num1div.add(oneLabel);
		
		JLabel twoLabel = new JLabel("2 number");
		twoLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twoLabel.setBounds(171, 92, 101, 14);
		num1div.add(twoLabel);
		
		JLabel num1 = new JLabel("Num1");
		num1.setBounds(24, 162, 46, 14);
		num1div.add(num1);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(94, 162, 46, 14);
		num1div.add(lblNewLabel_1);
		
		JLabel num2 = new JLabel("Num2");
		num2.setBounds(171, 162, 46, 14);
		num1div.add(num2);
		
		JLabel lblNewLabel_3 = new JLabel("=");
		lblNewLabel_3.setBounds(249, 162, 62, 14);
		num1div.add(lblNewLabel_3);
		
		JLabel sumLable = new JLabel("summa");
		sumLable.setBounds(342, 162, 46, 14);
		num1div.add(sumLable);
		
		JLabel num1dif = new JLabel("Num1");
		num1dif.setBounds(24, 198, 46, 14);
		num1div.add(num1dif);
		
		JLabel lblNewLabel_1_1 = new JLabel("-");
		lblNewLabel_1_1.setBounds(94, 198, 46, 14);
		num1div.add(lblNewLabel_1_1);
		
		JLabel num2dif = new JLabel("Num2");
		num2dif.setBounds(171, 198, 46, 14);
		num1div.add(num2dif);
		
		JLabel difLabel = new JLabel("difference");
		difLabel.setBounds(342, 198, 46, 14);
		num1div.add(difLabel);
		
		JLabel num1mul = new JLabel("Num1");
		num1mul.setBounds(24, 233, 46, 14);
		num1div.add(num1mul);
		
		JLabel lblNewLabel_1_2 = new JLabel("*");
		lblNewLabel_1_2.setBounds(94, 233, 46, 14);
		num1div.add(lblNewLabel_1_2);
		
		JLabel num2mul = new JLabel("Num2");
		num2mul.setBounds(171, 233, 46, 14);
		num1div.add(num2mul);
		
		JLabel multLabel = new JLabel("multiplication");
		multLabel.setBounds(342, 233, 46, 14);
		num1div.add(multLabel);
		
		JLabel num1Division = new JLabel("Num1");
		num1Division.setBounds(24, 269, 46, 14);
		num1div.add(num1Division);
		
		JLabel lblNewLabel_1_3 = new JLabel("/");
		lblNewLabel_1_3.setBounds(94, 269, 46, 14);
		num1div.add(lblNewLabel_1_3);
		
		JLabel num2division = new JLabel("Num2");
		num2division.setBounds(171, 269, 46, 14);
		num1div.add(num2division);
		
		JLabel divLabel = new JLabel("division");
		divLabel.setBounds(342, 269, 46, 14);
		num1div.add(divLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("=");
		lblNewLabel_3_1.setBounds(249, 198, 62, 14);
		num1div.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("=");
		lblNewLabel_3_2.setBounds(249, 233, 62, 14);
		num1div.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("=");
		lblNewLabel_3_3.setBounds(249, 269, 62, 14);
		num1div.add(lblNewLabel_3_3);
		
		culcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numAtext = textField.getText();
				String numBtext = textField_1.getText();
				
				double numA = Double.parseDouble(numAtext);
				double numB = Double.parseDouble(numBtext);
				
				
				double summa = numA + numB;
				
				//set text
				sumLable.setText(summa + "");
				num1.setText(numAtext);
				num2.setText(numBtext);
				
				difLabel.setText(numA - numB + "");
				num1dif.setText(numAtext);
				num2dif.setText(numBtext);
				
				multLabel.setText(numA * numB + "");
				num1mul.setText(numAtext);
				num2mul.setText(numBtext);
				
				divLabel.setText(numA / numB + "");
				num1Division.setText(numAtext);
				num2division.setText(numBtext);
				
				
			}
		});
	}

}
