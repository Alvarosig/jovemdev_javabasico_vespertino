package br.com.trier.aula3.futebol;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogadores {

	private String nome;
	private int numeroCamisa;
	private int qtdGols;

	public Jogadores cadastrar() {

		nome = JOptionPane.showInputDialog("Nome do Jogador");
		numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Número da Camisa"));
		qtdGols = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Total de Gols do Jogador"));
		
		return this;
	}

	
}
