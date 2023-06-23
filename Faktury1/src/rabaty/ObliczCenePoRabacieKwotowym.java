package rabaty;

public class ObliczCenePoRabacieKwotowym implements ObliczCenePoRabacie {

    private final double rabat;

    public ObliczCenePoRabacieKwotowym(double rabat) {
        this.rabat = rabat;
    }

    public double obliczCenePoRabacie(double cena) {
        return cena - rabat;
    }
}
