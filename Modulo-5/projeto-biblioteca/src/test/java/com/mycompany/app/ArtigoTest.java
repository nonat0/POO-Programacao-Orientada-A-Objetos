package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;

public class ArtigoTest {
    @Test
    public void testArtigo(){

    Autor autor3 = new Autor("Laurentino Gomes", "Brasileiro");
    Artigo artigo = new Artigo("Entendendo Compiladores", autor3, "tecnologia", true);

    assertEquals("Entendendo Compiladores", artigo.getTitulo());
    assertEquals("tecnologia", artigo.getGenero());
    assertEquals(true, artigo.isPublicado());

    }
}