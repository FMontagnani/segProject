package run;

import views.MainFrame;
import views.TelaDeAutenticacao;

public class RunnerAplication {
	
	private static TelaDeAutenticacao telaDeAutenticacao = new TelaDeAutenticacao();
	private static MainFrame mainFrame = new MainFrame();
	public static void main(String[] args) {
		if(false) {
			mainFrame.main(null);
		}
		else {
			telaDeAutenticacao.main(null);
		}
	}
}
