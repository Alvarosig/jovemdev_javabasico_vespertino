package br.com.trier.aula5.banco;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContaEspecial extends Conta {

    private Integer limite;

    public ContaEspecial(int numeroConta, int agencia, String nomeCorrentista, double saldo, Integer limite) {
        super(numeroConta, agencia, nomeCorrentista, saldo);
        this.limite = limite;
    }
    
    @Override
    public boolean saqueConta(double valorSacado) {
        if (getSaldo() + limite >= valorSacado) {
            saldo = saldo + limite - valorSacado;
            return true;
        } else {
            return false;
        }

    }
    
    @Override
    public boolean transferenciaConta(Conta contaDestino, double valorTransferido) {
        if (getSaldo() + limite >= valorTransferido) {
            saldo = saldo + limite - valorTransferido;
            contaDestino.depositoConta(valorTransferido);
            return true;
        } else {
            return false;
        }

    }

}
