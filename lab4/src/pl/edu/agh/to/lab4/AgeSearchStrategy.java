package pl.edu.agh.to.lab4;

public class AgeSearchStrategy implements SearchStrategy {

    private int age;

    AgeSearchStrategy(int age) {
        this.age = age;
    }
    public boolean filter(Suspect suspect) {
        return suspect.getAge() == age;
    }
}
