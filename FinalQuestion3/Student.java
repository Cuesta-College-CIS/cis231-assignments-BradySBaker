package FinalQuestion3;

import java.util.ArrayList;

public class Student extends Person {

    // Member Variables
    private Integer sid;
    private Integer credits;

    private int courseCount = -1;
    private String tempCid = new String();
    private String tempCN = new String();
    private int tempScore = -1;

    ArrayList<Course> cList = new ArrayList<Course>();

    // Constructor, and Member methods if needed

    public Student(String name, String DOB, Integer s, Integer c) {
        super(name, DOB);
        sid = s;
        credits = c;
        courseCount = Question3.scnr.nextInt();
        for (int i = 0; i < courseCount; i++) {
            tempCid = Question3.scnr.next();
            tempCN = Question3.scnr.next();
            tempScore = Question3.scnr.nextInt();
            cList.add(new Course(tempCid, tempCN, tempScore));
            cList.get(i).decideGrade();
        }
    }

    @Override
    public String toString() {
        String Person = new String();
        String cListString = new String();
        for (int i = 0; i < cList.size(); i++) {
            cListString = cListString + cList.get(i).toString();
        }

        Person = super.toString() + "\r\n" + "ID:   " + sid + "   Credits:   " + credits + "\r\n" +
                cListString;
        return Person;
    }

    // Implement the inherited abstract method
    @Override
    public void printPerson() {
        System.out.println(super.toString() + "\r\n" + "ID:   " + sid + "   Credits:   " + credits);
    }
}
