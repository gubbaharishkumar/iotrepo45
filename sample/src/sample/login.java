
package sample;
import java.awt.EventQueue;
import javax.swing.*;  

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;  
public class login {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
				
		
		tb1 = new JTextField();
		tb1.setBounds(167, 52, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ROLL NO");
		lblNewLabel.setBounds(52, 52, 90, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(81, 83, 76, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT REGISTER FORM");
		lblNewLabel_2.setBounds(157, 11, 170, 30);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(76, 118, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JTextField();
		tb2.setBounds(167, 83, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "IOT", "CSE", "IT", "ECE"}));
		cb1.setBounds(177, 114, 66, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(82, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rb1 = new JRadioButton("MALE");
		rb1.setBounds(148, 155, 66, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		rb2.setBounds(217, 155, 66, 23);
		frame.getContentPane().add(rb2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(157, 195, 39, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBounds(202, 195, 51, 23);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(67, 199, 90, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBounds(265, 195, 76, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		
		final JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) c1.getSelectedItem();
				String gender=" ";
				String lan=" ";
				if(rb1.isSelected())
				{
					gender="male";
				}
				if(rb2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected()) {
					lan+="c";
				}
				if(c2.isSelected()) {
					lan+="java";
				}
				if(c3.isSelected()) {
					lan+="python";
				}
				JOptionPane.showMessageDialog(btnNewButton ,"Roll:" +roll+ "\nName:"+name +"\nbranch :"+branch +"\ngender "+gender +"\nprog lang"+lan);
				
	)};
		btnNewButton.setBounds(167, 225, 89, 23);
		frame.getContentPane().add(btnNewButton);

	}
}
