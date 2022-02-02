package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;

public class LoginFrame extends JFrame {
	
	private static final String SU_ID = "root";
	private static final String SU_PWD = "123";

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
			
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("ID and Pasword");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LoginButton.setForeground(Color.RED);
		LoginButton.setBackground(Color.ORANGE);
		
		LoginButton.setBounds(140, 197, 89, 23);
		contentPane.add(LoginButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 103, 128, 20);
		contentPane.add(passwordField);
		
		JLabel iDLabel = new JLabel("User ID");
		iDLabel.setBounds(26, 49, 46, 14);
		contentPane.add(iDLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setBounds(26, 106, 46, 14);
		contentPane.add(passwordLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(118, 46, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel statusLabel = new JLabel("");
		statusLabel.setBounds(54, 11, 266, 27);
		contentPane.add(statusLabel);
		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = textField.getText();
				String userPwd = passwordField.getText();
				
				if(userId.equalsIgnoreCase(SU_ID)) {
					if(userPwd.equalsIgnoreCase(SU_PWD)) {
						// show main page
						MainFrame main = new MainFrame();
						main.setTitle("MAIN APP PAGE");
						main.setVisible(true);
						System.out.println("Hello, " + userId);
					}else {
						statusLabel.setText("Incorect password!");
					}
					// "Root" = "root"
				} else {
					statusLabel.setText("Incorect User id!");
				}
			}
		});
	}
}
