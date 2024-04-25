package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicket window = new MetroTicket();
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
	public MetroTicket() {
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
		
		JLabel lblNewLabel = new JLabel("Metro Ticket");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 11, 176, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(32, 62, 46, 14);
		frame.getContentPane().add(Name);
		
		tb1 = new JTextField();
		tb1.setBounds(98, 59, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tickets");
		lblNewLabel_1.setBounds(232, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setBounds(32, 135, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setBounds(232, 138, 75, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.setBounds(193, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSpinner sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		sp1.setBounds(317, 59, 86, 20);
		frame.getContentPane().add(sp1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kphb", "Raidurg", "Ameerpet"}));
		cb1.setBounds(98, 135, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kphb", "Raidurg", "Ameerpet"}));
		cb2.setBounds(317, 131, 86, 22);
		frame.getContentPane().add(cb2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=tb1.getText();
			int nt=(int)sp1.getValue();
			int bill=0;
			String s=(String)cb1.getSelectedItem();
			String d=(String)cb2.getSelectedItem();
			if(s.equals(d))
				JOptionPane.showMessageDialog(btnNewButton, "Check Source And Destination");
			else
			{
				bill+=nt*45;
				JOptionPane.showMessageDialog(btnNewButton, "Name:"+name+"\nSource:"+s+"\nDestination:"+d+"\nTickets:"+nt+"Totalt:");
			}
			}
		});
	}
}
