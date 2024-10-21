/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    //declare variables
    private String taskName;
    private int taskNumber;
    private String taskDescriptioon;
    private String developersDetaisl;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    
    //constructor to initialize task details
   public Task(String taskName,int taskNumber,String taskDescription, String developersDetails,int taskDuration,String taskID, String taskStatus){
       this.taskName = taskName;
       this.taskNumber = taskNumber;
       this.taskDescription = taskDescription;
       this.developersDetaisl = developersDetails;
       this.taskDuration = taskDuration;
       this.taskID = taskID;
       this.taskStatus = taskStatus;
   }
   //getter methods to access attributes
   public String getTaskName(){
       return taskName;
   }
   
   public int getTaskNumber(){
       return taskNumber;
   }
   
   public String getTaskDescription(){
       return taskDescription;
   }
   
   public String getDeveloperDetails(){
       return developerDetails;
   }
   
   
    
    
    
}
