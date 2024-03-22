package muhammadrezkiananda.springdesignpatternscreational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilder() {
        Product product = Product.builder()
                .id("1")
                .name("Product 1")
                .price(1_000_000L)
                .build();

        System.out.println(product);
    }

}