package com.mycompany.app;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("George Orwell");
        autor.setNacionalidade("Britânico");

        Livro livro = new Livro();
        livro.setTitulo("1984");
        livro.setAutor(autor);
        livro.setGenero("Distopia");
        livro.invalidarDisponibilidade();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rafael");

        Usuario usuario = new Usuario();
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataRetirada(new Date());
        emprestimo.setDataDevolucao(new Date());
        


        System.out.println("Disponível: " + livro.validarDisponibilidade());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + pessoa.getNome());
        System.out.println("Idade: " + usuario.getIdade() + " anos");
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