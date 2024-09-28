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
        
        // Create a Scanner object to receive user input
        Scanner user_input = new Scanner(System.in);
        
        //declare variables 
        String username;
        String password;
        
        //prompt user for username and pssword
        System.out.println("Create a username (must contain an underscore and nomore than 5 characters): ");
        username = user_input.next();
        
         System.out.println("Enter password (must be at least 8 characters, contain a capital letter, a number, and a special character):");
        password = user_input.next();

        
    }
}
