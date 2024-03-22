package muhammadrezkiananda.springdesignpatternscreational.builder;

import org.junit.jupiter.api.Test;

class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
                .setId("1")
                .setName("Product 1")
                .setPrice(1_000_000L)
                .build();

        System.out.println(product);
    }

}