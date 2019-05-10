package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TelaDeAutenticacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private static MainFrame ms = new MainFrame();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeAutenticacao frame = new TelaDeAutenticacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void runMain() {
		ms.main(null);
	}
	
	public static void closeTA() {
	}
	
	/**
	 * Create the frame.
	 */
	public TelaDeAutenticacao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaDeAutenticacao.class.getResource("/images/sombadge-01.png")));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		int width = utils.GetRenderMax.getWidth();
		int heigth = utils.GetRenderMax.getHeigth();
		setBounds(width/3, heigth/3, width/3, heigth/3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(58, 42, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(47, 67, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(58, 98, 46, 14);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(47, 123, 86, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(58, 154, 75, 20);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\BtmBRDEV\\Pictures\\sombadge-01.png"));
		lblNewLabel_2.setBounds(93, -42, 362, 316);
		panel.add(lblNewLabel_2);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().contentEquals("") && passwordField.getText().contentEquals("")){
				 runMain();
				 dispose();
				}	
			}
		});
		
		
	}
	
}
