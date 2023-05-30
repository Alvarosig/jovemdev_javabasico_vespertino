package br.com.trier.aula4.disciplinas.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    private String nome;
    private List <Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Double nota1;
    private Double nota2;
    private Double nota3;
    
 
    }
    

