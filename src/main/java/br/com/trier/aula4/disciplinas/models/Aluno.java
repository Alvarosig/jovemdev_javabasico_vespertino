package br.com.trier.aula4.disciplinas.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    private String nome;
    private List <Curriculo> curriculo; 
    
    }
    

