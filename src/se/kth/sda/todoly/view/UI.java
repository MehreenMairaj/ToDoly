package se.kth.sda.todoly.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import se.kth.sda.*;
import java.util.Scanner;
import se.kth.sda.todoly.controller.TaskList;
import se.kth.sda.todoly.model.Task;
import static se.kth.sda.todoly.util.Utilities.*;

public class UI {

    static Scanner sc = new Scanner(System.in);
    static TaskList tasklist = new TaskList();

    public void Welcome() {
        System.err.println(">> Welcome to ToDoly");

    }

    public void MainMenu() throws InterruptedException, IOException{
        Thread.sleep(400);
        System.out.println("\n >> Pick an option : \n===========");
        int choice = nextInt(">> (1) Show Task List \n>> (2) Add New Task\n>> (3) EditTask\n>> (4) Save\n>> (0)Quit");

        switch (choice) {
            case 1:
                showTaskListMenu();
                break;
            case 2:
                

                System.out.print("Task Title: ");
                String title = sc.nextLine();
                while (!isName(title)) {
                    System.err.print("Invalid input! Enter title again: ");
                    title = sc.nextLine();
                }
                System.out.print("Enter due date for task: (yyyy-mm-dd)");
                String dueDate = sc.nextLine();
                System.out.print("Enter project: ");
                String project = sc.nextLine();
                while (!isName(project)) {
                    System.err.print("Invalid input! Enter project again: ");
                   project  = sc.nextLine();
                }
                Task t = new Task(title,dueDate,project);
                tasklist.addNewTask(t);
//                tasklist.save("/Users/tmp-sda-1163/Desktop/TodoLy.txt");
                header();
                System.out.println(t);
                MainMenu();
                break;
                
            case 3:
                editTaskMenu();
                break;
            case 4:
             tasklist.save();
                System.out.println("To do list has been saved");
                MainMenu();
                break;
            case 0:
                System.exit(0);
                break;
            default: {
                System.err.println("Invalid input, choose again");
                MainMenu();
            }
        }
    }

    public void showTaskListMenu() throws InterruptedException, IOException {
        Thread.sleep(400);
        System.out.println("\nShow Task List Menu");
        System.out.println("=====================");
        int choice = nextInt(">> (1) List all task \n>> (2) List task by Project\n>> (3) Show task by Date\n>> (4) Main Menu\n>> (0) Exit");

        switch (choice) {
            case 1:
                System.out.println("List of all tasks \n====================");
                header();

                tasklist.readFromFile();
                showTaskListMenu();
                break;

            case 2: // show task by project
                System.out.print("Enter project: ");
                String project = sc.nextLine();
  //             if (tasklist.findTaskByProject(project)== null) {
//                    System.out.println("Project not found!");
//                } else 
                    header();
                    tasklist.findTaskByProject(project);
                
                showTaskListMenu();

                break;

            case 3: // show task by date
                System.out.print("Enter date to view tasks on that day (yyyy-mm-dd):");
                String dateCheck = sc.nextLine();
                while (!isValidFormat("yyyy-mm-dd", dateCheck)) {
                    System.err.print("Invalid input! Enter correct date: ");
                    dateCheck = sc.nextLine();
                }
                header();
                tasklist.showTaskByDate(LocalDate.parse(dateCheck));
                showTaskListMenu();
                break;

            case 4:
                MainMenu();
                break;

            case 0: {
                System.exit(0);
            }
            break;
            default:
                System.err.println("Invalid input, choose again");
                MainMenu();
        }
    }
    
    public void editTaskMenu() throws InterruptedException, IOException {
        Thread.sleep(400);
        System.out.println("\nEdit Task Menu");
        System.out.println("=====================");
        int choice = nextInt(">> (1) Update task title by due date \n>> (2) Mark as done \n>> (3) Remove task\n>> (4) Main Menu\n>> (0) Exit");

        switch (choice) { 
            case 1:{
                System.out.print("Enter date: (yyyy-mm-dd) ");
                String dueDate = sc.nextLine();
                System.out.print("Enter old task title:");
                String title = sc.nextLine();
                System.out.print("Enter new title: ");
                String newTitle = sc.nextLine();
                header();
                tasklist.updateTaskTitleByDate(LocalDate.parse(dueDate), title, newTitle);
               
                editTaskMenu();
            break;
            }
            case 2:{
                System.out.print("Enter date: (yyyy-mm-dd) ");
                String dueDate = sc.nextLine();
                System.out.print("Enter task title:");
                String title = sc.nextLine();
                header();
                tasklist.markAsDone(LocalDate.parse(dueDate), title);
                System.out.println("Task has marked done!");
                editTaskMenu();
            break;
            }
            case 3:{
            break;
            }
            case 4:{
                MainMenu();
            break;
            }
            case 0:{
                System.exit(0);
            }
            break;
            default:
                 System.err.println("Invalid input, choose again");
                MainMenu();
            }
            
        }
    
}
