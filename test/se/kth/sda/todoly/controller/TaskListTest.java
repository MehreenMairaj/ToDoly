/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.todoly.controller;

import java.io.IOException;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.sda.todoly.model.Task;

/**
 *
 * @author tmp-sda-1163
 */
public class TaskListTest {
    
    public TaskListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNewTask method, of class TaskList.
     */
    @Test
    public void testAddNewTask() throws Exception {
        System.out.println("addNewTask");
        Task t = null;
        TaskList instance = new TaskList();
        instance.addNewTask(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTask method, of class TaskList.
     */
    @Test
    public void testRemoveTask() {
        System.out.println("removeTask");
        LocalDate taskDate = null;
        String taskName = null;
        TaskList instance = new TaskList();
        instance.removeTask(taskDate,taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of findTaskByProject method, of class TaskList.
     */
    @Test
    public void testFindTaskByProject() throws IOException {
        System.out.println("findTaskByProject");
        String project = "";
        TaskList instance = new TaskList();
        instance.findTaskByProject(project);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTaskByDate method, of class TaskList.
     */
    @Test
    public void testShowTaskByDate() {
        System.out.println("showTaskByDate");
        LocalDate taskdate = null;
        TaskList instance = new TaskList();
        instance.showTaskByDate(taskdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTaskTitleByDate method, of class TaskList.
     */
    @Test
    public void testUpdateTaskTitleByDate() throws Exception {
        System.out.println("updateTaskTitleByDate");
        LocalDate taskDate = null;
        String taskName = "";
        String newTitle = "";
        TaskList instance = new TaskList();
        instance.updateTaskTitleByDate(taskDate, taskName, newTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsDone method, of class TaskList.
     */
    @Test
    public void testMarkAsDone() {
        System.out.println("markAsDone");
        LocalDate taskDate = null;
        String taskName = "";
        TaskList instance = new TaskList();
        instance.markAsDone(taskDate, taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class TaskList.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        TaskList instance = new TaskList();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFromFile method, of class TaskList.
     */
    @Test
    public void testReadFromFile() throws Exception {
        System.out.println("readFromFile");
        TaskList instance = new TaskList();
        instance.readFromFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
