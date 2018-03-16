
package se.kth.sda.todoly.view;



import se.kth.sda.*;
import java.util.Scanner;
import se.kth.sda.todoly.controller.TaskList;
import static se.kth.sda.todoly.util.Utilities.*;

public class UI {

    static Scanner sc = new Scanner(System.in);
    static TaskList tl = new TaskList();

    public void Welcome() {
        System.err.println("Welcome to ToDoly");
      
        
    }

    public void MainMenu() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("\nMain Menu\n===========");
        int choice = nextInt("1. Show Task List\n2. Add New Task\n3. EditTask\n0. Quit");

        switch (choice) {
            case 1:
                showTaskListMenu();
                break;
            case 2:
               //tl.addNewTask(t);
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

    public void showTaskListMenu() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("\nShow Task List Menu");
        System.out.println("=====================");
        int choice = nextInt("1. List all task \n2. List task by Project\n3. Show task by Date\n4. Main Menu\n0. Exit");
               
        switch (choice) {
            case 1:
                System.out.println("List of all tasks \n====================");
                header();
                tl.listAllTasks();
                showTaskListMenu();
                break;

            case 2: {
                System.out.print("Enter project: ");
                String project = sc.nextLine();
                while (!isName(project)) {
                    System.err.print("Invalid input! Enter correct project: ");
                    project = sc.nextLine();
                }
                tl.listTaskByProject(project);
                
                header();
                                       
                showTaskListMenu();
            }
            break;

            case 3:
               
                break;

            case 4:
               
                break;

            case 5: {
               
            }
            break;

            case 6: {
               
                
            }
           

            case 7:
               
                break;

            case 0:
                
                break;
            default:
                System.err.println("Invalid input, choose again");
                MainMenu();
        }
    }

   
}