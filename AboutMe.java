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

public class AboutMe extends JFrame {

	public JPanel AbtMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
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
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 559);
		AbtMe = new JPanel();
		AbtMe.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(AbtMe);
		setLocationRelativeTo(null);
		AbtMe.setLayout(null);
		
		
		//Decription
		JTextArea txtrIAmA = new JTextArea();
		txtrIAmA.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		txtrIAmA.setText("Contact\n\n⁍ Name: \n   Marc Luiz Castro\n\n⁍ Email:\n   mlcastro0405@gmail.com\n\n⁍ Phone Number:\n   +639761608601\n\n⁍ Address:\n   Blk 2, Lot 24 Armel 7A Subd. Banaba,\n   San Mateo Rizal\n \n\n\n");
		txtrIAmA.setForeground(new Color(255, 255, 255));
		txtrIAmA.setBackground(Color.BLACK);
		txtrIAmA.setBounds(25, 242, 204, 252);
		AbtMe.add(txtrIAmA);
		
		
		//Contact
		JTextArea txtrIAmA_1 = new JTextArea();
		txtrIAmA_1.setText("I am a student from National University Manila, currently taking BSIT-MAA. I was born on \nMarch 5, 2004, and some of my hobbies include badminton, coffee shop hopping, digital \ndesign, and listening to music");
		txtrIAmA_1.setForeground(new Color(255, 255, 255));
		txtrIAmA_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		txtrIAmA_1.setBackground(Color.BLACK);
		txtrIAmA_1.setBounds(25, 170, 437, 39);
		AbtMe.add(txtrIAmA_1);
		
	
		//Education
		JTextArea txtrEducationCollegecurrent = new JTextArea();
		txtrEducationCollegecurrent.setText("Education\n\n⁍ College (Current):\n   National University Manila\n\n⁍ High School:\n   APEC Schools Maikina Heights\n   (Graduated with high honors)\n\n⁍ Elementary School:\n   Sto Nino Elementary School\n\n\n");
		txtrEducationCollegecurrent.setForeground(Color.WHITE);
		txtrEducationCollegecurrent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		txtrEducationCollegecurrent.setBackground(Color.BLACK);
		txtrEducationCollegecurrent.setBounds(294, 242, 183, 209);
		AbtMe.add(txtrEducationCollegecurrent);
		
		
		//Back Button
		JButton btn_Bck = new JButton("Back");
		btn_Bck.setForeground(Color.BLACK);
		btn_Bck.setBackground(Color.CYAN);
		btn_Bck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				portfolio1 Main = new portfolio1();
				Main.setVisible(true);
				dispose();
				
			}
		});
		btn_Bck.setBounds(698, 496, 117, 29);
		AbtMe.add(btn_Bck);
		
		
		//Background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (2)/Page2 _BG.png"));
		lblNewLabel.setBounds(0, 6, 821, 531);
		AbtMe.add(lblNewLabel);
		
	
		
		
	}
}
