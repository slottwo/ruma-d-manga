/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.account;

import java.util.HashMap;

/**
 *
 * @author slottwo
 */
public abstract class User implements UserInterface {

    // User Database
    private static HashMap<String, User> database = new HashMap<>();

    // Guest User
    private static final GuestUser guestUser = new GuestUser();

    // Logged User
    public static User loggedUser = guestUser;

    // Attributes
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) throws ExistentUserException {
        if (database.containsKey(username)) {
            throw new ExistentUserException(username);
        }

        this.username = username;
        this.password = password;

        database.put(username, this);
    }

    protected User() {
        this.username = "";
        this.password = "";
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String new_password) {
        this.password = new_password;
    }

    // Account methods
    public static User findUser(String username) {
        if (database.containsKey(username)) {
            return database.get(username);
        }
        return null;

    }

    public static boolean login(String name, String password) {
        User user = findUser(name);
        if (user != null) {
            if (user.getPassword().equalsIgnoreCase(password)) {
                loggedUser = user;
                return true;
            }
        }
        return false;
    }

    public static boolean isLogged() {
        return loggedUser != guestUser;
    }

    public static void logout() {
        loggedUser = guestUser;
    }

    // User Iterface
    @Override
    public boolean changePassword(String password, String new_password) {
        if (getPassword().equalsIgnoreCase(password)) {
            setPassword(new_password);
            return true;
        }
        return false;

    }

    @Override
    public boolean deleteAccount(String password) {
        if (getPassword().equalsIgnoreCase(password)) {
            User user = database.remove(this);
            logout();
            return true;
        }
        return false;
    }

}
