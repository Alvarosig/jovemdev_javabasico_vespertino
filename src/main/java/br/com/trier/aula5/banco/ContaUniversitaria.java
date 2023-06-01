package br.com.trier.aula5.banco;

public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numeroConta, int agencia, String nomeCorrentista, double saldo) {
        super(numeroConta, agencia, nomeCorrentista, saldo);
    }

    @Override
    public boolean depositoConta(double valorDep) {
        if (valorDep + getSaldo() <= 2000) {
            return super.depositoConta(valorDep);
        }
        return false;
    }

}
