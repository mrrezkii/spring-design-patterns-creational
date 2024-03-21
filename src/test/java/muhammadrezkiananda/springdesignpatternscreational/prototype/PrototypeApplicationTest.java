package muhammadrezkiananda.springdesignpatternscreational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testPrototype() {
        Employee eko = context.getBean("employeeStaff", Employee.class);
        eko.setName("Eko");

        Employee joko = context.getBean("employeeManager", Employee.class);
        joko.setName("Joko");

        Employee budi = context.getBean("employeeVicePresident", Employee.class);
        budi.setName("Budi");

        Employee rudi = context.getBean("employeeCLevel", Employee.class);
        rudi.setName("Rudi");

        System.out.println(eko);
        System.out.println(joko);
        System.out.println(budi);
        System.out.println(rudi);
    }
}