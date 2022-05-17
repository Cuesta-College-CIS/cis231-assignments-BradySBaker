package FinalQuestion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {

        ArrayList<Student> slist = new ArrayList<Student>();
        Scanner scnr = new Scanner(new File(
                "C:\\Users\\kingb\\github-classroom\\Cuesta-College-CIS\\cis231-assignments-BradySBaker\\FinalQuestion3\\Input.txt"));
        return slist;

    }

    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        // More code to test the methods in each Class Object
    }

}
