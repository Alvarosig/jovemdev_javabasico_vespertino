package br.com.trier.aula4.disciplinas.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor
public class Professor {
    
    @NonNull
    private String nome;
    @NonNull
    private EnumFormacao formacao;
    
    
}
