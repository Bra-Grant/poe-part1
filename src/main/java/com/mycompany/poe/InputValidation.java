/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
class InputValidation {
    
    // Check if the username is valid (contains an underscore and is no more than 5 characters)
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    
}
