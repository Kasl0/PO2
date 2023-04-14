package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CompositeSearchStrategy implements SearchStrategy {

    Collection<SearchStrategy> searchStrategies;

    CompositeSearchStrategy(SearchStrategy... searchStrategies) {

        this.searchStrategies = new ArrayList<SearchStrategy>();
        this.searchStrategies.addAll(Arrays.asList(searchStrategies));
    }
    public boolean filter(Suspect suspect) {

        for (SearchStrategy searchStrategy: searchStrategies) {
            if(!searchStrategy.filter(suspect)) return false;
        }
        return true;
    }
}
