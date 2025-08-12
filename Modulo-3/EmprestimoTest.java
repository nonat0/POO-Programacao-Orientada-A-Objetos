package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmprestimoTest{
     @Test
    public void testGetNome() {

        Emprestimo emprestimo = new Emprestimo();
        Usuario usuario = new Usuario("Gabriel", 21);
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Ingles"), "Tecnologia", true);
        Date agora = new Date();

        emprestimo.setDataRetirada(agora);
        emprestimo.setDataDevolucao(agora);
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);

        assertEquals(agora, emprestimo.getDataRetirada());
        assertEquals(agora, emprestimo.getDataDevolucao());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());
        
    }
}
