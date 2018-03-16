package se.kth.sda.todoly.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import se.kth.sda.todoly.model.Task;

/**
 * This class will be used to store and manage the list of task.
 *
 * @author tmp-sda-1163 Syeda Mehreen
 */
public class TaskList {
    // Arraylist to manage list of tasks.

    private static ArrayList<Task> taskList = new ArrayList<>();
    private boolean isTask = false;
    /** This method will add new task.
     * 
     * @param t task to add.
     */
     
    public void addNewTask(Task t) {
        taskList.add(t);
    }

    public void removeTask(int taskNo) {

        int temp = 0;
        int i = 0;
        // Checking if task exists then remove it
        for (Task task : taskList) {
            if (taskNo == task.getTaskNo()) {
                temp = i;
                isTask = true;
                System.out.println("Task has been removed!");
            }
            i++;

        }
        taskList.remove(temp);

        // If task doesnot exists prints message
        if (!isTask) {
            System.err.println("Task not found!");
        }
    }

    // Print all the task
    public void listAllTasks() {
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }

    
    /** 
     * Shows the task by project
     * @param project the project of task we are looking for.
     * 
    */
    public void listTaskByProject(String project) {
        boolean foundProject = false;

        // Checking if task exists then print it
        for (Task task : taskList) {
            if (project.equals(task.getProject())) {
                System.out.println(task.toString());
                foundProject = true;
                
            }
        }
        // If task doesnot exists prints message
        if (!foundProject) {
            System.out.println("Task not found in such project!");
        }
    }

    /** 
     * Shows the task by due date
     * 
     * @param date is to provide to show all the tasks due on this date.
     */
     
    public void showTaskByDate(LocalDate date) {
        for (Task task : taskList) {
            if(date == task.getDueDate()){
                System.out.println(task.toString());
                 isTask = true;
            }
        }
        if (!isTask) {
            System.out.println("Task not found for the date provided!");
        }
    }
    
    
    /** 
     * Editing Task title by providing task number
     * 
     * @param taskNo is to provide in order to find the task by number
     * @param newTitle the new title 
     */
    public void updateTaskTitleByTaskNo(int taskNo, String newTitle) {
                 
        for (Task task : taskList) {
            if (taskNo == task.getTaskNo()) { 
                task.setTitle(newTitle);
                System.out.println("Task Number: " + task.getTaskNo() + " changed the title to " + newTitle);              
             // header();                
                System.out.println(task.toString());
                isTask = true;
            }
        }
         if (!isTask) {
            System.out.println("Task not found!");
        }
    }
    
    
    /* Editing Task title by providing due date, Old title and new Titlte
     * 
     */
    public void updateTaskTitleByDate(LocalDate taskDate,String taskName, String newTitle) {
                 
        for (Task task : taskList) {
            if (taskDate == task.getDueDate() && taskName.equals(task.getTitle())) { 
                task.setTitle(newTitle);
                System.out.println("Task Date: " + task.getDueDate() +" Old Task Title " + task.getTitle() +" changed the title to " + newTitle);              
             // header();                
                System.out.println(task.toString());
                isTask = true;
            }
        }
         if (!isTask) {
            System.out.println("Task not found!");
        }
    }
     
    /**
     * This method marks the task as done!
     * @param taskDate date of the task
     * @param taskName name of the task
     */
    public void markAsDone(LocalDate taskDate, String taskName){
        
    for (Task task : taskList) {
            if (taskDate == task.getDueDate() && taskName.equals(task.getTitle())) { 
                task.setCompleted(true);
                System.out.println("Found task has been marked as done!");
                System.out.println(task.toString());
                isTask = true;
            }
        }
         if (!isTask) {
            System.out.println("Task not found!");
        }
    }
     
}
