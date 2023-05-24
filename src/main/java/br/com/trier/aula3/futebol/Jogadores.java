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
    
    public void cadastrar() {
        
        nome = JOptionPane.showInputDialog("Nome do Jogador");
        numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Número da Camisa"));
        qtdGols = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Total de Gols do Jogador"));
        if (!valida()) {
            cadastrar();
        }
    }
    
    boolean valida () {
        if(nome.trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Nome obrigatório");
            return false;
        }
        if (numeroCamisa <= 0 || numeroCamisa > 99) {
            JOptionPane.showMessageDialog(null, "Número da Camisa Inválida");
            return false;
        }
       
        return true;
    }
    
    public String verificaArtilheiro() {
       // if (qtdGols > )
        return "";
    }
    
    public String verificaTime() {
        
        return "";
    }
}
