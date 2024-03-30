package muhammadrezkiananda.springdesignpatternscreational.factory.inheritance;

import muhammadrezkiananda.springdesignpatternscreational.factory.method.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testFactoryInheritance(){
        SocialMedia facebook = context.getBean("facebookSocialMedia", SocialMedia.class);
        SocialMedia twitter = context.getBean("twitterSocialMedia", SocialMedia.class);
        SocialMedia instagram = context.getBean("instagramSocialMedia", SocialMedia.class);
        SocialMedia tiktok = context.getBean("tiktokSocialMedia", SocialMedia.class);

        assertEquals("Facebook", facebook.getName());
        assertEquals("Twitter", twitter.getName());
        assertEquals("Instagram", instagram.getName());
        assertEquals("Tiktok", tiktok.getName());
    }

}