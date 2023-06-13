/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ufca.rumadmanga.account;

/**
 *
 * @author slottwo
 */
public interface UserInterface {
    
    public boolean changePassword(String password, String new_password);
    
    public boolean deleteAccount(String password);
    
}
