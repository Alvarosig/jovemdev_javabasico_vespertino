package br.com.trier.aula5.banco;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Caixa {
    
    List <Conta> contas = new ArrayList <Conta>();
    
    public void adicionarConta (Conta x) {
        contas.add(x);
    }
    
    public boolean saque(Conta x, double valor) {
        return x.saqueConta(valor);
    }

    public boolean deposito(Conta x, double valor) {
        return x.depositoConta(valor);
    }

    public boolean transferencia(Conta origem, Conta destino, double valor) {
        return origem.transferenciaConta(destino, valor);
    }
}
