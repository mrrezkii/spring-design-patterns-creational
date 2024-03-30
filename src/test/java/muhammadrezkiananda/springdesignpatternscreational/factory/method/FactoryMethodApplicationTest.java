package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void factoryMethod(){
        SocialMedia facebook = context.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = context.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = context.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        SocialMedia tiktok = context.getBean(SocialMedia.class, SocialMediaType.TIKTOK);

        assertEquals("Facebook", facebook.getName());
        assertEquals("Twitter", twitter.getName());
        assertEquals("Instagram", instagram.getName());
        assertEquals("Tiktok", tiktok.getName());
    }
}