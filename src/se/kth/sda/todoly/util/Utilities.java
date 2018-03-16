
package se.kth.sda.todoly.util;



import java.time.LocalDate;
import java.util.Scanner;

public class Utilities {

    static private Scanner sc = new Scanner(System.in);

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

    public static String isDate() {
        String dob = null;
        System.out.print("Enter due date for task (yyyy-mm-dd):");
        LocalDate l = null;
        try {
            dob = sc.nextLine();
            l = LocalDate.parse(dob);
        } catch (Exception e) {
            System.err.println("Invalid date format, input as yyyy-mm-dd");
            dob = isDate();
        }
        return dob;
    }
    
    public static void header(){
        System.out.println("TASK NO     TITLE                   DUE DATE         COMPLETED");
        System.out.println("--------------------------------------------------------------");
    }
}