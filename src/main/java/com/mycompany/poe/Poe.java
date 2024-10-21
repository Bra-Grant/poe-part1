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
                case 0: // Register
                    checkAll.register(); 
                    username = checkAll.getRegisteredUsername(); 
                    password = checkAll.getRegisteredPassword(); 
                    break;