package br.com.trier.aula4.disciplinas.service;

import java.util.List;

import br.com.trier.aula4.disciplinas.models.Aluno;
import br.com.trier.aula4.disciplinas.models.Disciplina;
import br.com.trier.aula4.disciplinas.models.Professor;

public class Util {    
    
    private List <Professor> professor;
    private List <Aluno> aluno;
    private List <Disciplina> disciplina;
    
    public void criarProfessor(Professor p) {
        professor.add(p);
    }
    
    public void criarAluno(Aluno a) {
        aluno.add(a);
    }
    
    public void criarDisciplina(Disciplina d, Professor professor) {
        d.setProfessor(professor);
        disciplina.add(d);
    }
    
    
}
