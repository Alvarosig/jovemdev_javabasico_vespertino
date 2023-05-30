package br.com.trier.aula4.medicina.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.trier.aula4.medicina.models.Pessoa;
import br.com.trier.aula4.medicina.models.Medicamento;
import br.com.trier.aula4.medicina.repository.MedicamentoRepository;
import br.com.trier.aula4.medicina.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MedicamentoService {
    
    private MedicamentoRepository medicamentoRepository;
    private PessoaRepository pessoaRepository;
    
    public void cadastrarMedicamento (Medicamento medicamento) {
        medicamentoRepository.cadastrarMedicamento(medicamento);
    }
    
    public List <Medicamento> buscarMedicamento () {
        return medicamentoRepository.getMedicamentos();
    }
    
    public List <Pessoa> buscarPessoas () {
        return pessoaRepository.getPessoas();
    }
    
    public void prescricaoDeMedicamento (Pessoa pessoa, Medicamento medicamento) {
        if (pessoa == null || medicamento == null) {
            throw new RuntimeException("Pessoa ou medicamento não encontrado");
        }
        
        if (!medicamento.getIndicacoes().contains(pessoa.getSintoma())) {
            throw new RuntimeException("O medicamento não é indicado para o sintoma apresentado pela pessoa");
        }
        
        pessoa.getAlergias().forEach(it -> {
            if (medicamento.getAlergia().contains(it)) {
                throw new RuntimeException("A pessoa é alergica ao medicamento");
            }
        });
        
        pessoa.getMedicamentos().add(medicamento);
        
        pessoaRepository.updatePessoa(pessoa);
        
    }
    
    public List <Pessoa> buscarPessoasEMedicamento () {
        return pessoaRepository.getPessoas();
    }
}
