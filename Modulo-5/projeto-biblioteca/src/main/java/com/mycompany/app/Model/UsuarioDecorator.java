package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

 class UsuarioDecorator implements PublicavelInterface {

    private PublicavelInterface usuario;

    public UsuarioDecorator(PublicavelInterface usuario) {

        this.usuario = usuario;

    }

    public void publicar() {

        usuario.publicar();
        // Para concluír o módulo 5, utilizei uma nova classe para determinar como a publicação deve ser realizada: PublicaçãoContexto.java
        System.out.println("Publicando como usuário...");

    }
}