package br.com.trier.aula3.futebol;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PrincipalMenu {
    
    public static void main(String[] args) {
        
        List<Time> times = new ArrayList<Time>();
        List<Jogadores> jogadores = new ArrayList<Jogadores>();

        
        int op = 0;
        do {
            
            op = Util.opMenu();
            switch (op) {
            case 1:
                Time time = new Time ();
                
                time.cadastrarTime();
                times.add(time);
                
                int contadorJogadores = 0;
                do {
                    Jogadores jogador = new Jogadores ();
                    jogador.cadastrar();

                    String nome = jogador.getNome();
                    int numeroCamisa = jogador.getNumeroCamisa();
                    int qtdGols = jogador.getQtdGols();
                    JogadorInfo jogadorInfo = new JogadorInfo (nome, numeroCamisa, qtdGols);
                    jogadores.add(jogadorInfo);
                    contadorJogadores++;
                } while (contadorJogadores > 11 && contadorJogadores < 17);
                
                break;
            }
        } while (op != 5);
                
    }
    
}
