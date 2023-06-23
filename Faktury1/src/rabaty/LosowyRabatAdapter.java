package rabaty;

import rabatlosowy.LosowyRabat;

public class LosowyRabatAdapter implements ObliczCenePoRabacie {

    public double obliczCenePoRabacie(double cena) {
        return new ObliczCenePoRabacieProcentowym(new LosowyRabat().losujRabat()).obliczCenePoRabacie(cena);
    }
}
