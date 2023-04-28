package pl.edu.agh.internetshop;

public class NameSearchStrategy implements SearchStrategy {
    private String name;

    NameSearchStrategy(String name) {
        this.name = name;
    }
    public boolean filter(Order order) {
        for (Product product : order.getProducts()) {
            if (product.getName().equals(name)) return true;
        }
        return false;
    }
}
