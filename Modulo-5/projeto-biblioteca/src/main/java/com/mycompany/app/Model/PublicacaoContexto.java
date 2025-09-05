package com.mycompany.app.Model;
import com.mycompany.app.Interface.PublicavelInterface;

public class PublicacaoContexto {
    private PublicavelInterface estrategia;

    public void definirEstrategia(Object publicacao) {
        if (publicacao instanceof Livro) {
            this.estrategia = new EstrategiaPublicacaoLivro((Livro) publicacao);
        } else if (publicacao instanceof Artigo) {
            this.estrategia = new EstrategiaPublicacaoArtigo((Artigo) publicacao);
        } else {
            throw new IllegalArgumentException("Tipo de publicação não suportado.");
        }
    }

    public void executarPublicacao() {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de publicação não definida.");
        }
        estrategia.publicar();
    }
}