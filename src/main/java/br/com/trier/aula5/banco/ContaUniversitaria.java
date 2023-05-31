package br.com.trier.aula5.banco;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContaUniversitaria extends Conta {
    
    public ContaUniversitaria(int numeroConta, int agencia, String nomeCorrentista, double saldo) {
        super(numeroConta, agencia, nomeCorrentista, saldo);
    }
    
    @Override
    public boolean depositoConta(double valorDep) {
        if (valorDep + getSaldo() <= 2000) {
            saldo = valorDep + saldo;
            return true;
        } else {
            return false;
        }

    }

}
