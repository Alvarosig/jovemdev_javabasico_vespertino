package br.com.trier.aula5.polimorfismo;

import lombok.Getter;

@Getter
public class Poligono extends Forma {

    private int lados;
    
    public Poligono(String nome,int lados) {
        super(nome);
        this.lados = lados;
    }
    
    @Override
    public String desenhar() {
        return super.desenhar() + " com " + getLados() + " lados";
    }
    
}
