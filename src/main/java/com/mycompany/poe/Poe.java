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
                    
                case 1: // Login
                    if (checkAll.login(username, password)) { 
                        taskMenu(); // Open task menu after login
                    }
                    break;
                    
                    case 2: // Exit
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }
    
// Placeholder for task menu
    private static void taskMenu() {
        String[] options = {"Add Task", "View Tasks", "Exit Task Menu"};
        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Task Menu", "Task Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            
switch (choice) {
                case 0:
                    addTask();
                    break;
                case 1:
                    viewTasks();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Exiting Task Menu...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }
    }

// Method to add tasks
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

            // Task status options (To Do, Doing, Done)
            String[] statusOptions = {"To Do", "Doing", "Done"};
            int statusChoice = JOptionPane.showOptionDialog(null, "Select task status:", "Task Status",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions, statusOptions[0]);

            String taskStatus = statusOptions[statusChoice];
            
// Create a new task and add it to the list
            Task newTask = new Task(taskName, i + 1, taskDescription, developerName, taskDuration, taskID, taskStatus);
            tasks.add(newTask);

            JOptionPane.showMessageDialog(null, "Task successfully added!");
        }
    }
    
    // Method to view tasks
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
        } else {
            StringBuilder taskList = new StringBuilder();
            for (Task task : tasks) {
                taskList.append("Task ID: ").append(task.getTaskID()).append("\n")
                        .append("Task Name: ").append(task.getTaskName()).append("\n")
                        .append("Task Description: ").append(task.getTaskDescription()).append("\n")
                        .append("Developer Name: ").append(task.getDeveloperName()).append("\n")
                        .append("Task Duration: ").append(task.getTaskDuration()).append(" hours\n")
                        .append("Task Status: ").append(task.getTaskStatus()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, taskList.toString());
        }
    }
}