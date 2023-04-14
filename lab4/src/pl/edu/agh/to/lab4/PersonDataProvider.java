package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDataProvider implements SuspectAggregate {

    private final Collection<CracowCitizen> cracowCitizens = new ArrayList<CracowCitizen>();

    public PersonDataProvider() {
        cracowCitizens.add(new CracowCitizen("Jan", "Kowalski", 30));
        cracowCitizens.add(new CracowCitizen("Janusz", "Krakowski", 30));
        cracowCitizens.add(new CracowCitizen("Janusz", "Mlodociany", 10));
        cracowCitizens.add(new CracowCitizen("Kasia", "Kosinska", 19));
        cracowCitizens.add(new CracowCitizen("Piotr", "Zgredek", 29));
        cracowCitizens.add(new CracowCitizen("Tomek", "Gimbus", 14));
        cracowCitizens.add(new CracowCitizen("Janusz", "Gimbus", 15));
        cracowCitizens.add(new CracowCitizen("Alicja", "Zaczarowana", 22));
        cracowCitizens.add(new CracowCitizen("Janusz", "Programista", 77));
        cracowCitizens.add(new CracowCitizen("Pawel", "Pawlowicz", 32));
        cracowCitizens.add(new CracowCitizen("Krzysztof", "Mendel", 30));
    }

    public Collection<CracowCitizen> getAllCracowCitizens() {
        return cracowCitizens;
    }

    public Iterator<Suspect> iterator() {
        return new Iterator<Suspect>() {

            private Iterator<CracowCitizen> cracowCitizenIterator = cracowCitizens.iterator();
            public boolean hasNext() {
                return cracowCitizenIterator.hasNext();
            }

            public Suspect next() {
                return cracowCitizenIterator.next();
            }

            public void remove() {
                cracowCitizenIterator.remove();
            }
        };
    }
}
