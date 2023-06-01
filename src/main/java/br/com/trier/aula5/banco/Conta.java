package br.com.trier.aula5.banco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private Integer numeroConta;
    private Integer agencia;
    private String nomeCorrentista;
    protected Double saldo;

    public boolean depositoConta(double valorDep) {
        if (valorDep > 0) {
            saldo = getSaldo() + valorDep;
            return true;
        }
        return false;
    }

    public boolean saqueConta(double valorSac) {
        if (valorSac >= 0 && getSaldo() >= valorSac) {
            saldo = getSaldo() - valorSac;
            return true;
        } else {
            return false;
        }

    }

    public boolean transferenciaConta(Conta contaDestino, double valorTra) {
        if (saqueConta(valorTra)) {
            if (contaDestino.depositoConta(valorTra)) {
                return true;
            } else {
                depositoConta(valorTra);
                return false;
            }
        }
        return false;
    }
}
