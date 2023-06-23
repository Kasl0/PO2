package kategorie;

import java.util.ArrayList;

public abstract class Kategoria {

    protected Kategoria() {

    }

    protected String nazwa;
    private ArrayList<Kategoria> towary;

    public void add(Kategoria kategoria) {
        towary.add(kategoria);
    }

    public void remove(Kategoria kategoria) {
        towary.remove(kategoria);
    }

    public ArrayList<Kategoria> getChildren() {
        return towary;
    }

    public String getNazwa() {
        return nazwa;
    }

}
