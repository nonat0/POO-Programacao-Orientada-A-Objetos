package com.mycompany.app.Model;
import com.mycompany.app.Interface.PublicavelInterface;

public class EstrategiaPublicacaoLivro implements PublicavelInterface {

    private Livro livro1;

    public EstrategiaPublicacaoLivro(Livro livro) {
        this.livro1 = livro; 
    }

    @Override
    public void publicar() {
        System.out.println("Livro: " + livro1.getTitulo() + " - Gênero: " + livro1.getGenero() + " -  Autor: " + livro1.getAutor().getNome() + " - Autor do tipo: " + livro1.getAutor().getTipoAutor() + " - Disponível: " + livro1.validarDisponibilidade());
    }
}
