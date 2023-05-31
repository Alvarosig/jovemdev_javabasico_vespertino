package br.com.trier.aula4.disciplinas.models;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Curriculo {

    private Aluno aluno;
    private Disciplina disciplina;
    private List<Double> notas;
    
    
    
}
