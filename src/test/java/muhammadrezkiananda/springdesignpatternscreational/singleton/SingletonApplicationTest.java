package muhammadrezkiananda.springdesignpatternscreational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testSingleton() {
        Counter counter1 = context.getBean(Counter.class);
        Counter counter2 = context.getBean(Counter.class);
        counter1.increment();
        counter2.increment();
        assertEquals(counter1.getValue(), counter2.getValue());
    }

    private void incrementCounterAsync(Counter counter, int times) {
        new Thread(() -> {
            for (int i = 0; i < times; i++) {
                counter.increment();
            }
        }).start();
    }

    @Test
    void incrementRaceCondition() throws InterruptedException {
        Counter counter1 = context.getBean(Counter.class);
        Counter counter2 = context.getBean(Counter.class);

        incrementCounterAsync(counter1, 1000000);
        incrementCounterAsync(counter2, 1000000);

        Thread.sleep(5000);
        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());

        assertEquals(counter1.getValue(), counter2.getValue());
    }

}