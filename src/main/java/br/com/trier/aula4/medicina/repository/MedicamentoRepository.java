package br.com.trier.aula4.medicina.repository;

import java.util.List;

import br.com.trier.aula4.medicina.models.Medicamento;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MedicamentoRepository {

    private final List <Medicamento> medicamentos = new ArrayList<>();
    
    public void cadastrarMedicamento (Medicamento medicamento) {
        medicamentos.add(medicamento);
    }
    
    public Medicamento buscarMedicamento (Long id) {
        Medicamento medicamento = new Medicamento();
        for (Medicamento medicamento1 : medicamentos) {
            if (medicamento1.getId().equals(id)) {
                medicamento = medicamento1;
            }
        }
        return medicamento;
    }
    
}
