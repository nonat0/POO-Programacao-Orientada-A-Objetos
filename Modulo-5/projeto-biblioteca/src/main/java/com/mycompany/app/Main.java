package com.mycompany.app;
import java.util.Date;

import com.mycompany.app.Interface.Pessoavel;
import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;
import com.mycompany.app.Model.PublicacaoContexto;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        
        Autor autorLivro1 = new Autor("George Orwell", "Britanico");
        autorLivro1.setTipoAutor(TipoAutor.Tradicional);

        Autor autorArtigo1 = new Autor("Jess", "Brasileiro");
        autorArtigo1.setTipoAutor(TipoAutor.Usuario);

        Livro livro1 = new Livro("1984", autorLivro1, "Distopia", true);

        Artigo artigo1 = new Artigo("Entendendo Compiladores", autorArtigo1, "tecnologia", true);

        Pessoavel pessoa = new Pessoa();
        pessoa.setNome("Rafael");
        

        Usuario usuario = new Usuario();
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro1);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataRetirada(new Date());
        emprestimo.setDataDevolucao(new Date());

        PublicacaoContexto contexto = new PublicacaoContexto();

        contexto.definirEstrategia(livro1);
        contexto.executarPublicacao();

        contexto.definirEstrategia(artigo1);
        contexto.executarPublicacao();
        

        
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