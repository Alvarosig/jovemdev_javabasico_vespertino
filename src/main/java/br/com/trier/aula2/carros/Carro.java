package br.com.trier.aula2.carros;

import javax.swing.JOptionPane;

public class Carro {

    String marca;
    int ano;
    Cores cor;
    
    void cadastrar () {
    marca = JOptionPane.showInputDialog("Marca");
    ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
    
 // JOptionPane.showInputDialog("Cor do carro, digite\n " + "1. Preto\n 2. Branco\n 3. Vermelho \n 4. Cinza \n 5. Amarelo")); 
            
    }
    
    String imprimirPeriodo () {
        return "Ano: " + ano + "\n";
    }
    
    String imprimirMarca () {
        return "Marca: " + marca + "\n";
    }
    
    String imprimirCor () {
        return "Cor: " + cor + "\n";
    }
    
}
