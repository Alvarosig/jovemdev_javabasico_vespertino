package br.com.trier.aula4.disciplinas.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Disciplina {

    private String nomeDisciplina; 
    private int cargaHoraria;
    private Professor professor;
        
    }