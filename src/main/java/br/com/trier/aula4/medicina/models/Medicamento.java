package br.com.trier.aula4.medicina.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medicamento {
    
    private Long id;
    private String nome;
    private EnumAdministracao enumAdministracao;
    private List<String> indicacoes;
    private List<String> alergia;
    
}
