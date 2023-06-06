import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JComboBox;


//When JFrame is extended the portfolio1 class inherits all the properties and methods of 
//the JFrame class, allowing us to customize and enhance its functionality to suit our specific needs.

public class portfolio1 extends JFrame {

	public JPanel Main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					portfolio1 frame = new portfolio1();
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
	public portfolio1() {
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 559);
		Main = new JPanel();
		Main.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(Main);
		setLocationRelativeTo(null);
		Main.setLayout(null);
		
		
		//Page text
		JLabel lbl_Name = new JLabel("MARC LUIZ CASTRO");
		lbl_Name.setForeground(new Color(255, 255, 255));
		lbl_Name.setFont(new Font("Kohinoor Gujarati", Font.PLAIN, 31));
		lbl_Name.setBounds(240, 202, 374, 56);
		Main.add(lbl_Name);
		
		
		//Buttons
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (1)/ABOUT ME.png"));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AboutMe AbtMe = new AboutMe();
				AbtMe.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(332, 304, 133, 52);
		Main.add(btnNewButton);
		
		JButton btnEducation = new JButton("");
		btnEducation.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (1)/SKILLS.png"));
		btnEducation.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Skills Skls = new Skills();
				Skls.setVisible(true);
				dispose();
			}
		});
		btnEducation.setForeground(Color.BLACK);
		btnEducation.setBounds(332, 368, 133, 52);
		Main.add(btnEducation);
		
		JButton btnExperiences = new JButton("");
		btnExperiences.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (1)/EXPERIENCE.png"));
		btnExperiences.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnExperiences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Experience Exprnc = new Experience();
				Exprnc.setVisible(true);
				dispose();
			}
		});
		btnExperiences.setForeground(Color.BLACK);
		btnExperiences.setBounds(332, 432, 133, 52);
		Main.add(btnExperiences);
		
		
		//Main_Background
		JLabel lbl_BG = new JLabel("");
		lbl_BG.setFont(new Font("Sinhala MN", Font.PLAIN, 13));
		lbl_BG.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG/Page1_BG.png"));
		lbl_BG.setBounds(0, 0, 821, 541);
		Main.add(lbl_BG);
			

	}
}
