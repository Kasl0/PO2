package pl.edu.agh.to.lab4;

public abstract class Suspect {
    protected String firstname;
    protected String lastname;

    protected int age;

    public String getName() {
        return firstname;
    }

    public String getSurname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean canBeAccused() {
        return age >= 18;
    }

    public String display() {
        return firstname + " " + lastname + " " + getAge();
    }
}
