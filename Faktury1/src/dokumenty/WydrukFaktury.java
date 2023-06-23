package dokumenty;

import java.util.Iterator;

public class WydrukFaktury {

    public void drukujFakture(Faktura faktura)
    {
        drukujNaglowek(faktura);
        drukujPozycje(faktura);
        drukujStopke(faktura);
    }

    public void drukujNaglowek(Faktura faktura) {
        System.out.println("=====================================================");
        System.out.println("FA z dnia: "+faktura.getDataSprzedazy().toString());
        System.out.println("Wystawiona dla: "+faktura.getKontrahent());
    }

    public void drukujPozycje(Faktura faktura) {
        Iterator<Pozycja> iteratorPozycji=faktura.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja=iteratorPozycji.next();
            System.out.println("Towar: "+pozycja.getNazwa()+" Ilosc: "+pozycja.getIlosc()+" Wartosc: " + pozycja.getWartosc());
        }
    }

    public void drukujStopke(Faktura faktura) {
        System.out.println("Suma: " + faktura.getSuma());
        System.out.println("=====================================================");
    }
}
