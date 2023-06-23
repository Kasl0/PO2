package rabaty;

public class ObliczCenePoRabacieProcentowym implements ObliczCenePoRabacie {

    private final double rabat;

    public ObliczCenePoRabacieProcentowym(double rabat) {
        this.rabat = rabat;
    }

    public double obliczCenePoRabacie(double cena) {
        return cena * (1 - rabat);
    }
}
