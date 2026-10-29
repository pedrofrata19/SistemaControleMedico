package br.gov.sp.cps.view;

import javax.swing.*;
import br.gov.sp.cps.controllers.TelaInicialController;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel lblMensagem;
	JButton btnAgendar;
	JPanel tela;
	
	public TelaInicial() {
		setTitle("Sistema de Controle de Consultas Médicas");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela = new JPanel();
		tela.setLayout(null);
		
		lblMensagem = new JLabel("Bem-vindo(a) ao sistema!");
		lblMensagem.setBounds(150, 140, 200, 30);
		tela.add(lblMensagem);
		
		btnAgendar = new JButton("Agendar consulta");
		btnAgendar.setBounds(130, 180, 200, 30);
		tela.add(btnAgendar);
		
		add(tela);
		
		TelaInicialController controller = new TelaInicialController(this);
		
		btnAgendar.addActionListener(controller.acaoAgendar());
	}
	
	public static void main(String[] args) {
		TelaInicial tela = new TelaInicial();
		
		tela.setVisible(true);
	}
	
}
