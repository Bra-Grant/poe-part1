/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class InputValidation {

    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword(String password) {
        Pattern checkNum = Pattern.compile("[0123456789]");
        Pattern checkSpecials = Pattern.compile("[*-.`~!@#$%&_'^]");
        Pattern checkUpper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        return password.length() >= 8 
            && checkNum.matcher(password).find() 
            && checkSpecials.matcher(password).find() 
            && checkUpper.matcher(password).find();
    }

    public String registerUser(String username, String password) {
        return "Registration successful!";
    }

    public String returnLoginStatus(String loginUsername, String loginPassword, String correctUsername, String correctPassword) {
        if (loginUsername.equals(correctUsername) && loginPassword.equals(correctPassword)) {
            return "Welcome!";
        } else {
            return "Username or password incorrect.";
        }
    }

    // Method to handle registration
    public void register() {
        String username;
        String password;
        
// Prompt for username
        do {
            username = JOptionPane.showInputDialog(null, "Create a username (must contain an underscore and no more than 5 characters):");
            if (checkUsername(username)) {
                JOptionPane.showMessageDialog(null, "Username is valid and captured!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username. It must contain an underscore and be no more than 5 characters.");
            }
        } while (!checkUsername(username));
        
//prompt for password
do {
            password = JOptionPane.showInputDialog(null, "Enter password (must be at least 8 characters, contain a capital letter, a number, and a special character):");
            if (checkPassword(password)) {
                JOptionPane.showMessageDialog(null, "Password is captured!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid password. It must contain at least 8 characters, a capital letter, a number, and a special character.");
            }
        } while (!checkPassword(password));

 String registrationMessage = registerUser(username, password);
        JOptionPane.showMessageDialog(null, registrationMessage);
    }
    
// Method to handle login
    public void login(String correctUsername, String correctPassword) {
        String loginUsername;
        String loginPassword;
        