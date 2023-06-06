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

public class Skills extends JFrame {

	public JPanel Skls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Skills() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 559);
		Skls = new JPanel();
		Skls.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(Skls);
		setLocationRelativeTo(null);
		Skls.setLayout(null);
		
		//Jon Skills
		JTextArea txtr_JobSkls = new JTextArea();
		txtr_JobSkls.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtr_JobSkls.setText(" Job skills\n\n⁍ Leadership\n\n⁍ Strategic thinking\n\n⁍ Reliability\n\n⁍ Team communication\n\n⁍ Time management");
		txtr_JobSkls.setForeground(new Color(255, 255, 255));
		txtr_JobSkls.setBackground(Color.BLACK);
		txtr_JobSkls.setBounds(44, 200, 175, 227);
		Skls.add(txtr_JobSkls);
		
		//EXpertise
		JTextArea txtr_Exprts = new JTextArea();
		txtr_Exprts.setText("Expertise\n\n⁍ Digital Design\n\n⁍ Creativity\n\n⁍ Research\n");
		txtr_Exprts.setForeground(Color.WHITE);
		txtr_Exprts.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtr_Exprts.setBackground(Color.BLACK);
		txtr_Exprts.setBounds(274, 200, 158, 143);
		Skls.add(txtr_Exprts);
		
		
		//Button
		JButton btn_Bck = new JButton("Back");
		btn_Bck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				portfolio1 Main = new portfolio1();
				Main.setVisible(true);
				dispose();
				
			}
		});
		btn_Bck.setBounds(698, 496, 117, 29);
		Skls.add(btn_Bck);
		
		
		//Background
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/luiz/Downloads/Portfolio BG (2)/Page3_BG.png"));
		lblNewLabel.setBounds(0, 0, 821, 531);
		Skls.add(lblNewLabel);
		
	}

}
