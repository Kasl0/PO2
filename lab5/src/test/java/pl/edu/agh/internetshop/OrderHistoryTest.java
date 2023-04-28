package pl.edu.agh.internetshop;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

import static pl.edu.agh.internetshop.util.CustomAssertions.assertBigDecimalCompareValue;

public class OrderHistoryTest {

    private static final String NAME1 = "Mr. Sparkle";
    private static final String NAME2 = "Mr. Darkle";
    private static final BigDecimal PRICE = BigDecimal.valueOf(100);
    private static final BigDecimal PRICE2 = BigDecimal.valueOf(12);

    @Test
    public void testNameSearchStrategy() throws Exception{
        //given
        Product product1 = new Product(NAME1, PRICE);
        Order order1 = new Order(product1);
        Product product2 = new Product(NAME2, PRICE);
        Order order2 = new Order(product2);
        OrderHistory orderHistory = new OrderHistory();

        // when
        orderHistory.addOrder(order1);
        orderHistory.addOrder(order2);

        // then
        Collection<Order> expectedOrders = new ArrayList<Order>();
        expectedOrders.add(order2);
        assertEquals(orderHistory.find(new NameSearchStrategy(NAME2)), expectedOrders);

    }

    @Test
    public void testPriceSearchStrategy() throws Exception{
        //given
        Product product1 = new Product(NAME1, PRICE);
        Order order1 = new Order(product1);
        Product product2 = new Product(NAME2, PRICE2);
        Order order2 = new Order(product2);
        OrderHistory orderHistory = new OrderHistory();

        // when
        orderHistory.addOrder(order1);
        orderHistory.addOrder(order2);

        // then
        Collection<Order> expectedOrders = new ArrayList<Order>();
        expectedOrders.add(order1);
        assertEquals(orderHistory.find(new PriceSearchStrategy(PRICE)), expectedOrders);

    }

    @Test
    public void testSurnameSearchStrategy() throws Exception{
        //given
        Product product1 = new Product(NAME1, PRICE);
        Order order1 = new Order(product1);
        Address sender = new Address("Nowak", "Nowakowska 1", "33-211", "Nowakowice");
        Address recipient = new Address("Kowalski", "Kowalska 1", "23-211", "Januszowice");
        Shipment shipment = new Shipment(sender, recipient);
        order1.setShipment(shipment);
        Product product2 = new Product(NAME2, PRICE2);
        Order order2 = new Order(product2);
        OrderHistory orderHistory = new OrderHistory();

        // when
        orderHistory.addOrder(order1);
        orderHistory.addOrder(order2);

        // then
        Collection<Order> expectedOrders = new ArrayList<Order>();
        expectedOrders.add(order1);
        assertEquals(orderHistory.find(new SurnameSearchStrategy("Kowalski")), expectedOrders);

    }

    @Test
    public void testCompositeSearchStrategy() throws Exception {
        //given
        Product product1 = new Product(NAME1, PRICE);
        Order order1 = new Order(product1);
        Product product2 = new Product(NAME2, PRICE2);
        Order order2 = new Order(product2);
        OrderHistory orderHistory = new OrderHistory();

        // when
        orderHistory.addOrder(order1);
        orderHistory.addOrder(order2);

        // then
        Collection<Order> expectedOrders = new ArrayList<Order>();
        expectedOrders.add(order2);
        assertEquals(orderHistory.find(new CompositeSearchStrategy(new NameSearchStrategy(NAME2), new PriceSearchStrategy(PRICE2))), expectedOrders);
    }
}
