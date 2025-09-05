package com.mycompany.app.Model;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.Interface.PublicavelInterface;
import com.mycompany.app.TipoAutor;

public class Autor extends Pessoa implements PublicavelInterface {

    public Autor() {
    
    }

    public void publicar() {

        System.out.println("Publicando como autor...");

    }

    private String nacionalidade;
    private List<Livro> obrasPublicadas = new ArrayList<>();
    private TipoAutor tipoAutor;


    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setObrasPublicadas(List<Livro> obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public TipoAutor getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(TipoAutor tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override 
    public void setNome(String nome) {
        super.setNome(nome);
    }
}