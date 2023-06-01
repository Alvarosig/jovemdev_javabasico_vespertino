package br.com.trier.aula5.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CaixaTest {

    private Caixa caixa = new Caixa ();
    
    @BeforeEach
    public void init() {
        caixa.getContas().clear();
        caixa.adicionarConta(new Conta(5, 3, "Anakin", 1000.0));
        caixa.adicionarConta(new ContaEspecial(5, 1, "Yoda", 1000.0, 1000.0));
        caixa.adicionarConta(new ContaUniversitaria(5, 8, "R2D2", 1000.0));
           
    }
    
    @Test
    @DisplayName ("Deposito entre CCor, CEsp, Cuni") 
    void testDeposito() {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1);
        Conta cu = caixa.getContas().get(2);
        
        caixa.deposito(cc, 100);
        assertEquals(1100.0, cc.getSaldo());
        caixa.deposito(ce, 1000);
        assertEquals(2000.0, ce.getSaldo());
        caixa.deposito(cu, 1000);
        assertEquals(2000.0, cu.getSaldo());
    }
    
    @Test
    @DisplayName ("Saque entre CCor, CEsp, Cuni") 
    void testSaque() {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1);
        Conta cu = caixa.getContas().get(2);
        
        caixa.saque(cc, 1000.0);
        assertEquals(0.0, cc.getSaldo());

        caixa.saque(ce, 2000.0);
        assertEquals(0, ce.getSaldo()); 

        caixa.saque(cu, 1000.0);
        assertEquals(0.0, cu.getSaldo());
    }
    
    @Test
    @DisplayName ("Trânsferencia entre CCor e CEsp") 
    void testTransferenciaCcCe() {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1); 
        
        caixa.transferencia(cc, ce, 1000);
        assertEquals(0, cc.getSaldo());
        assertEquals (2000, ce.getSaldo());
        
        caixa.transferencia(ce, cc, 1000.0);
        assertEquals(1000.0, cc.getSaldo());
        assertEquals (2000.0, ce.getSaldo());
    }
    
    @Test
    @DisplayName ("Transferência entre CU e CC")
    void testTransferenciaCuCc () {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1);  
        Conta cu = caixa.getContas().get(2);
        
        caixa.transferencia(cu, cc, 1000.0);
        assertEquals(0, cu.getSaldo());
        assertEquals (2000.0, cc.getSaldo());
        
        caixa.transferencia(cc, cu, 2000);
        assertEquals(0, cc.getSaldo());
        assertEquals(2000, cu.getSaldo());
    }
    
    @Test
    @DisplayName ("Depósito negativo")
    void testDepositoNegativo () {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1);  
        Conta cu = caixa.getContas().get(2);
        
        caixa.deposito(cc, -10);
        assertEquals(1000.0, cc.getSaldo());
        caixa.deposito(ce, -10);
        assertEquals(1000.0, ce.getSaldo());
        caixa.deposito(cu, -10);
        assertEquals(1000.0, cu.getSaldo());
    }
    
    @Test
    @DisplayName ("Saque negativo")
    void testSaqueNegativo () {
        Conta cc = caixa.getContas().get(0);
        Conta ce = caixa.getContas().get(1);  
        Conta cu = caixa.getContas().get(2);
        
        caixa.saque(cc, -20.0);
        assertEquals(1000.0, cc.getSaldo());

        caixa.saque(ce, -30.0);
        assertEquals(1000, ce.getSaldo()); 

        caixa.saque(cu, -50.0);
        assertEquals(1000.0, cu.getSaldo());
    }
    
   
    

}
