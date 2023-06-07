package com.mycompany.projetomangaa.usuarios;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario implements UsuarioInter {

    private String name;
    private String password;

    private static final Visitante usuarioVisitante = new Visitante();
    private static List<Usuario> usuariosU = new ArrayList<>();

    public static Usuario usuarioLogado = usuarioVisitante;

    // criar conta
    public Usuario(String name, String password) {
        this.name = name;
        this.password = password;
        usuariosU.add(this);
    }

    public Usuario() {
        this.name = "";
        this.password = "";
    }

    public static Usuario buscarUsuario(String name) {
        for (Usuario usuario : usuariosU) {
            if (usuario.getName().equalsIgnoreCase(name)) {
                return usuario;
            }
        }
        return null;
    }

    public static boolean login(String name, String password) {
        Usuario usuario = buscarUsuario(name);
        if (usuario != null) {
            if (usuario.getPassword().equalsIgnoreCase(password)) {
                usuarioLogado = usuario;
                return true;
            }
        }
        return false;
    }

    public static boolean isLogged() {
        return usuarioLogado != usuarioVisitante;
    }

    public static void logout() {
        usuarioLogado = usuarioVisitante;
    }

    @Override
    public boolean excluirConta(String password) {

        if (this.getPassword().equalsIgnoreCase(password)) {
            usuariosU.remove(this);
            usuarioLogado = usuarioVisitante;
            return true;
        }
        return false;
    }

    @Override
    public boolean alterarSenha(String password, String newPassword) {
        if (this.getPassword().equalsIgnoreCase(password)) {
            setPassword(newPassword);
            return true;
        } else {
            System.out.println("senha incorreta");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public static Usuario getVisistante() {
        return usuarioVisitante;
    }
}
