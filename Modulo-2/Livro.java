package com.mycompany.app;

public class Livro {
    public Livro() {
    
    }

    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;
                      
    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

     public Autor getAutor() {
        return autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean validarDisponibilidade() {
        return disponivel;
    }

    public boolean invalidarDisponibilidade() {
        return disponivel = false;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
