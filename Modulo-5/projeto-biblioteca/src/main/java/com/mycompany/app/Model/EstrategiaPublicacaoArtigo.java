package com.mycompany.app.Model;
import com.mycompany.app.Interface.PublicavelInterface;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface {
    
    private Artigo artigo;

    public EstrategiaPublicacaoArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
    

    @Override
    public void publicar() {
        System.out.println("Artigo: " + artigo.getTitulo() +  " - Autor: " + artigo.getAutor().getNome() +  " - Autor do Tipo: " + artigo.getAutor().getTipoAutor() + " - Gênero: " + artigo.getGenero() + " - Disponível: " + artigo.isPublicado());
    }
}
