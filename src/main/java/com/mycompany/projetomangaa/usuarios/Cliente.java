package com.mycompany.projetomangaa.usuarios;

import java.util.ArrayList;
import java.util.List;
import biblioteca.*;

public class Cliente extends Usuario{
    private Biblioteca biblioteca;

    private static List<Usuario> usuariosC = new ArrayList<>();

    public Cliente(String name, String password){
        super(name, password);
        usuariosC.add(this);
        biblioteca = new Biblioteca();
    }

    @Override
    public boolean excluirConta(String password){
        if(super.excluirConta(password)){
            usuariosC.remove(this);
            return true;
        }
        return false;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    
}
