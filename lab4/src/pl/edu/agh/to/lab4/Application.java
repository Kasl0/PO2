package pl.edu.agh.to.lab4;

public class Application {

    public static void main(String[] args) {
        Finder suspects = new Finder(new PersonDataProvider(), new PrisonersDataProvider(), new StudentDataProvider());
        //suspects.display(new NameSearchStrategy("Janusz"));
        //suspects.display(new AgeSearchStrategy(30));
        suspects.display(new CompositeSearchStrategy(new NameSearchStrategy("Janusz"), new AgeSearchStrategy(30)));
    }
}
