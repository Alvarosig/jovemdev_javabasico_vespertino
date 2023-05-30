package br.com.trier.aula3.livro;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    public void testGetSexo () {
        
        Autor autor = new Autor ();
        autor.setSexo(Sexo.MASCULINO);
        
        assertEquals(Sexo.FEMININO, autor.getSexo());
    }
}
