package br.com.trier.aula5.polimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PolimorfismoTest {

    private List<Forma> lista = new ArrayList<Forma> ();
    
    @BeforeEach
    public void init() {
        lista.add(new Circulo (3));
        lista.add(new Cone ());
        lista.add(new Quadrado ());
        lista.add(new Triangulo ());
        
    }
    
    @Test
    @DisplayName ("Teste desenhar círculo")
    public void desenharCirculoTest () {
        String s = lista.get(0).desenhar();
        assertEquals("Desenhando um: Círculo", s);
    }
    
    @Test
    @DisplayName ("Teste área círculo")
    public void areaCirculoTest() {
        Circulo c = (Circulo) lista.get(0);
        double area = c.calculaArea();
        DecimalFormat df = new DecimalFormat("##.00");
        assertEquals("28,27", df.format(area));
    }
    
    @Test
    @DisplayName ("Teste desenhar cone")
    public void desenharConeTest () {
        String s = lista.get(1).desenhar();
        assertEquals("Desenhando um: Cone", s);
    }
    
    @Test
    @DisplayName ("Teste desenhar quadrado")
    public void desenharQuadradoTest () {
        String s = lista.get(2).desenhar();
        assertEquals("Desenhando um: Quadrado com 4 lados", s);
    }

    @Test
    @DisplayName ("Teste desenhar triângulo")
    public void desenharTrianguloTest () {
        String s = lista.get(3).desenhar();
        assertEquals("Desenhando um: Triangulo com 3 lados", s);
    }
}
