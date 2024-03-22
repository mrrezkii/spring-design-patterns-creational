package muhammadrezkiananda.springdesignpatternscreational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productGadget(){
        return Product.builder()
                .category(Category.GADGET)
                .price(10000000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion(){
        return Product.builder()
                .category(Category.FASHION)
                .price(200000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productElectronic(){
        return Product.builder()
                .category(Category.ELECTRONIC)
                .price(500000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFood(){
        return Product.builder()
                .category(Category.FOOD)
                .price(5000L)
                .build();
    }


}
