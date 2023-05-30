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
public class Pessoa {
    
    private Long id;
    private String nome;
    private String sintoma;
    private List<String> alergias;
    private List<Medicamento> medicamentos;
}
