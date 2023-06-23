package main;

import dokumenty.WydrukFaktury;
import dokumenty.WydrukFakturySkrocony;
import rabaty.LosowyRabatAdapter;
import rabaty.ObliczCenePoRabacie;

public class Konfiguracja {

    private static Konfiguracja instance;

    protected Konfiguracja() {
    }

    public static Konfiguracja getInstance() {
        if (instance == null) {
            instance = new Konfiguracja();
        }
        return instance;
    }

    public ObliczCenePoRabacie getObliczanieRabatu() {
        return new LosowyRabatAdapter();
    }

    public WydrukFaktury getWydrukFaktury() {
        return new WydrukFakturySkrocony();
    }
}
