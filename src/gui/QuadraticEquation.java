package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class QuadraticEquation extends JFrame {

	private JPanel contentPane;
	private JTextField aTextField;
	private JTextField bTextField;
	private JTextField cTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		QuadraticEquation frame = new QuadraticEquation();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public QuadraticEquation() {
		setTitle("Квадратное уравнение");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel equation = new JLabel("ax^2 + bx + c = 0");
		equation.setFont(new Font("Arial", Font.BOLD, 18));
		equation.setForeground(Color.RED);
		equation.setBackground(Color.WHITE);
		equation.setBounds(135, 11, 159, 39);
		contentPane.add(equation);
		
		aTextField = new JTextField();
		aTextField.setBounds(61, 61, 48, 39);
		contentPane.add(aTextField);
		aTextField.setColumns(10);
		
		JLabel aLabel = new JLabel("A =");
		aLabel.setBounds(21, 61, 35, 39);
		contentPane.add(aLabel);
		
		JLabel bLabel_1 = new JLabel("B =");
		bLabel_1.setBounds(176, 61, 35, 39);
		contentPane.add(bLabel_1);
		
		bTextField = new JTextField();
		bTextField.setColumns(10);
		bTextField.setBounds(216, 61, 48, 39);
		contentPane.add(bTextField);
		
		JLabel cLabel = new JLabel("C =");
		cLabel.setBounds(312, 61, 35, 39);
		contentPane.add(cLabel);
		
		cTextField = new JTextField();
		cTextField.setColumns(10);
		cTextField.setBounds(352, 61, 48, 39);
		contentPane.add(cTextField);
		
		JLabel lblDB = new JLabel("D = b * b - 4 * a * c");
		lblDB.setForeground(Color.RED);
		lblDB.setFont(new Font("Arial", Font.BOLD, 18));
		lblDB.setBackground(Color.WHITE);
		lblDB.setBounds(135, 111, 171, 39);
		contentPane.add(lblDB);
		
		JLabel disLabel = new JLabel("D =");
		disLabel.setFont(new Font("Arial", Font.BOLD, 18));
		disLabel.setBounds(34, 158, 48, 39);
		contentPane.add(disLabel);
		
		JLabel disResLabel = new JLabel("");
		disResLabel.setFont(new Font("Arial", Font.BOLD, 18));
		disResLabel.setBounds(100, 158, 164, 39);
		contentPane.add(disResLabel);
		
		JLabel corniLabel = new JLabel("");
		corniLabel.setForeground(Color.RED);
		corniLabel.setFont(new Font("Arial", Font.BOLD, 18));
		corniLabel.setBackground(Color.WHITE);
		corniLabel.setBounds(61, 208, 339, 39);
		contentPane.add(corniLabel);
		
		JLabel x1Label = new JLabel("");
		x1Label.setFont(new Font("Arial", Font.BOLD, 18));
		x1Label.setBounds(34, 258, 48, 39);
		contentPane.add(x1Label);
		
		JLabel x1ResLabel = new JLabel("");
		x1ResLabel.setFont(new Font("Arial", Font.BOLD, 18));
		x1ResLabel.setBounds(100, 258, 111, 39);
		contentPane.add(x1ResLabel);
		
		JLabel x2Label = new JLabel("");
		x2Label.setFont(new Font("Arial", Font.BOLD, 18));
		x2Label.setBounds(251, 258, 48, 39);
		contentPane.add(x2Label);
		
		JLabel x2ResLabel = new JLabel("");
		x2ResLabel.setFont(new Font("Arial", Font.BOLD, 18));
		x2ResLabel.setBounds(317, 258, 107, 39);
		contentPane.add(x2ResLabel);
		
		JButton culcButton = new JButton("Расчитать");
		culcButton.setFont(new Font("Arial", Font.BOLD, 18));
		culcButton.setBounds(146, 322, 148, 55);
		contentPane.add(culcButton);
		
		JButton cButton = new JButton("C");
		cButton.setForeground(Color.RED);
		cButton.setFont(new Font("Arial", Font.BOLD, 18));
		cButton.setBounds(336, 322, 55, 55);
		contentPane.add(cButton);
		
		culcButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String aT = aTextField.getText();
				String bT = bTextField.getText();
				String cT = cTextField.getText();
				
				int a = Integer.parseInt(aT);
				int b = Integer.parseInt(bT);
				int c = Integer.parseInt(cT);
				
				double D = b * b - 4 * a * c;
				disResLabel.setText(D + "");
				
				if (D < 0) {
					corniLabel.setText("Уравнение не имеет корней");
				}else if (D==0) {
					corniLabel.setText("Уравнение имеет один корень");
					double x = -b / 2 * a;
					x1ResLabel.setText(x + "");
					x1Label.setText("X = ");
				}else if (D > 0) {
					corniLabel.setText("Уравнение имеет два корня");
					double x1 = (-b + Math.sqrt(D)) / 2 * a;
					double x2 = (-b - Math.sqrt(D)) / 2 * a;
					x1ResLabel.setText(x1 + "");
					x2ResLabel.setText(x2 + "");
					x1Label.setText("X1 = ");
					x2Label.setText("X2 = ");
				}
			}
			
		});
		cButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				corniLabel.setText("");
				x1ResLabel.setText("");
				x2ResLabel.setText("");
				x1Label.setText("");
				x2Label.setText("");
				disResLabel.setText("");
			}
		});
	}
}
