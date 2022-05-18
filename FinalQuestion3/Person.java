package FinalQuestion3;

public abstract class Person {
    // Member Variables
    private String name;
    private String DOB;

    // Constructor, and Member methods if needed
    public Person(String n, String d) {
        name = n;
        DOB = d;
    }

    @Override
    public String toString() {
        String Person = new String();
        Person = "Name:   " + name + "   DOB:   " + DOB;
        return Person;
    }

    // Abstract Method PrintPerson() ;
    public abstract void printPerson();
}
