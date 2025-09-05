package com.mycompany.app;

import com.mycompany.app.Model.*;
import org.junit.Before;
import org.junit.Test;

public class PublicacaoContextoTest {

    private PublicacaoContexto contexto;
    private Autor autorLivro;
    private Autor autorArtigo;
    private Livro livro;
    private Artigo artigo;


    @Before
    public void setUp() {
        contexto = new PublicacaoContexto();
        

        autorLivro = new Autor("Jorge Amado", "Brasileiro");
        autorArtigo = new Autor("Ada Lovelace", "Britanica");

        autorLivro.setTipoAutor(TipoAutor.Tradicional);
        autorArtigo.setTipoAutor(TipoAutor.Usuario);
        livro = new Livro("Capitães da Areia", autorLivro, "Romance", true);
        artigo = new Artigo("Entendendo Compiladores", autorArtigo, "Tecnologia", true);
    }

    @Test
    public void devePublicarLivro() {
        contexto.definirEstrategia(livro);
        contexto.executarPublicacao();
    }

    @Test
    public void devePublicarArtigo() {
        contexto.definirEstrategia(artigo);
        contexto.executarPublicacao();
    }
}
