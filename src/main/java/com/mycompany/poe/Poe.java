/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class Poe {

    public static void main(String[] args) {
        
         //login instance
        InputValidation check_all = new InputValidation();
        
        // Create a Scanner 
        Scanner user_input = new Scanner(System.in);
        
        //declare variables 
        String username;
        String password;
        
         // Use a do-while loop to prompt for a valid username
        do {
            System.out.println("Create a username (must contain an underscore and no more than 5 characters):");
            username = user_input.next();
        } while (!check_all.checkUsername(username));  // Call checkUsername method
        
        // Use a do-while loop to prompt for a valid password
        do {
            System.out.println("Enter password (must be at least 8 characters, contain a capital letter, a number, and a special character):");
            password = user_input.next();
        } while (!check_all.checkPassword(password));  // Call checkPassword method
        
        // Register the user and store the result
        String registrationMessage = check_all.registerUser(username, password);
        
        // Use if-else to check registration status
        if (registrationMessage.equals("Registration successful!")) {
            System.out.println(registrationMessage);  // Registration succeeded
            
            // Proceed to login after successful registration
            System.out.println("Please log in with your username and password:");
            
            // Correct credentials for login validation
            String correctUsername = username;
            String correctPassword = password;
            String firstName = " ";  
            String lastName = " ";    
            
            // Use a do-while loop 
            boolean loginSuccess = false;  
            do {
                // Prompt for login credentials
                System.out.println("Username:");
                String loginUsername = user_input.next();
                System.out.println("Password:");
                String loginPassword = user_input.next();

                // Check login status
                String loginMessage = check_all.returnLoginStatus(loginUsername, loginPassword, correctUsername, correctPassword, firstName, lastName);

                // Use if-else to handle login success or failure
                if (loginMessage.equals("Welcome " + firstName + " " + lastName + ", it is great to see you again.")) {
                    System.out.println(loginMessage);  // Successful login
                    loginSuccess = true;  
                } else {
                    System.out.println("Username or password incorrect, please try again.");  // Failed login, retry
                }
                
            } while (!loginSuccess);  // Repeat login attempts until successful
        
        } else {
            // Registration failed, print the error message
            System.out.println(registrationMessage);
        }
        



    }
}
