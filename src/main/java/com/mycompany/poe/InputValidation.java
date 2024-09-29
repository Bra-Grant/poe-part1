/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.Scanner;
import java.util.regex.Pattern;

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

    public String getRegisteredUsername(Scanner userInput) {
        while (true) {
            System.out.println("Enter your registered username:");
            String username = userInput.nextLine();
            if (checkUsername(username)) {
                System.out.println("Username is valid.");
                return username;
            } else {
                System.out.println("Invalid username.");
            }
        }
    }

    public String getRegisteredPassword(Scanner userInput) {
        while (true) {
            System.out.println("Enter your registered password:");
            String password = userInput.nextLine();
            if (checkPassword(password)) {
                System.out.println("Password is valid.");
                return password;
            } else {
                System.out.println("Invalid password.");
            }
        }
    }

    public void register(Scanner userInput) {
        String username;
        String password;

        do {
            System.out.println("Create a username (must contain an underscore and no more than 5 characters):");
            username = userInput.nextLine();
            if (checkUsername(username)) {
                System.out.println("Username is valid and captured!");
            } else {
                System.out.println("Invalid username. It must contain an underscore and be no more than 5 characters.");
            }
        } while (!checkUsername(username));

        do {
            System.out.println("Enter password (must be at least 8 characters, contain a capital letter, a number, and a special character):");
            password = userInput.nextLine();
            if (checkPassword(password)) {
                System.out.println("Password is captured!!");
            } else {
                System.out.println("Invalid password. It must contain at least 8 characters, a capital letter, a number, and a special character.");
            }
        } while (!checkPassword(password));

        String registrationMessage = registerUser(username, password);
        System.out.println(registrationMessage);
    }

    public void login(Scanner userInput, String correctUsername, String correctPassword) {
        String loginUsername;
        String loginPassword;

        while (true) {
            System.out.println("Username:");
            loginUsername = userInput.nextLine();
            System.out.println("Password:");
            loginPassword = userInput.nextLine();

            String loginMessage = returnLoginStatus(loginUsername, loginPassword, correctUsername, correctPassword);
            System.out.println(loginMessage);

            if (loginMessage.equals("Welcome!")) {
                break;
            }
        }
    }
}
 