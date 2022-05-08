import java.util.ArrayList;

public class Student {
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    public Student(Integer id, String name, ArrayList<Course> c) {
        sid = id;
        sname = name;
        clist = c;
    }

    public String toString() {
        String list = new String();
        list = clist.toString();
        return list;
    }

    public Integer getTotalCredits() {
        Integer tC = 0;
        return tC;
    }

}
