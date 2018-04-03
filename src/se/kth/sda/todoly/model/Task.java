package se.kth.sda.todoly.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Task class will be used to store tasks.
 *
 * @author tmp-sda-1163 Syeda Mehreen Mairaj
 */
public class Task implements Serializable{
    // keep the track of task number 

    private int taskNo = 1;
    // The title of the task
    private String title;
    // Assign the due date for task
    private LocalDate dueDate;
    // keeps the status of task
    private boolean completed = false;
    // Type of task for e.g meeting, shopping, cleaning etc.
    private String project;
    private static int numId;
    

    /**
     * Constructor for objects of class Task.
     *
     * @param title The title of the task
     * @param dueDate The date due for the task.
     */
    public Task(String title, String dueDate, String project) {
        
        this.title = title;
        numId++;
        this.taskNo = numId;
        this.completed = false;
        this.dueDate = LocalDate.parse(dueDate);
        this.project = project;
    }

// Getters and Setters for all the attributes.
    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    // Use of built in toString method to format the strings. 
    @Override
    public String toString() {
        int index1 = getClass().toString().indexOf('.');
        return String.format("%-14s%-35s%-20s%-15s%-25s", taskNo, title, dueDate, completed, project);
    }

}
