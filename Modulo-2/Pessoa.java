package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;


public class Pessoa {
    public Pessoa() {
  
}
    protected String nome;
    protected List<Livro> livros = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
