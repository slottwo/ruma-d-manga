package user;

import java.util.HashMap;

public abstract class User {

    // User Database

    private static HashMap<String, User> database = new HashMap<>();

    // Attributes

    private String username;
    private String password;

    // Constructor

    public User(String username, String password) throws Exception {
        if (database.containsKey(username)) {
            throw new Exception("Error: " + username + " already exists.", null);
        }

        this.username = username;
        this.password = password;

        database.put(username, this);
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

    public void setPassword(String check_password, String new_password) {
        if (this.password.equals(check_password)) {
            this.password = new_password;
        }
    }
}
