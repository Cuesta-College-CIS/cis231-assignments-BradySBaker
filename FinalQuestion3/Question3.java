package FinalQuestion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(
                "C:\\Users\\kingb\\github-classroom\\Cuesta-College-CIS\\cis231-assignments-BradySBaker\\FinalQuestion3\\Input.txt"));

        int tempSid = -1;
        int tempCredits = -1;
        int studentCount = 3;
        String tempDOB = new String();
        String tempName = new String();

        int courseCount = -1;
        String tempCid = new String();
        String tempCN = new String();
        int tempScore = -1;

        ArrayList<Student> slist = new ArrayList<Student>();

        for (int i = 0; i < studentCount; i++) {
            ArrayList<Course> clist = new ArrayList<Course>();
            tempSid = scnr.nextInt();
            tempName = scnr.next();
            tempCredits = scnr.nextInt();
            tempDOB = scnr.next();
            courseCount = scnr.nextInt();

            slist.add(new Student(tempName, tempDOB, tempSid, tempCredits));

            for (int j = 0; j < courseCount; j++) {
                tempCid = scnr.next();
                tempCN = scnr.next();
                tempScore = scnr.nextInt();
                clist.add(new Course(tempCid, tempCN, tempScore));
            }
        }

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
