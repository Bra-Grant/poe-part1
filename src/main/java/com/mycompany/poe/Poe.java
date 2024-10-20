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
                   JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }
     private static void addTask() {
        String numTasksStr = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks = Integer.parseInt(numTasksStr);
        
        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name:");

            String taskDescription = JOptionPane.showInputDialog("Enter task description (Max 50 characters):");

         // Validate task description length
            while (taskDescription.length() > 50) {
                taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters:");
            }
            String developerName = JOptionPane.showInputDialog("Enter developer name:");

            String taskDurationStr = JOptionPane.showInputDialog("Enter task duration (in hours):");
            int taskDuration = Integer.parseInt(taskDurationStr);
            
             // Generate Task ID (first two letters of task name and developer name)
            String taskID = taskName.substring(0, 2).toUpperCase() + developerName.substring(0, 2).toUpperCase();

            // Task status options (To Do, Doing, Done) using JOptionPane
            String[] statusOptions = {"To Do", "Doing", "Done"};
            int statusChoice = JOptionPane.showOptionDialog(null, "Select task status:", "Task Status",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions, statusOptions[0]);

            String taskStatus = statusOptions[statusChoice];
        }