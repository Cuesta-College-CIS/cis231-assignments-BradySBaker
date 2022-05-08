import java.util.ArrayList;

public class Student {
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    Student(Integer id, String name, ArrayList<Course> c) {
        sid = id;
        sname = name;
        clist = c;
    }

    public String toString() {
        // Your code to print Student Object
    }

    public Integer getTotalCredits() {
        // Your code
        // to get the total credits for a student object
    }

}
