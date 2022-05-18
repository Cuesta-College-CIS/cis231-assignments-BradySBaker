package FinalQuestion3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static final Scanner scnr = new Scanner(System.in);

    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
        int tempSid = -1;
        int tempCredits = -1;
        int studentCount = scnr.nextInt(); // Note requires students number to be listed in input before anything else
        String tempDOB = new String();
        String tempName = new String();

        ArrayList<Student> slist = new ArrayList<Student>();

        for (int i = 0; i < studentCount; i++) {
            tempSid = scnr.nextInt();
            tempName = scnr.next();
            tempCredits = scnr.nextInt();
            tempDOB = scnr.next();

            slist.add(new Student(tempName, tempDOB, tempSid, tempCredits));
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
    }

}
