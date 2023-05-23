package imcmeu;

import javax.swing.JOptionPane;

public class Main extends Pessoa {

    public static void main(String[] args) {

        Main main = new Main();

        while (true) {
            main.solicitarInformacoes();
            main.exibirInformacoes ();
            String sair = JOptionPane.showInputDialog("Deseja Continuar?");
            if (sair.equalsIgnoreCase("não")) {
                break;
            }
        }

    }

}
