package br.com.trier.aula3.futebol;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Time {

    private String nomeTime;
    private List<Jogadores> jogadorList;
    
    public Time cadastrarTime () {
    	
    	//jogadorList = new ArrayList <>();
        nomeTime = JOptionPane.showInputDialog("Nome do Time");
        
        int opt = 1;
        
        do {
            jogadorList.add(new Jogadores().cadastrar());
            opt++;
            if (opt == 11) {
                int opt2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja parar o cadastro de jogadores? 1- Sim e 2 - Não"));
                if (opt2 == 1) {
                    opt = 0;
                }
            }
        } while (opt != 0 && opt < 3);

        return this;
        
        }   
    
    //	private List <Time> times = new ArrayList<>();
    	
    	public void listaTime (Time time) {
    //		times.add(time);
    	}
    	
    /*	public Time buscarTime (String nome) {
    		
    		return "";
    	}
    	
    	public Jogador buscarArtilheiro () {
    		List <Jogadores> artilheiro = new ArrayList<>();
    	}
    	
    	public TimeGols buscarTimeGoleador () {
    		List <TimeGols> timeGoleador = new ArrayList<>();
    	} */
    
    }
    

