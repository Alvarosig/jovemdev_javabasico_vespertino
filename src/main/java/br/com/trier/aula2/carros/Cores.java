package br.com.trier.aula2.carros;

public enum Cores {
    PRETO(1), BRANCO(2), VERMELHO(3), CINZA(4), AMARELO(5);

    private int valor;

    Cores(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
}

//