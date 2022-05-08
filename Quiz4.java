import java.util.ArrayList;

public class Quiz4 {
	public static ArrayList<Student> fillupStudent() {
		ArrayList<Student> slist = new ArrayList<Student>();
		ArrayList<Course> clist1 = new ArrayList<Course>();
		clist1.add(new Course("CIS01", "C++", 3, "A+")); // For John
		clist1.add(new Course("CIS02", "Python", 3, "A0"));
		clist1.add(new Course("CIS231", "Java", 3, "A+"));
		slist.add(new Student(1001, "John", clist1));
		ArrayList<Course> clist2 = new ArrayList<Course>();
		clist2.add(new Course("CIS01", "C++", 3, "A0")); // for Kurt
		clist2.add(new Course("CIS02", "Python", 3, "A0"));
		clist2.add(new Course("CIS231", "Java2", 3, "A+"));
		clist2.add(new Course("CNT02", "Cisco", 3, "A0"));
		slist.add(new Student(1001, "Kurt", clist1));
		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		// Your code
	}

	public static void printStudent(ArrayList<Student> slist, Integer id) {
		// Your code
	}

	public static Integer findStudent(ArrayList<Student> slist) {
		return 0;
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
