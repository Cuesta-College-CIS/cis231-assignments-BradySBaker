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

    @Override
    public String toString() {
        String Courses = new String();
        // Fix toString
        return Courses;
    }

    // Implement the inherited methods from the interface
    @Override
    public void decideGrade() {
        // Fix

    }

    @Override
    public void printCourseinfo() {
        // Fix

    }

}
