package br.com.trier.aula2.carros;

import javax.swing.JOptionPane;

public class Util {

    static int escolheOpc() {
        String menu = "1 - Cadastrar \n"+ 
                "2 - Listar os carros por período de fabricação \n" + 
                "3 - Listar carros por marca\n" + 
                "4 - Listar carros por cor \n\n" +
                "5 - Sair";
        
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

}
