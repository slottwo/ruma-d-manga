package com.mycompany.projetomangaa.usuarios;
public interface UsuarioInter {
    
    //logar
    //deslogar
    //alterar senha
    //criar conta
    //excluir conta
    
    public boolean excluirConta(String password);

    public boolean alterarSenha(String password, String newPassword);
}
