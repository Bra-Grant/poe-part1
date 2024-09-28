/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
class InputValidation {
    
    // Check if the username is valid (contains an underscore and is no more than 5 characters)
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    
}
    // Check if the password meets the complexity requirements
    public boolean checkPassword(String password) {
        Pattern check_num = Pattern.compile("[0-9]");
        Pattern check_specials = Pattern.compile("[*\\-`~!@#$%&_'^]");
        Pattern check_Upper = Pattern.compile("[A-Z]");
        
        return password.length() >= 8 &&
               check_num.matcher(password).find() &&
               check_specials.matcher(password).find() &&
               check_Upper.matcher(password).find();
        
    }
        // Register the user by validating the username and password
    public String registerUser(String username, String password) {
        if (!checkUsername(username)) {
            return "Username is not correctly formatted.";
        }

        if (!checkPassword(password)) {
            return "Password does not meet the complexity requirements.";
        }

        return "Registration successful!";
    }
    
    // Check login status and return an appropriate message
    public String returnLoginStatus(String loginUsername, String loginPassword, 
                                    String correctUsername, String correctPassword,
                                    String firstName, String lastName) {
        if (loginUsername.equals(correctUsername) && loginPassword.equals(correctPassword)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
}
}

