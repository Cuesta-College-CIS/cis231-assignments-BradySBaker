package Quiz_4;

public class Course {
    String cid;
    String cname;
    Integer credit;
    String grade;

    Course(String id, String name, Integer c, String g) {
        cid = id;
        cname = name;
        credit = c;
        grade = g;
    }

    public String toString() {
        String course = new String();
        course = "    " + cid + " " + cname + " " + credit + " " + grade + "\r\n";

        return course;
    }

    public Integer getCredit() {
        return credit;
    }

}
