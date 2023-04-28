package pl.edu.agh.internetshop;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static pl.edu.agh.internetshop.util.CustomAssertions.assertBigDecimalCompareValue;

public class DiscountTest {

    private static final String NAME = "Mr. Sparkle";
    private static final BigDecimal PRICE = BigDecimal.valueOf(100);

    @Test
    public void testSingleProductNoDiscount() throws Exception{
        //given
        Product product = new Product(NAME, PRICE);

        // when

        // then
        assertBigDecimalCompareValue(product.getPrice(), PRICE);
    }

    @Test
    public void testSingleProductDiscount() throws Exception{
        //given
        Product product = new Product(NAME, PRICE);

        // when
        product.setDiscount(BigDecimal.valueOf(0.1));

        // then
        assertBigDecimalCompareValue(product.getPrice(), BigDecimal.valueOf(90));
    }

    @Test
    public void testMultipleProductsNoDiscount() throws Exception{
        //given
        Product product1 = new Product(NAME, PRICE);
        Product product2 = new Product(NAME, PRICE);
        Order order = new Order(product1, product2);

        // when

        // then
        assertBigDecimalCompareValue(order.getPrice(), BigDecimal.valueOf(200));
    }

    @Test
    public void testMultipleProductsDiscount() throws Exception{
        //given
        Product product1 = new Product(NAME, PRICE);
        Product product2 = new Product(NAME, PRICE);
        Order order = new Order(product1, product2);

        // when
        order.setDiscount(BigDecimal.valueOf(0.1));

        // then
        assertBigDecimalCompareValue(order.getPrice(), BigDecimal.valueOf(180));
    }
}
