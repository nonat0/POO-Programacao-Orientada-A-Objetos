package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class UsuarioTest {
    @Test
    public void testGet(){
        
        Usuario usuario = new Usuario();
        Autor autor = new Autor("Alan Turing", "Ingles");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Date agora = new Date();
        Emprestimo emprestimo = new Emprestimo(new Date(),new Date(), livro, new Usuario());

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
