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

    // Personal manga library
    private Library library;

    // User Database
    private static HashMap<String, Client> clients = new HashMap<>();

    // Constructor
    public Client(String username, String password) throws ExistentUserException {
        super(username, password);
        if (clients.containsKey(username)) {
            User.findUser(username).deleteAccount(password);
            throw new ExistentUserException(username);
        }
        clients.put(username, this);
        library = new Library();
    }

    @Override
    public boolean deleteAccount(String password) {
        if (super.deleteAccount(password)) {
            clients.remove(getUsername());
            return true;
        }
        return false;
    }

    public Library getLibrary() {
        return library;
    }

}
