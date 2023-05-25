package br.com.trier.aula3.futebol;

import javax.swing.JOptionPane;

public class Util {
    
  public static int opMenu() {
        String menu = "1 – Cadastrar Time\r\n"
                + "2 – Listar todos jogadres de um time\r\n"
                + "3 – Verificar artilheiros do campeonato\r\n"
                + "4 – Verificar o time com mais gols\r\n"
                + "5 – Sair \r\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    
}
