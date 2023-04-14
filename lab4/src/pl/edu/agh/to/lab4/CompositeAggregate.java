package pl.edu.agh.to.lab4;

import java.util.*;

public class CompositeAggregate implements SuspectAggregate {

    private Collection<SuspectAggregate> suspectAggregateCollection;

    public CompositeAggregate() {
        suspectAggregateCollection = new ArrayList<SuspectAggregate>();
    }

    public void addSuspectAggregate(SuspectAggregate suspectAggregate) {
        suspectAggregateCollection.add(suspectAggregate);
    }

    public void removeSuspectAggregate(SuspectAggregate suspectAggregate) {
        suspectAggregateCollection.remove(suspectAggregate);
    }

    public Iterator<Suspect> iterator() {

        return new Iterator<Suspect>() {

            private Iterator<SuspectAggregate> suspectAggregateIterator = suspectAggregateCollection.iterator();
            private Iterator<Suspect> suspectIterator = Collections.emptyIterator();

            public boolean hasNext() {
                while (!suspectIterator.hasNext() && suspectAggregateIterator.hasNext()) {
                    suspectIterator = suspectAggregateIterator.next().iterator();
                }
                return suspectIterator.hasNext();
            }

            public Suspect next() {
                return suspectIterator.next();
            }

            public void remove() {
                throw new UnsupportedOperationException("Remove operation is not supported.");
            }
        };
    }
}
