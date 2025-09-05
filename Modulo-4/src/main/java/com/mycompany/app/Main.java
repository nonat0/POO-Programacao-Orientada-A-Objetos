package com.mycompany.app;
import java.util.Date;

import com.mycompany.app.Interface.Pessoavel;
import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        
        Autor autor1 = new Autor("George Orwell", "Britanico");
        autor1.setTipoAutor(TipoAutor.Tradicional);

        Autor autor2 = new Autor("Laurentino Gomes", "Brasileiro");
        autor2.setTipoAutor(TipoAutor.Usuario);

        Autor autor3 = new Autor("Laurentino Gomes", "Brasileiro");
        autor2.setTipoAutor(TipoAutor.Usuario);

        Livro livro1 = new Livro("1984", autor1, "Distopia", true);
        Livro livro2 = new Livro("1808", autor2, "Historia", true);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor3, "tecnologia", true);

        Pessoavel pessoa = new Pessoa();
        pessoa.setNome("Rafael");
        

        Usuario usuario = new Usuario();
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro1);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataRetirada(new Date());
        emprestimo.setDataDevolucao(new Date());
        

        System.out.println("Artigo: " + artigo.getTitulo() + " - Gênero: " + artigo.getGenero() + " - Disponível: " + artigo.isPublicado());
        System.out.println("Livro: " + livro1.getTitulo() + " - Gênero: " + livro1.getGenero() + " - Este Autor é um " + autor1.getTipoAutor() + " - Disponível: " + livro1.validarDisponibilidade());
        System.out.println("Livro: " + livro2.getTitulo() + " - Gênero: " + livro2.getGenero() + " - Este Autor é um " + autor2.getTipoAutor() + " - Disponível: " + livro2.validarDisponibilidade());
        System.out.println("Usuário: " + pessoa.getNome() + " - Idade: " + usuario.getIdade() + " - anos");
        System.out.println("Data retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data devolução: " + emprestimo.getDataDevolucao());


        // System.out.println("Obras publicadas por gênero:");
        // System.out.println(livro.getGenero() + ": " + livro.getTitulo());
        // System.out.println("Histórico de empréstimos:");
        // for (Emprestimo e : usuario.getHistoricoEmprestimos()) {
        //     System.out.println(" - Livro: " + e.getLivro().getTitulo() + ", Data de Retirada: " + e.getDataRetirada() + ", Data de Devolução: " + e.getDataDevolucao());
        //System.out.println("Empréstimo ativo: " + emprestimo.getStatus());

        }
    }