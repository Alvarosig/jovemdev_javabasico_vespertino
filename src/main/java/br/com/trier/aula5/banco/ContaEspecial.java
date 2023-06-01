package br.com.trier.aula5.banco;

import lombok.Getter;

@Getter
public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numeroConta, int agencia, String nomeCorrentista, double saldo, double limite) {
        super(numeroConta, agencia, nomeCorrentista, saldo);
        this.limite = limite;
    }
    
    @Override
    public boolean saqueConta(double valorSacado) {
       double saldoTotal = getSaldo() + getLimite();
       
        if (getSaldo() + getLimite() >= valorSacado) {
            saldo = getSaldo() - valorSacado;
            return true;
        } else {
            return false;
        }

    }
    
    @Override
    public boolean transferenciaConta(Conta contaDestino, double valorTransferido) {
        if (getSaldo() + limite >= valorTransferido) {
            saldo = getSaldo() + limite - valorTransferido;
            contaDestino.depositoConta(valorTransferido);
            return true;
        } else {
            return false;
        }

    }

}
