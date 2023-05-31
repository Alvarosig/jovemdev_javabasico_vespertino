package br.com.trier.aula5.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class CaixaTest {

    private Caixa caixa;
    private Conta contaCc;
    private ContaEspecial contaEs;
    private ContaUniversitaria contaUn;
    
    @BeforeEach
    public void init() {
        caixa = new Caixa ();
        contaCc = new Conta (123, 456, "Alvaro", 5000.0);
        contaEs = new ContaEspecial (432, 421, "Juninho", 10000, 300 );
        contaUn = new ContaUniversitaria (111, 232, "Robin", 1800.0);
           
    }
    
    @Test
    @DisplayName ("Teste saque com saldo CCor")
    void testSaqueComSaldoSuficienteCc() {
        caixa.saque(contaCc, 500.0);
        Assertions.assertEquals(4500.0, contaCc.getSaldo());
    }
    
    @Test
    @DisplayName ("Teste saque com saldo CEsp")
    void testSaqueComSaldoSuficienteCe() {
        caixa.saque(contaEs, 10300);
        Assertions.assertEquals(0, contaEs.getSaldo());
    }
    
    @Test
    @DisplayName ("Teste saque com saldo CUni")
    void testSaqueComSaldoSuficienteCu() {
        caixa.saque(contaUn, 500.0);
        Assertions.assertEquals(1300.0, contaUn.getSaldo());
    }
    
    @Test
    @DisplayName ("Teste saque sem saldo CCor")
    
    

}
