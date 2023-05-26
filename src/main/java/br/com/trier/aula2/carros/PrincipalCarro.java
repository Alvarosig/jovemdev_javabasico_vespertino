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
       /* 
        do {
            op = Util.escolheOpc(); // para cadastrar os carros
            if ( op == 1) {
                Carro c = new Carro();
                c.cadastrar();
                carros.add(c);
            }
            
            if ( op == 2) {  // Irá listar apenas os períodos dos carros
                int infPeriodoIni = Integer.parseInt(JOptionPane.showInputDialog("Informe o período do ano de início"));
                int infPeriodoFim = Integer.parseInt(JOptionPane.showInputDialog("Informe o período do ano final"));
                String ret = "Período\n";
                
                List<Carro> carroPorPeriodo = new ArrayList<>();
                
                for (Carro carro: carros) {
                	if (infPeriodoIni <= carro.ano && infPeriodoFim >= carro.ano) {
                		carroPorPeriodo.add(carro);              	
                	}
                }
                
                if (carroPorPeriodo.isEmpty()) {
                    
                    JOptionPane.showMessageDialog(null, "Não há carros entre esse ano");
                    
                } else {
                	for(Carro c : carroPorPeriodo) {
                            ret += c.imprimirPeriodo();
                }
                	
                    JOptionPane.showMessageDialog(null, ret);
                    
                }
            }
            
            if ( op == 3) {  // Irá listar apenas os carros por marca
                String infMarca = JOptionPane.showInputDialog("Qual a marca do carro?");
                String ret = "";
                
                List<Carro> carrosPorMarca = new ArrayList<>();
                
                for (Carro carro : carros) {
                	if (carro.marca.equals(infMarca.toUpperCase())) {
                		carrosPorMarca.add(carro);		
                	}
                }
                
                if (carrosPorMarca.isEmpty()) {
                    
                    JOptionPane.showMessageDialog(null, "Não há a respectiva marca");
                    
                } else {
                	for(Carro c : carrosPorMarca) {
                            ret += c.imprimirMarca();
                        } 
                	
                	JOptionPane.showMessageDialog(null, ret); 
                	
                	}
                }
            
            if ( op == 4) {  // Irá listar os carros por cor
                int infCor = Integer.parseInt(JOptionPane.showInputDialog("Qual a cor do carro?\n" +
                        "Digite\n" + 
                        "1. Preto \n" +
                        "2. Branco \n" +
                        "3. Vermelho \n" +
                        "4. Cinza \n" +
                        "5. Amarelo \n"));
                
                String ret = "Lista de carros com as respectivas cores\n";
                
                List<Carro> carrosPorCor = new ArrayList<>();
                
                for (Carro carro : carros) {
                    if (carro.cor.ordinal() == infCor - 1) {
                        carrosPorCor.add(carro);
                    }
                }
                
                if (carrosPorCor.isEmpty()) {
                    
                    JOptionPane.showMessageDialog(null, "Não há a respectiva cor");
                    
                } else { 
                	for(Carro c : carrosPorCor) {
                            ret += c.imprimirCor();   // TA IMPRIMINDO
                	}
                	
                	JOptionPane.showMessageDialog(null, ret); 
                	
                }                   
            }
            
        } while (op != 5); // input para sair
        */
    }

}
