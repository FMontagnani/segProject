package views;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.JTabbedPane;

public class TelaPrincipal extends JPanel {
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_1;
	private JTable table_4;
	private JTable table_5;
	private JTextField textField_2;
	private JTable table_6;
	private JTable table_7;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public TelaPrincipal() {
		int width = utils.GetRenderMax.getWidth();
		int heigth = utils.GetRenderMax.getHeigth();
		setBounds(width/3, heigth/3, width,heigth);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 102));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GREEN));
		panel_1.setBounds(0,0,150,150);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.light"));
		panel_2.setBounds(73, 91, 380, 505);
		panel_1.add(panel_2);
	
		  String[] columns = (String[]) models.UltimaMovimentacao.retornaColunas();		   
		  Object[][] data = (Object[][]) models.UltimaMovimentacao.retornaDados();
		  Object[][] dataColumn = (Object[][]) models.UltimaMovimentacao.retornaNomeColuna();
		  
		panel_2.setLayout(null);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(16, 205, 0, 0);
		panel_2.add(verticalGlue);
		table = new JTable(data, columns);
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		table.setBackground(SystemColor.inactiveCaptionBorder);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(SystemColor.desktop);
		table.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		table.setBounds(34, 120, 317, 374);
		table.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
			
		panel_2.add(table);
		
		table_1 = new JTable(dataColumn, columns);
		table_1.setEnabled(false);
		table_1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		table_1.setBounds(34, 102, 317, 16);
		panel_2.add(table_1);
		
		textField = new JTextField();
		textField.setBounds(34, 35, 317, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		btnPesquisar.setBounds(227, 66, 124, 23);
		panel_2.add(btnPesquisar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(73, 65, 380, 29);
		panel_1.add(panel_3);
		
		JLabel lblUltimaMovimentao = new JLabel("Ultima Movimenta\u00E7\u00E3o");
		lblUltimaMovimentao.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		panel_3.add(lblUltimaMovimentao);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(520, 65, 815, 533);
		panel_1.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(UIManager.getBorder("TitledBorder.border"));
		tabbedPane.addTab("Visitantes", null, panel_4, null);
		panel_4.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(10, 70, 774, 18);
		panel_4.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(10, 89, 774, 405);
		panel_4.add(table_3);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		btnNewButton.setBounds(653, 36, 132, 23);
		panel_4.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 11, 774, 20);
		panel_4.add(textField_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(UIManager.getBorder("TitledBorder.border"));
		tabbedPane.addTab("Veiculos", null, panel_5, null);
		
		table_4 = new JTable();
		table_4.setBounds(10, 70, 774, 18);
		panel_5.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(10, 89, 774, 405);
		panel_5.add(table_5);
		
		JButton button = new JButton("Pesquisar");
		button.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		button.setBounds(653, 36, 132, 23);
		panel_5.add(button);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 11, 774, 20);
		panel_5.add(textField_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(UIManager.getBorder("TitledBorder.border"));
		tabbedPane.addTab("Moradores	", null, panel_6, null);
		
		table_6 = new JTable();
		table_6.setBounds(10, 70, 774, 18);
		panel_6.add(table_6);
		
		table_7 = new JTable();
		table_7.setBounds(10, 89, 774, 405);
		panel_6.add(table_7);
		
		JButton button_1 = new JButton("Pesquisar");
		button_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		button_1.setBounds(653, 36, 132, 23);
		panel_6.add(button_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 11, 774, 20);
		panel_6.add(textField_3);
		
		
	}
}
