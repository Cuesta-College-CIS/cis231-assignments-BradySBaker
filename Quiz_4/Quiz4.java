public class Quiz4 {
    public static ArrayList<Student> fillupStudent() {

        ArrayList<Student> slist = new ArrayList<Student>();

        // Your Code
        return slist;
    }

    public static void printStudent(ArrayList<Student> slist) {
        // Your code
    }

    public static void printStudent(ArrayList<Student> slist, Integer id) {
        // Your code
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        // Your code
    }

    public static void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);

    }

}
