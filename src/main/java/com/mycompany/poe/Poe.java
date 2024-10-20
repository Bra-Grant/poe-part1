/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
import java.util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Poe {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        InputValidation checkAll = new InputValidation();
        Scanner userInput = new Scanner(System.in);
        String username = "";
        String password = "";

        while (true) {
            //create a menu
            String[]options = {"Register","Login","Exit"};
            int choice = JOptionPane.showOptionDialog(null,"Please choose an option:", "Main Menu",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);

            switch (choice) {
                case 1:
                    checkAll.register(userInput);
                    username = checkAll.getRegisteredUsername(userInput);
                    password = checkAll.getRegisteredPassword(userInput);
                    break;
                case 2:
                    if (checkAll.login(userInput, username, password))
                    { taskMenu();//open task menu after login
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}