package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutorTest {
    
    @Test
    public void testGetNome() {
        Autor autor = new Autor("George Orwell", "Britânico");
        assertEquals("George Orwell", autor.getNome());
        assertEquals("Britânico", autor.getNacionalidade());
    }
}
