/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import java.util.Scanner;
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
public class InputValidationTest {

    public InputValidationTest() {
    }

    /**
     * Test of checkUsername method, of class InputValidation.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "gran_";
        InputValidation instance = new InputValidation();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPassword method, of class InputValidation.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "Pestonda1711@";
        InputValidation instance = new InputValidation();
        boolean expResult = true;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class InputValidation.
     * Make sure the expected result reflects correct handling of empty password.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "gran_";
        String password = "";  // Empty password for testing
        InputValidation instance = new InputValidation();
        String expResult = "Password cannot be empty";  // Update expected result
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnLoginStatus method, of class InputValidation.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String loginUsername = "gran_";
        String loginPassword = "Pestonda1711@";
        String correctUsername = "gran_";
        String correctPassword = "Pestonda1711@";
        InputValidation instance = new InputValidation();
        String expResult = "Welcome!";
        String result = instance.returnLoginStatus(loginUsername, loginPassword, correctUsername, correctPassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegisteredUsername method, of class InputValidation.
     * Fixed to use a non-null Scanner instance.
     */
    @Test
    public void testGetRegisteredUsername() {
        System.out.println("getRegisteredUsername");
        Scanner userInput = new Scanner("gran_");  // Simulate user input
        InputValidation instance = new InputValidation();
        String expResult = "gran_";
        String result = instance.getRegisteredUsername(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegisteredPassword method, of class InputValidation.
     * Fixed to use a non-null Scanner instance.
     */
    @Test
    public void testGetRegisteredPassword() {
        System.out.println("getRegisteredPassword");
        Scanner userInput = new Scanner("Pestonda1711@");  // Simulate user input
        InputValidation instance = new InputValidation();
        String expResult = "Pestonda1711@";
        String result = instance.getRegisteredPassword(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Test of register method, of class InputValidation.
     * Fixed to use a non-null Scanner instance.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Scanner userInput = new Scanner("gran_\nPestonda1711@");  // Simulate user input
        InputValidation instance = new InputValidation();
        instance.register(userInput);
    }

    /**
     * Test of login method, of class InputValidation.
     * Fixed to use a non-null Scanner instance.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Scanner userInput = new Scanner("gran_\nPestonda1711@");  // Simulate user input
        String correctUsername = "gran_";
        String correctPassword = "Pestonda1711@";
        InputValidation instance = new InputValidation();
        instance.login(userInput, correctUsername, correctPassword);
    }
}