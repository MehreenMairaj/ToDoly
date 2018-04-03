package se.kth.sda.todoly.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.io.*;
import java.lang.*;
import java.util.Formatter;
import java.util.Scanner;
import se.kth.sda.todoly.model.Task;
import se.kth.sda.todoly.controller.TaskList;

public class Utilities {

    static private Scanner sc = new Scanner(System.in);
    TaskList t = new TaskList();
    public static int nextInt(String s) {
        System.out.println(s);
        int num = 0;
        try {
            num = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            //System.err.println("Wrong input!");    
            num = nextInt("Enter number: ");
        }
        return num;
    }

    public static double nextDouble(String s) {
        System.out.println(s);
        double num = 0;
        try {
            num = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            //System.err.println("Wrong input!");    
            num = nextDouble("Enter number: ");
        }
        return num;
    }

    public static boolean isName(String name) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuwxyz ";
        for (int i = 0; i < name.length(); i++) {
            boolean isWord = false;
            for (int j = 0; j < alfabet.length(); j++) {
                if (name.charAt(i) == alfabet.charAt(j)) {
                    isWord = true;
                }
            }
            if (!isWord) {
                return false;
            }
        }
        return true;
    }

//    public static void createFile() {
//        
//        String fileName = "TodoLy.txt";
//        final Formatter x;
//        try {
//            FileWriter fw = new FileWriter(fileName);
//            Writer output = new BufferedWriter(fw);
//            for (Task list : TaskList) {
//                
//            }
//            System.out.println("You created a file");
//        } catch (Exception e) {
//            System.out.println("Error occoured");
//        }
//        //Writing on file
//        x.format("%s%s%s\n", "20 ","Mehreen ","Mairaj");
//        x.format("%s%s%s\n", "30 ","Summaiya ","Wahab");
//        x.format("%s%s%s\n", "40 ","Madiha ","Arsalan");
//        
//        //closing file, its immportant.
//        x.close();
//
//    }

    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }

    public static void header() {
        System.out.println("TASK NO          TITLE                            DUE DATE         COMPLETED         Project  ");
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
