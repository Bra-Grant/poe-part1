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
    
  
    /**
     * Test of getTaskDescription method, of class Task.
     */
    //test for valid task description
    @Test
    public void testGetTaskDescription() {
        System.out.println("task successfully captured");
        Task task = new Task("Login Feature", 1,"create login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task.checkTaskDescription("create login to authenticate users"), "task successfully captured");
        
    }

    /**
     * Test of getDeveloperDetails method, of class Task.
     */
    @Test
    public void testGetDeveloperDetails() {
        System.out.println("getDeveloperDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.getDeveloperDetails();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTaskDuration method, of class Task.
     */
    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskDuration();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskStatus();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTaskDetails method, of class Task.
     */
    @Test
    public void testGetTaskDetails() {
        System.out.println("getTaskDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskDetails();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription(String taskDescription) {
        System.out.println("checkTaskDescription");
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID(String taskID) {
        System.out.println("createTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.createTaskID(taskID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTotalsHours method, of class Task.
     */
    @Test
    public void testReturnTotalsHours(int taskDuration) {
        System.out.println("returnTotalsHours");
        Task instance = null;
        int expResult = 0;
        int result = instance.returnTotalsHours(taskDuration);
        assertEquals(expResult, result);
        
    }
    
}
