package FinalQuestion3;

import java.util.ArrayList;

public class Student extends Person {

    // Member Variables
    private Integer sid;
    private Integer credits;
    ArrayList<Course> cList = new ArrayList<Course>();
    // Constructor, and Member methods if needed

    public Student(String name, String DOB, Integer s, Integer c) {
        super(name, DOB);
        sid = s;
        credits = c;
    }

    @Override
    public String toString() {
        String Person = new String();
        Person = super.toString() + "\r\n" + "ID:   " + sid + "   Credits:   " + credits;
        return Person;
    }

    // Implement the inherited abstract method
    @Override
    public void printPerson() {
        System.out.println(super.toString() + "\r\n" + "ID:   " + sid + "   Credits:   " + credits);
    }
}
