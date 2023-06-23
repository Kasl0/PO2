package dokumenty;

import java.util.Iterator;

public class WydrukFakturySkrocony extends WydrukFaktury {
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("FA z dnia: "+faktura.getDataSprzedazy().toString());
        System.out.println("Wystawiona dla: "+faktura.getKontrahent());
    }

    public void drukujPozycje(Faktura faktura) {
        Iterator<Pozycja> iteratorPozycji=faktura.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja=iteratorPozycji.next();
            System.out.println("Towar: "+ pozycja.getIlosc() + " " + pozycja.getNazwa() + " o wartosci: " + pozycja.getWartosc());
        }
    }

    public void drukujStopke(Faktura faktura) {
        System.out.println("Suma: " + faktura.getSuma());
    }
}
