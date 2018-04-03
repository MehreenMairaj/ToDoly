/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.todoly.startup;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import se.kth.sda.todoly.controller.TaskList;
import se.kth.sda.todoly.model.Task;
import se.kth.sda.todoly.view.UI;

/**
 *
 * @author tmp-sda-1163
 */
public class Main {

    static TaskList tasklist = new TaskList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException  {
        // TODO code application logic here
//
//        tasklist.addNewTask(new Task("Meeting", "2018-04-03", "MeetUp"));
//        tasklist.addNewTask(new Task("Groccery", "2018-04-03", "Shopping"));
//        tasklist.addNewTask(new Task("Programming", "2018-04-03", "Job"));
        UI menu = new UI();

        menu.Welcome();
        menu.MainMenu();
    }

}
