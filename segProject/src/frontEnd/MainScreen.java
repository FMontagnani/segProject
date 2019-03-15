package frontEnd;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;

import utils.GetRenderMax;
import javax.swing.JComboBox;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int heigth =  utils.GetRenderMax.getHeigth();
		int width = utils.GetRenderMax.getWidth();
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, width, heigth);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1241, 0, 109, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Item A");
		comboBox.addItem("Item B");
		comboBox.addItem("Item C");
		
		
	}
}
