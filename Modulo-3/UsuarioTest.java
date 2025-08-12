package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UsuarioTest {
    @Test
    public void testGet(){
        
        Usuario usuario = new Usuario();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Ingles"), "Tecnologia", true);
        Date agora = new Date();
        Emprestimo emprestimo = new Emprestimo(new Date(),new Date(), new Livro(), new Usuario());

        usuario.setIdade(25);
        
        emprestimo.setDataRetirada(agora);
        emprestimo.setDataDevolucao(agora);
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);

        //adicionando emprestimo no array de emprestimos do usuario
        usuario.adicionarEmprestimo(emprestimo);

        //testando se o emprestimo + quantidade de emprestimos corretas foram para o array
        assertEquals(1, usuario.getHistoricoEmprestimos().size());
        assertTrue(usuario.getHistoricoEmprestimos().contains(emprestimo));
        assertEquals(25, usuario.getIdade());


    }
}
