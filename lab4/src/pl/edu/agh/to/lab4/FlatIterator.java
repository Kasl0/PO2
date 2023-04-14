package pl.edu.agh.to.lab4;

import java.util.*;

public class FlatIterator implements Iterator<Suspect> {

    private Iterator<Collection<Prisoner>> collectionIterator;
    private Iterator<Prisoner> prisonerIterator;

    public FlatIterator(Map<String, Collection<Prisoner>> prisonersMap) {
        collectionIterator = prisonersMap.values().iterator();
        prisonerIterator = Collections.emptyIterator();
    }

    public boolean hasNext() {
        while (!prisonerIterator.hasNext() && collectionIterator.hasNext()) {
            prisonerIterator = collectionIterator.next().iterator();
        }
        return prisonerIterator.hasNext();
    }

    public Suspect next() {
        return prisonerIterator.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}
