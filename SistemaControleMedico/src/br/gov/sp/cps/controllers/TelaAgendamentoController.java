package br.gov.sp.cps.controllers;

import br.gov.sp.cps.view.TelaAgendamento;
import br.gov.sp.cps.view.TelaInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAgendamentoController {
	private JTextField txtNome;
	private JTextField txtEspecialidade;
	private TelaAgendamento telaAgendamento;
	
	public TelaAgendamentoController(JTextField txtNome, JTextField txtEspecialidade, TelaAgendamento telaAgendamento) {
		this.txtNome = txtNome;
		this.txtEspecialidade = txtEspecialidade;
		this.telaAgendamento = telaAgendamento;
	}
	
	public ActionListener acaoConfirmar() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String especialidade = txtEspecialidade.getText();
				
				if(nome.isEmpty() || especialidade.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
				} else {
					JOptionPane.showMessageDialog(null, "Agendamento confirmado! \n\n" + "Nome: " + nome + "\n" + "Especialidade: " + especialidade);
				}
			}
		};
	}
	
	public ActionListener acaoLimpar() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtEspecialidade.setText("");
				txtNome.requestFocus();
				
				JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
			}
		};
	}
	
	public ActionListener acaoVoltar() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				telaAgendamento.dispose();
				
				TelaInicial telaInicial = new TelaInicial();
				telaInicial.setVisible(true);
			}
		};
	}

}
