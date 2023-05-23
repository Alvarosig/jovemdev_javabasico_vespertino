package br.com.trier.aula2.imc;

import javax.swing.JOptionPane;

public class Utilidade {

    static int escolheOp () {
           String menu = "1 - Cadastrar \n" + "2 - Avaliar \n\n" + "3 - Sair";
           return Integer.parseInt(JOptionPane.showInputDialog(menu));
       }
}
