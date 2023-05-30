package br.com.trier.aula4.disciplinas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    private String nome;
    private EnumFormacao formacao;
    
    
}
