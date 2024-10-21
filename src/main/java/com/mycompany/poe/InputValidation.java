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
        InputValidation checkAll = new InputValidation();
        Scanner userInput = new Scanner(System.in);
        String username = "";
        String password = "";

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    checkAll.register(userInput);
                    username = checkAll.getRegisteredUsername(userInput);
                    password = checkAll.getRegisteredPassword(userInput);
                    break;
                case 2:
                    checkAll.login(userInput, username, password);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
