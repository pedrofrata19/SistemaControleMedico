package br.gov.sp.cps.controllers;

import br.gov.sp.cps.view.TelaAgendamento;
import br.gov.sp.cps.view.TelaInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialController {
	private TelaInicial telaInicial;
	
	public TelaInicialController(TelaInicial telaInicial) {
		this.telaInicial = telaInicial;
	}
	
	public ActionListener acaoAgendar() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				telaInicial.dispose();
				
				TelaAgendamento telaAgendamento = new TelaAgendamento();
				telaAgendamento.setVisible(true);
			}
		};
	}
}
