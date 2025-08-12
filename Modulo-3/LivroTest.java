package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LivroTest {
    @Test
    public void testGet(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        //Livro1
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals(true, livro1.validarDisponibilidade());
                //Livro2
        assertEquals("tecnologia", livro2.getGenero());
        assertEquals("Java Avançado", livro2.getTitulo());
        assertEquals(autor, livro2.getAutor());
        assertEquals(false, livro2.invalidarDisponibilidade());
    }
}
