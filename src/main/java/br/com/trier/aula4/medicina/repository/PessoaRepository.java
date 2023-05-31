package br.com.trier.aula4.medicina.repository;

import java.util.List;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

import br.com.trier.aula4.medicina.models.*;

@AllArgsConstructor
@Getter
public class PessoaRepository{

    private final List <Pessoa> pessoas = new ArrayList <>();
    
    public void cadastrarPessoas (Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void updatePessoa (Pessoa pessoa) {
        var pessoaVelha = buscarPessoas (pessoa.getId());
        pessoas.remove(pessoaVelha);
        pessoas.add(pessoa);
    }
    
    public Pessoa buscarPessoas(Long id) {
        for (Pessoa pessoa1 : pessoas) {
            if (pessoa1.getId().equals(id) ) {
                return pessoa1;
            }
        }
        return new Pessoa ();
    }
    
    
}
