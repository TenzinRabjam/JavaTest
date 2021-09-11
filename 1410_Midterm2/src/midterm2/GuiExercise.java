package midterm2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 * Assignment: Midterm-2
 * program:    GUI-Exercise
 * Created:    Jul 18, 2017
 * Author:     Tenzin
 */
public class GuiExercise extends JFrame {

	private JPanel contentPane;
	private Icon pictures;
	private int i = 1;
   //index 0 = white index 1 = light gray
	private Color[] colors ={new Color(220, 238, 245), new Color(72, 88, 104)};
	private JLabel lblNewYork;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExercise frame = new GuiExercise();
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
	public GuiExercise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setOpaque(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(220, 238, 245));
		setContentPane(contentPane);

		final JLabel ladyLiberty = new JLabel();
		ladyLiberty.setBackground(new Color(220, 238, 245));
		ladyLiberty.setOpaque(true);

		pictures = new ImageIcon(getClass().getResource("\\Images\\NewYork.png"));

		ladyLiberty.setIcon(pictures);

		contentPane.setBackground(new Color(112,128,144));

		contentPane.add(ladyLiberty, BorderLayout.CENTER);
        
		//create action listener
		JButton btnNewButton = new JButton("Show New York at Night");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(112, 128, 144));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//each time the button is clicked it will fall into the if or else statement changing the value of i.
            if(i == 2)
				{
             //set i equal to 0 then white (index 0) will be displayed
					i = 0;
					ladyLiberty.setBackground(colors[i]);
					btnNewButton.setText("Show New York at Night");
				}
				else {
               //set i equal to 2 then light gray (index 1) will be displayed.  use color[i-1] to prevent array out of bounds exception
					i =2;
					ladyLiberty.setBackground( colors[i - 1]);
					btnNewButton.setText("Show New York at Day");
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);

		lblNewYork = new JLabel("New York");
		lblNewYork.setBorder(new EmptyBorder(7, 0, 7, 0));
		lblNewYork.setOpaque(true);
		lblNewYork.setBackground(new Color(112, 128, 144));
		lblNewYork.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewYork.setForeground(new Color(240, 248, 255));
		lblNewYork.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewYork, BorderLayout.NORTH);
	}
}
