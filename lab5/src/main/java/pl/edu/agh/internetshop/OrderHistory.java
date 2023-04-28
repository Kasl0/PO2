package pl.edu.agh.internetshop;

import java.util.ArrayList;
import java.util.Collection;

public class OrderHistory {
    private Collection<Order> orders;

    public OrderHistory() {
        this.orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Collection<Order> find(SearchStrategy searchStrategy) {
        Collection<Order> matchingOrders = new ArrayList<Order>();

        for(Order order : orders) {
            if(searchStrategy.filter(order)) matchingOrders.add(order);
        }
        return matchingOrders;
    }
}
