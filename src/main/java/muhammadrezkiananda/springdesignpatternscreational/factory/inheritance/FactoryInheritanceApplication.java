package muhammadrezkiananda.springdesignpatternscreational.factory.inheritance;

import muhammadrezkiananda.springdesignpatternscreational.factory.method.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia facebookSocialMedia() {
        return new FacebookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia twitterSocialMedia() {
        return new TwitterSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia instagramSocialMedia() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia tiktokSocialMedia() {
        return new TiktokSocialMedia();
    }

}
