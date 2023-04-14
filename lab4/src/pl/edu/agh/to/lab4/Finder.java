package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Finder {

    CompositeAggregate compositeAggregate;

    public Finder(PersonDataProvider personDataProvider, PrisonersDataProvider prisonersDataProvider, StudentDataProvider studentDataProvider) {
        compositeAggregate = new CompositeAggregate();
        compositeAggregate.addSuspectAggregate(prisonersDataProvider);
        compositeAggregate.addSuspectAggregate(personDataProvider);
        compositeAggregate.addSuspectAggregate(studentDataProvider);
    }

    public Collection<Suspect> display(SearchStrategy searchStrategy) {

        Collection<Suspect> suspected = new ArrayList<Suspect>();

        int suspectedSize = 0;

        Iterator<Suspect> iterator = compositeAggregate.iterator();

        while(iterator.hasNext()) {

            Suspect suspect = iterator.next();

            if (suspect.canBeAccused() && searchStrategy.filter(suspect)) {
                suspected.add(suspect);
                suspectedSize++;
            }
            if (suspectedSize >= 10) break;
        }

        System.out.println("Znalazlem " + suspectedSize + " pasujacych podejrzanych!");

        for (Suspect suspect: suspected) {
            System.out.println(suspect.display());
        }

        return suspected;
    }
}
