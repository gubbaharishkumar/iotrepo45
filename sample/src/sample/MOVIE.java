package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MOVIE {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIE window = new MOVIE();
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
	public MOVIE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setBounds(115, 11, 189, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(85, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(73, 95, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO OF TICKETS");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(73, 137, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBounds(171, 54, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "KALKI ", "JAI SHREE RAM"}));
		cb1.setBounds(171, 91, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "1", "2", "3", "4", "5"}));
		cb2.setBounds(169, 133, 78, 22);
		frame.getContentPane().add(cb2);
		
		final JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String movie=(String)cb1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("kalki")) {
					bill+=nt*250;
				}
				if(movie.equals("Jai Shree Ram")) {
					bill+=nt*250;
				}
				int ress=0;
				ress=JOptionPane.showConfirmDialog(btnNewButton,"Name:"+name+"\nMovie name:"+movie +"\nNo of Tickets:"+nt );
				if(ress == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "booking confirmed");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "booking cancelled");
				}
			}
		});
		btnNewButton.setBounds(147, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\33.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 271);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
