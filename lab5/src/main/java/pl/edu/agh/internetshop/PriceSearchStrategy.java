package pl.edu.agh.internetshop;

import java.math.BigDecimal;

public class PriceSearchStrategy implements SearchStrategy {

    private BigDecimal price;

    PriceSearchStrategy(BigDecimal price) {
        this.price = price;
    }
    public boolean filter(Order order) {
        return order.getPrice().equals(price);
    }
}
