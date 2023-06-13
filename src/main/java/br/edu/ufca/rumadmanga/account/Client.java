/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.account;

import br.edu.ufca.rumadmanga.manga.library.Library;
import java.util.HashMap;

/**
 *
 * @author slottwo
 */
public class Client extends User {

    // Personal manga bookmarks
    private Library bookmarks;

    // Constructor
    public Client(String username, String password) throws ExistentUserException {
        super(username, password);
        bookmarks = new Library();
    }

    public Library getLibrary() {
        return bookmarks;
    }
    
}
