package com.mycompany.app.Model;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.Interface.AutorInterface;

public class Usuario extends Pessoa implements AutorInterface {
    public Usuario() {

    }

    private int idade;
    protected List<Emprestimo> historicoEmprestimos = new ArrayList<>();

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo e) {
        historicoEmprestimos.add(e);
    }

    @Override
    public void publicar(){
        System.out.println("Usuário publicando...");
    }
}