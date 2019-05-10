package views;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class TelaDeCadastroMock extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */		
	public TelaDeCadastroMock() {
		setBackground(SystemColor.activeCaptionBorder);
		int width = utils.GetRenderMax.getWidth();
		int heigth = utils.GetRenderMax.getHeigth();
		setBounds(width/3, heigth/3, width,heigth);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 27, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 102, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 1342, SpringLayout.WEST, panel);
		panel_1.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 3, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, 563, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -24, SpringLayout.EAST, panel);
		panel.add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 60, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 123, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 105, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1, 335, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_1, 123, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_1, 51, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_1, 552, SpringLayout.WEST, panel_2);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("New label");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label, 22, SpringLayout.SOUTH, textField_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, lblNewLabel_1);
		label.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(label);
		
		textField_2 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, label);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_2, 123, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_2, 136, SpringLayout.SOUTH, label);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_2, 559, SpringLayout.WEST, panel_2);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("New label");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_1, 27, SpringLayout.SOUTH, textField_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, label);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(label_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		sl_panel_2.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 6, SpringLayout.SOUTH, label_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, lblNewLabel_1);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(rdbtnNewRadioButton);
		
		JLabel label_2 = new JLabel("New label");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_2, 22, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_2, 0, SpringLayout.WEST, lblNewLabel_1);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(label_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 20, SpringLayout.SOUTH, label_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_2.add(chckbxNewCheckBox);
		
		JLabel label_3 = new JLabel("New label");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_3, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_3, 277, SpringLayout.EAST, lblNewLabel_1);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(label_3);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, formattedTextField, 60, SpringLayout.EAST, textField_1);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(formattedTextField);
		
		JLabel label_4 = new JLabel("New label");
		sl_panel_2.putConstraint(SpringLayout.SOUTH, formattedTextField, -20, SpringLayout.NORTH, label_4);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, label_4, -369, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_4, 0, SpringLayout.EAST, label_3);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox, 53, SpringLayout.EAST, textField_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox, -195, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, formattedTextField, 0, SpringLayout.EAST, comboBox);
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox, 19, SpringLayout.SOUTH, label_4);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, comboBox, -299, SpringLayout.SOUTH, panel_2);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_2.add(comboBox);
		
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"DEU CERTO!");
		}
	}
}
