package se.kth.sda.todoly.controller;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import se.kth.sda.todoly.model.Task;

/**
 * This class will be used to store and manage the list of task.
 *
 * @author tmp-sda-1163 Syeda Mehreen
 */
public class TaskList implements Serializable {
    // Arraylist to manage list of tasks.

    private static ArrayList<Task> taskList = new ArrayList<>();

    /**
     * This method will add new task.
     *
     * @param t task to add.
     */
    public void addNewTask(Task t) throws IOException {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
            taskList.add(t);
            pw.println(t);
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void removeTask(LocalDate taskDate, String taskName) {
        int temp = 0;
        int i = 0;
        // Checking if task exists then remove it
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
            for (Task task : taskList) {
                if (taskDate.isEqual(task.getDueDate()) && taskName.equalsIgnoreCase(task.getTitle())) {
                    temp = i;
                    taskList.remove(temp);
                }
                i++;
               pw.println(task);
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the task by project
     *
     * @param project the project of task we are looking for.
     *
     */
    public void findTaskByProject(String project) throws IOException {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));

            for (Task task : taskList) {
                if (project.equalsIgnoreCase(task.getProject())) {
                    System.out.println(task.toString());
                }
                pw.println(task);
            }
            pw.close();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the task by due date
     *
     * @param date is to provide to show all the tasks due on this date.
     */
    public void showTaskByDate(LocalDate taskdate) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/ouputTodoLy.txt"));
            for (Task task : taskList) {
                if (taskdate.isEqual(task.getDueDate())) {
                    System.out.println(task.toString());
                }
                pw.println(task);
            }
            pw.close();System.out.println("Task not found on the given date!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /* Editing Task title by providing due date, Old title and new Titlte in the file.
     * 
     */
    public void updateTaskTitleByDate(LocalDate taskDate, String taskName, String newTitle) throws IOException {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
            for (Task task : taskList) {
                if (taskDate.isEqual(task.getDueDate()) && taskName.equalsIgnoreCase(task.getTitle())) {
                    task.setTitle(newTitle);
                    System.out.println(task.toString());
                }
                pw.println(task);
                System.out.println("Task title updated sucessfully!");
            }
            pw.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method marks the task as done!
     *
     * @param taskDate date of the task
     * @param taskName name of the task
     */
    public void markAsDone(LocalDate taskDate, String taskName) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));

            for (Task task : taskList) {
                if (taskDate.isEqual(task.getDueDate()) && taskName.equalsIgnoreCase(task.getTitle())) {
                    task.setCompleted(true);
                    System.out.println(task.toString());
                }
                pw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void save() throws IOException {

        try {
            
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
        
                for (Task task : taskList) {
                    outputStream.println(task);
                }
         
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() throws IOException {
        
        try {
            
           BufferedReader inputStream = new BufferedReader(new FileReader("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("/Users/tmp-sda-1163/Desktop/outputTodoLy.txt"));
            String str;
            while ((str = inputStream.readLine()) != null) {
                for (Task task : taskList) {
                    System.out.println(task);
//                    outputStream.println(task);
                }
            }
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }

    }

}
