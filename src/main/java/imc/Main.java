package imc;

import javax.swing.JOptionPane;

public class Main extends Pessoa {

    public static void main(String[] args) {

        Main main = new Main();

        while (true) {
            main.solicitarInformacoes();
            main.calculaImc (main.peso, main.altura());
            String sair = JOptionPane.showInputDialog("Deseja Continuar?");
            if (sair.equalsIgnoreCase("não")) {
                break;
            }
        }

    }

}
