package com.mycompany.projetomangaa.usuarios;

public class Visitante extends Usuario {

    public Visitante() {
        super();
    }

    @Override
    public boolean alterarSenha(String password, String newPassword) {
        return false;
    }

    @Override
    public boolean excluirConta(String password) {
        return false;
    }
}
