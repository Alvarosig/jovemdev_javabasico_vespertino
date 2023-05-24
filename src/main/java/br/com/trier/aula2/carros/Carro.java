package br.com.trier.aula2.carros;

import javax.swing.JOptionPane;

public class Carro {

	String marca;
	int ano;
	Cores cor;

	void cadastrar() {
		marca = JOptionPane.showInputDialog("Marca").toUpperCase();
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		int recebeCor = Integer.parseInt(JOptionPane.showInputDialog(
				"Cor do carro, digite\n" + "1. Preto\n2. Branco\n3. Vermelho \n4. Cinza \n5. Amarelo"));

		switch (recebeCor) {
		case 1:
			cor = Cores.PRETO;
			break;
		case 2:
			cor = Cores.BRANCO;
			break;
		case 3:
			cor = Cores.VERMELHO;
			break;
		case 4:
			cor = Cores.CINZA;
			break;
		case 5:
			cor = Cores.AMARELO;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Cor inválida");
			break;
		}
	}

	String imprimirPeriodo() {
		return "Ano: " + ano + "\n";
	}

	String imprimirMarca() {
		return "Marca: " + marca + "\n";
	}

	String imprimirCor() {
		return "Cor: " + cor + "\n";
	}

}
