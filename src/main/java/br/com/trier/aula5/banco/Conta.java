package br.com.trier.aula5.banco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private Integer numeroConta;
    private Integer agencia;
    private String nomeCorrentista;
    protected Double saldo;

    public boolean depositoConta(double valorDep) {
        saldo = valorDep + saldo;
        return true;
    }

    public boolean saqueConta(double valorSac) {
        if (saldo > 0) {
            saldo = saldo - valorSac;
            return true;
        } else {
            return false;
        }

    }

    public boolean transferenciaConta(Conta contaDestino, double valorTra) {
        if (saldo >= valorTra) {
            saldo = saldo - valorTra;
            contaDestino.depositoConta(valorTra);
            return true;
        } else {
            return false;
        }

    }
}
