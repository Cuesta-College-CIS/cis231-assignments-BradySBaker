import java.util.ArrayList;
import java.util.Scanner;

public class Quiz4 {
	public static ArrayList<Student> fillupStudent() {
		Scanner scnr = new Scanner(System.in);
		int courseCount = -1;
		int tempID = -1;
		String tempName = new String();
		ArrayList<Student> slist = new ArrayList<Student>();
		ArrayList<Course> clist1 = new ArrayList<Course>(); // John
		ArrayList<Course> clist2 = new ArrayList<Course>(); // Kurt
		ArrayList<Course> clist3 = new ArrayList<Course>(); // Kim

		tempID = scnr.nextInt(); // For John
		tempName = scnr.next();
		courseCount = scnr.nextInt();
		slist.add(new Student(tempID, tempName, clist1));
		for (int i = 0; i < courseCount; i++) {
			String tempCid = scnr.next();
			String tempCName = scnr.next();
			int tempCredit = scnr.nextInt();
			String tempGrade = scnr.next();
			clist1.add(new Course(tempCid, tempCName, tempCredit, tempGrade));
		}

		tempID = scnr.nextInt(); // For Kurt
		tempName = scnr.next();
		courseCount = scnr.nextInt();
		slist.add(new Student(tempID, tempName, clist2));
		for (int i = 0; i < courseCount; i++) {
			String tempCid = scnr.next();
			String tempCName = scnr.next();
			int tempCredit = scnr.nextInt();
			String tempGrade = scnr.next();
			clist2.add(new Course(tempCid, tempCName, tempCredit, tempGrade));
		}

		tempID = scnr.nextInt(); // For Kim
		tempName = scnr.next();
		courseCount = scnr.nextInt();
		slist.add(new Student(tempID, tempName, clist3));
		for (int i = 0; i < courseCount; i++) {
			String tempCid = scnr.next();
			String tempCName = scnr.next();
			int tempCredit = scnr.nextInt();
			String tempGrade = scnr.next();
			clist3.add(new Course(tempCid, tempCName, tempCredit, tempGrade));
		}

		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for (int i = 0; i < 3; i++) {
			System.out.println(slist.get(i).toString());
			System.out.println();
		}
	}

	public static void printStudent(ArrayList<Student> slist, Integer id) {
		System.out.println("The student who has the greatest credits: ");
		System.out.println(slist.get(id).toString());
	}

	public static Integer findStudent(ArrayList<Student> slist) {
		int max = slist.get(0).getTotalCredits();
		Integer maxIdx = 0;
		for (int i = 0; i < slist.size(); i++) {
			if (slist.get(i).getTotalCredits() >= max) {
				max = slist.get(i).getTotalCredits();
				maxIdx = i;
			}
		}
		return maxIdx;
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
