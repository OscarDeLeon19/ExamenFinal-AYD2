package org.example.refact;

/**
 * Se creo la clase User ára manejar la data del usuario
 */
public class User {

    public User() {
    }

    public String createUser(String name, String email, String phone,
                             String address, String city, String zip) {
        // Validation logic mixed with creation
        if (name == null || name.isEmpty()) {
            return "Name cannot be empty";
        }
        if (email == null || !email.contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + name;
    }
}
