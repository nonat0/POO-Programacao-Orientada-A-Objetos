package com.mycompany.app.Model;

public class Livro extends Publicacao {
 
    private String genero;
    private boolean disponivel = true;
                      
    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        super(titulo, autor);
        this.genero = genero;
        this.disponivel = true;
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

    @Override
    public void validarPublicacao(){
        //lógica específica de validação para livro
        System.out.println("Validando publicação de Livro...");
    }

}
