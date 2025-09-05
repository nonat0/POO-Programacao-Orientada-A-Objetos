package com.mycompany.app;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

public class PessoaTest {

    @Test
    public void testGetNome() {

        Pessoa pessoa = new Pessoa("Rafael");

        assertEquals("Rafael", pessoa.getNome());
        
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro1 = new Livro("Java Basics", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Clean Code", autor, "Tecnologia", true);

        // Adicionando os livros a Pessoa
        pessoa.getLivros().add(livro1);
        pessoa.getLivros().add(livro2);

        List<Livro> livros = pessoa.getLivros();

        // Ver se a quant está correta
        assertEquals(2, livros.size());

        // Verificando se são os livros certos que estão no array
        assertTrue(livros.contains(livro1));
        assertTrue(livros.contains(livro2));
    }
}