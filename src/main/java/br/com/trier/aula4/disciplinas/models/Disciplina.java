package br.com.trier.aula4.disciplinas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {

    private String disciplina;
    private int cargaHoraria;
    private String professor;
    
}
