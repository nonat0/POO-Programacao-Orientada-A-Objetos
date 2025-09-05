package com.mycompany.app.Model;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.Interface.Pessoavel;


public class Pessoa implements Pessoavel {
    public Pessoa() {
  
}
    protected String nome;
    protected List<Livro> livros = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
    return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
