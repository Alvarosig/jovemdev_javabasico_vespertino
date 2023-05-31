package br.com.trier.aula5.polimorfismo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Forma {
    
    private String nome;
    
    public String desenhar () {
        return "Desenhando um: " + getNome();
    }
    
}
