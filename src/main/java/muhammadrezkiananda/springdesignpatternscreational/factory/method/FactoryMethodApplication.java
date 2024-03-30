package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        switch (type) {
            case FACEBOOK:
                return new FacebookSocialMedia();
            case TWITTER:
                return new TwitterSocialMedia();
            case INSTAGRAM:
                return new InstagramSocialMedia();
            case TIKTOK:
                return new TiktokSocialMedia();
            default:
                throw new IllegalArgumentException("Unsupported social media type: " + type);
        }
    }
}
