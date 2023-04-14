package pl.edu.agh.to.lab4;

public class Student extends Suspect {

    private String index;

    public Student(String firstname, String lastname, String index, int age) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
