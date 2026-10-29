package br.gov.sp.cps.view;
import javax.swing.*;
import br.gov.sp.cps.controllers.TelaAgendamentoController;

public class TelaAgendamento extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel lblNome, lblEspecialidade;
	JTextField txtNome, txtEspecialidade;
	JButton btnConfirmar, btnLimpar, btnVoltar;
	JPanel tela;
	
	public TelaAgendamento() {
		setTitle("Agenda de Consultas");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela = new JPanel();
		tela.setLayout(null);
		
		lblNome = new JLabel("Nome: ");
		lblNome.setBounds(30, 50, 100, 25);
		tela.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(130, 50, 250, 25);
		tela.add(txtNome);
		
		lblEspecialidade = new JLabel("Especialidade: ");
		lblEspecialidade.setBounds(30, 90, 100, 25);
		tela.add(lblEspecialidade);
		
		txtEspecialidade = new JTextField();
		txtEspecialidade.setBounds(130, 90, 250, 25);
		tela.add(txtEspecialidade);
		
		btnConfirmar = new JButton("Confirmar agendamento");
		btnConfirmar.setBounds(30, 280, 180, 30);
		add(btnConfirmar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(230, 280, 100, 30);
		add(btnLimpar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(350, 280, 100, 30);
		add(btnVoltar);
		
		add(tela);
		
		TelaAgendamentoController controller = new TelaAgendamentoController(txtNome, txtEspecialidade, this);
		
		btnConfirmar.addActionListener(controller.acaoConfirmar());
		btnLimpar.addActionListener(controller.acaoLimpar());
		btnVoltar.addActionListener(controller.acaoVoltar());
	}

}
