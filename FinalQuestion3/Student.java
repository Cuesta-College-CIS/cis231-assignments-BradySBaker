package FinalQuestion3;

import java.util.ArrayList;

public class Student extends Person {

    // Member Variables
    private Integer sid;
    private Integer credits;
    private String name;
    private String DOB;
    ArrayList<Course> cList = new ArrayList<Course>();
    // Constructor, and Member methods if needed

    // fix public Student( , Integer s, Integer c){
    // fix sid = s;
    // fix credits = c;
    // }

    @Override
    public String toString() {
        String Person = new String();
        // Fix
        return Person;
    }

    // Implement the inherited abstract method
    @Override
    public void printPerson() {
        // fix
        // print the brief information for the student
    }
}
