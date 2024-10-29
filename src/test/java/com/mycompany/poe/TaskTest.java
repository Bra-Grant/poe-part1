/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {

    
@Test
    public void checkTaskDescription() {
        Task task1 = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        Task task2 = new Task("Add Task Feature", 2, "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");

        // Test with a valid description
        assertTrue(task1.checkTaskDescription("Valid description")); // Expect true
        assertTrue(task2.checkTaskDescription("Valid description")); // Expect true

        // Test with an empty description
        assertFalse(task1.checkTaskDescription("")); // Expect false
        assertFalse(task2.checkTaskDescription("")); // Expect false

        // Test with a description longer than 50 characters
        String longDescription1 = "This description is definitely more than fifty characters long and should return false.";
        assertFalse(task1.checkTaskDescription(longDescription1)); // Expect false
        String longDescription2 = "This description is definitely more than fifty characters long and should return false.";
        assertFalse(task2.checkTaskDescription(longDescription2)); // Expect false
    }

    @Test
public void createTaskID() {
    Task task1 = new Task("A", 2, "Valid task description", "Mit", 123, "To Do");
    String expected1 = "A:MIT";  
    String actual1 = task1.createTaskID("");

    Task task2 = new Task("B", 3, "Valid task description", "Cit", 456, "Doing");
    String expected2 = "B:CIT:3"; 
    String actual2 = task2.createTaskID("");

    assertEquals(expected1, actual1);
    assertEquals(expected2, actual2);
}

    @Test
public void printTaskDetails() {
    Task task1 = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
    Task task2 = new Task("Add Task Feature", 2, "Create Add Task feature to add task users", "Michael Smith", 10, "Doing");

    // Capturing output to verify correctness
    String expectedOutput1 = task1.getTaskDetails(); 
    String expectedOutput2 = task2.getTaskDetails();

    
  

    
}

    @Test
    public void returnTotalHours() {
        // Create multiple tasks with varying durations
        new Task("Task 1", 0, "First Task", "Dev A", 10, "To Do");
        new Task("Task 2", 1, "Second Task", "Dev B", 12, "Doing");
        new Task("Task 3", 2, "Third Task", "Dev C", 55, "Done");
        new Task("Task 4", 3, "Fourth Task", "Dev D", 11, "To Do");
        new Task("Task 5", 4, "Fifth Task", "Dev E", 1, "Doing");

        int totalHours = Task.returnTotalHours();
        assertEquals(89, totalHours, "Total hours should be correctly accumulated to 89.");

        // Clear and add additional data to test
        Task.clearTaskDurations();
        new Task("Task 1", 0, "Task 1 description", "Dev F", 10, "To Do");
        new Task("Task 2", 1, "Task 2 description", "Dev G", 12, "Doing");

        totalHours = Task.returnTotalHours();
        assertEquals(22, totalHours, "Total hours should be correctly accumulated to 22.");
    }