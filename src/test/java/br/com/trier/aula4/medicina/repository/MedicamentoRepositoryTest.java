package br.com.trier.aula4.medicina.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.trier.aula4.medicina.models.Medicamento;

class MedicamentoRepositoryTest {
    
    @Test
    @DisplayName ("Testar validação de cadastro")
    void testCadastrarMedicamentoInvalido () {
        MedicamentoRepository repository = new MedicamentoRepository();
        Medicamento medicamentoInvalido = null;
        
        assertThrows(IllegalArgumentException.class, () -> repository.cadastrarMedicamento(medicamentoInvalido));
        
    }
    
}
