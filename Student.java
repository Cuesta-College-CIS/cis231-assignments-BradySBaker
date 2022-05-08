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
        String list = new String();
        String course = new String();
        for (int i = 0; i < clist.size(); i++) {
            course = course + "    Course: " + clist.get(i).toString();
        }
        list = "Student: " + sid + " " + sname + "\r\n" + course + "\r\n" + "\r\n" + "Total Credits: "
                + getTotalCredits(); // r\n creates new line
        return list;
    }

    public Integer getTotalCredits() {
        Integer tc = 0;
        for (int i = 0; i < clist.size(); i++) {
            tc = tc + clist.get(i).getCredit();
        }
        return tc;
    }

}