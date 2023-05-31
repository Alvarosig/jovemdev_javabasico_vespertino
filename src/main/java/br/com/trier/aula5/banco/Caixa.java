package br.com.trier.aula5.banco;

public class Caixa {
    public void saque(Conta conta, double valor) {
        conta.saqueConta(valor);
    }

    public void deposito(Conta conta, double valor) {
        conta.depositoConta(valor);
    }

    public void transferencia(Conta origem, Conta destino, double valor) {
        destino.depositoConta(valor);
    }
}
