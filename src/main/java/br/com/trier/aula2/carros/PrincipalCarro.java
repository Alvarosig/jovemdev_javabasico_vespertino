package br.com.trier.aula2.carros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.trier.aula2.imc.Pessoa;
import br.com.trier.aula2.imc.Utilidade;

public class PrincipalCarro {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<Carro>();
        int op = 0;
        do {
            op = Util.escolheOpc(); // para cadastrar os carros
            if ( op == 1) {
                Carro c = new Carro();
                c.cadastrar();
                carros.add(c);
            }
            
            if ( op == 2) {  // Irá listar apenas os períodos dos carros
                int infPeriodo = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano inicial e o final do carro"));
                String ret = "Período\n";
                for(Carro c : carros) {
                    if (infPeriodo == c.ano) {
                        ret += c.imprimirPeriodo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há carros desse ano");
                    }
                }
                JOptionPane.showMessageDialog(null, ret);
            }
            
            if ( op == 3) {  // Irá listar apenas os carros por marca
                String infMarca = JOptionPane.showInputDialog("Informe a marca do carro");
                String ret = "Marcas\n";
                for(Carro c : carros) {
                    if (c.marca.equals(infMarca)) {
                        ret += c.imprimirMarca();
                    }  
                }
                JOptionPane.showMessageDialog(null, ret);                    
            }
            
            if ( op == 4) {  // Irá listar os carros por cor
                String infCor = JOptionPane.showInputDialog("Informe a cor do carro");
                String ret = "Cores\n";
                for(Carro c : carros) {
                    if (c.cor.equals(infCor)) {
                        ret += c.imprimirCor();
                    }
                }
                JOptionPane.showMessageDialog(null, ret);                    
            }
            
        }while (op != 5); // input para sair
    }

}
