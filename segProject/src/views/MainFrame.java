package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MainFrame {

	private JFrame frame;
	private TelaDeCadastroMock telaDeCadastroDeVisitantes = new TelaDeCadastroMock();
	private TelaPrincipal telaPrincipal= new TelaPrincipal();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mnCadastroDeVisitantes = new JMenuItem("Cadastro de Visitantes");

		mnCadastro.add(mnCadastroDeVisitantes);
		
		JMenuItem mnCadastroResidente = new JMenuItem("Cadastro de Residente");
		mnCadastro.add(mnCadastroResidente);
		
		JMenuItem mnCadastroDeCorrespondencia = new JMenuItem("Cadastro de Correspondencia");
		mnCadastro.add(mnCadastroDeCorrespondencia);
		
		JMenuItem mnCadastroVeiculo = new JMenuItem("Cadastro de Veiculo");
		mnCadastro.add(mnCadastroVeiculo);
		
		JMenuItem mnCadastroOcorrencia = new JMenuItem("Cadastro de Ocorrencia");
		mnCadastroOcorrencia.setSelected(true);
		mnCadastro.add(mnCadastroOcorrencia);

		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mnTelaPrincipal = new JMenuItem("Tela Principal");
		mnConsulta.add(mnTelaPrincipal);
		
		JMenu mnRelatorio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatorio);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		
		JPanel mainPanel = new JPanel(new CardLayout());
		
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.add(telaPrincipal,"telaPrincipal");
		mainPanel.add(telaDeCadastroDeVisitantes,"telaDeCadastroDeVisitantes" );
		
		
		mnCadastroDeVisitantes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) (mainPanel.getLayout());
				cl.show(mainPanel, "telaDeCadastroDeVisitantes"); 
				
			}
		});
		
		mnTelaPrincipal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) (mainPanel.getLayout());
				cl.show(mainPanel, "telaPrincipal"); 				
			}
		});

		mnCadastroResidente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
							
			}
		});
		
	}
}
