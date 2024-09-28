/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class InputValidation {

    // Method to check if the username is valid
    public boolean checkUsername(String username) {
        // Check if username contains an underscore and is no more than 5 characters long
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username is valid and captured!");
            return true;  // Username is valid
        } else {
            System.out.println("Invalid username. It must contain an underscore and be no more than 5 characters.");
            return false;  // Username is invalid
        }
    }

    // Method to check if the password is valid
    public boolean checkPassword(String password) {
        // Add logic to validate the password based on the conditions you specified
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*].*");
        boolean isLongEnough = password.length() >= 8;

        // Check if all conditions are met
        if (hasUpperCase && hasDigit && hasSpecialChar && isLongEnough) {
            System.out.println("Password is captured!");
            return true;  // Password is valid
        } else {
            System.out.println("Invalid password. It must contain at least 8 characters, a capital letter, a number, and a special character.");
            return false;  // Password is invalid
        }
    }

    // Method to handle registration logic
    public String registerUser(String username, String password) {
        return "Registration successful!";
    }

    // Method to handle login validation logic
    public String returnLoginStatus(String loginUsername, String loginPassword, String correctUsername, String correctPassword, String firstName, String lastName) {
        if (loginUsername.equals(correctUsername) && loginPassword.equals(correctPassword)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect.";
        }
    }
}

