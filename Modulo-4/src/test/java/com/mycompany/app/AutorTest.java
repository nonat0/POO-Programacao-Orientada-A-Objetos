package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;

public class AutorTest {
    
    @Test
    public void testGetNome() {
        Autor autor1 = new Autor("George Orwell", "Britânico");
        autor1.setTipoAutor(TipoAutor.Tradicional);
        
        Autor autor2 = new Autor();
        autor2.setTipoAutor(TipoAutor.Usuario);

        assertEquals("George Orwell", autor1.getNome());
        assertEquals("Britânico", autor1.getNacionalidade());

        assertEquals(TipoAutor.Tradicional, autor1.getTipoAutor());
        assertEquals(TipoAutor.Usuario, autor2.getTipoAutor());
    }
}
