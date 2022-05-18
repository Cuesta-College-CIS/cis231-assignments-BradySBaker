package FinalQuestion3;

public class Course implements CourseActivity {
    // Class Properties
    private String cid;
    private String coursename;
    private Integer score;
    private String grade;
    String n = new String();
    String d = new String();

    // Member Methods
    public Course(String c, String cN, Integer s) {
        cid = c;
        coursename = cN;
        score = s;
    }

    // Implement the inherited methods from the interface
    @Override
    public void decideGrade() {
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else {
            grade = "C";
        }
    }

    @Override
    public String toString() {
        String Courses = new String();
        Courses = "Course ID:   " + cid + "   Name:   " + coursename + "   Score:   " + score + "   Grade:   " + grade;
        return Courses;
    }

    @Override
    public void printCourseinfo() {
        System.out.println(
                "Course ID:   " + cid + "   Name:   " + coursename + "   Score:   " + score + "   Grade:   " + grade);
    }

}
