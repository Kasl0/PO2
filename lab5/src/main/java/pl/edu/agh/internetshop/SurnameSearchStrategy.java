package pl.edu.agh.internetshop;

public class SurnameSearchStrategy implements SearchStrategy {
    private String surname;

    SurnameSearchStrategy(String surname) {
        this.surname = surname;
    }
    public boolean filter(Order order) {
        Shipment shipment = order.getShipment();
        if(shipment == null) return false;
        return shipment.getRecipientAddress().getName().equals(surname);
    }
}
