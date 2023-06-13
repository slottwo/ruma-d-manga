/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.account;

/**
 *
 * @author slottwo
 */
public class GuestUser extends User {
    GuestUser() {
        super();
    }
    
    @Override
    public boolean changePassword(String password, String new_password) {
        return false;
    }
    
    @Override
    public boolean deleteAccount(String password) {
        return false;
    }
}
