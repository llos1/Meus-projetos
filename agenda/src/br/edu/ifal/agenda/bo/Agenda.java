package br.edu.ifal.agenda.bo;

import java.util.ArrayList;

import br.edu.ifal.agenda.vo.Compromisso;

public class Agenda {
	private ArrayList<Compromisso> compromissos;
	
	public Agenda() {
		this.compromissos = new ArrayList<Compromisso>();
	}
	
	
	public void adcionar(Compromisso c) {
		compromissos.add(c);
	}
	
	public void remover(Compromisso c) {
		compromissos.remove(c);
	}

}
