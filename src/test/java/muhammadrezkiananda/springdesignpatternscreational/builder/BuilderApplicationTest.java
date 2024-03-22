package muhammadrezkiananda.springdesignpatternscreational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testBuilder() {
        Product product = context.getBean("productGadget", Product.class);
        product.setId("1");
        product.setName("Product 1");

        System.out.println(product);
    }

}