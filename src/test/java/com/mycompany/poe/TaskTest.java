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
    public void testValidTaskDescription() {
        System.out.println("task successfully captured");
        Task task = new Task("Login Feature", 1,"create login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task.checkTaskDescription("create login to authenticate users"), "task successfully captured");
        
    }
    //test for invalid task description
    @Test
    public void testInvalidTaskDescription() {
        System.out.println("please enter a task description of less than 50 characters");
        Task task = new Task("Login Feature", 1,"Develop a login feature to securely authenticate user identities and control access to the system", "Robyn Harrison", 8, "To Do");
        assertFalse(task.checkTaskDescription("Develop a login feature to securely authenticate user identities and control access to the system"), "please enter a task description of less than 50 characters");
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    
    //test for task id
    @Test
    public void testCreateTaskID(String taskID) {
        Task task = new Task("login feature", 1, "create login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertEquals("LO:1:SON", task.createTaskID());
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
    
   

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescription = "";
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID_String() {
        System.out.println("createTaskID");
        String taskID = "";
        Task instance = null;
        String expResult = "";
        String result = instance.createTaskID(taskID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalsHours method, of class Task.
     */
    @Test
    public void testReturnTotalsHours() {
        System.out.println("returnTotalsHours");
        int taskDuration = 0;
        Task instance = null;
        int expResult = 0;
        int result = instance.returnTotalsHours(taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID_0args() {
        System.out.println("createTaskID");
        Task instance = null;
        Object expResult = null;
        Object result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
