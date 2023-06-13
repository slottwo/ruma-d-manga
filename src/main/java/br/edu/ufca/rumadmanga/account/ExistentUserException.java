/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.account;

/**
 *
 * @author slottwo
 */
public class ExistentUserException extends Exception {

    public ExistentUserException(String username) {
        super("Error: " + username + " already exists.", null);
    }
    
}
