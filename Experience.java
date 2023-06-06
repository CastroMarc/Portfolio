import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Experience extends JFrame {

	public JPanel Exprnc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Experience frame = new Experience();
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
	public Experience() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/luiz/Downloads/Portfolio BG/Page4_BG.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 559);
		Exprnc = new JPanel();
		Exprnc.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(Exprnc);
		setLocationRelativeTo(null);
		Exprnc.setLayout(null);
		
		//Description
		JTextArea txtrBeforeIWant = new JTextArea();
		txtrBeforeIWant.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtrBeforeIWant.setBackground(Color.BLACK);
		txtrBeforeIWant.setForeground(Color.WHITE);
		txtrBeforeIWant.setText("Before I want to college I've been in some  part time jobs as a virtual \nassissant, I was  assigned to different tasks but it is more on social media \nmanaging. Now in college  I'm learning more about programming and use \nmy gain knowledge in the future.");
		txtrBeforeIWant.setBounds(29, 176, 404, 63);
		Exprnc.add(txtrBeforeIWant);
		
		//EXperience
		JTextArea txtrBeforeIWant_1 = new JTextArea();
		txtrBeforeIWant_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtrBeforeIWant_1.setText("Virtual Assistant on NC Projects (Part Time)\n\n⁍ Social Media Growth Manager - Manage growth of following count of\n   (Instagram)                                  my client by enggaging with other users\n\n⁍ Digital Designer - Designs poster and instagram posts for clients ranging from\n                                 realtors, Influencers, and startups\n\n⁍ Data Researcher on a - Researching data from different hotels around the world\n   hotel booking website   and putting information to their dashboard \n ");
		txtrBeforeIWant_1.setForeground(Color.WHITE);
		txtrBeforeIWant_1.setBackground(Color.BLACK);
		txtrBeforeIWant_1.setBounds(18, 251, 445, 183);
		Exprnc.add(txtrBeforeIWant_1);
		
		
		//Button
		JButton btnBck = new JButton("Back");
		btnBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				portfolio1 Main = new portfolio1();
				Main.setVisible(true);
				dispose();
				
			}
		});
		btnBck.setBounds(704, 496, 117, 29);
		Exprnc.add(btnBck);
		
		
		//Background
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (2)/Page4_BG.png"));
		lblNewLabel.setBounds(0, 0, 821, 531);
		Exprnc.add(lblNewLabel);
		
	}

}
