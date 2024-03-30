package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import lombok.Getter;

public class TwitterSocialMedia implements SocialMedia{
    @Getter
    private String name = "Twitter";

    @Getter
    private String link = "https://www.twitter.com/";

    @Getter
    private SocialMediaType type = SocialMediaType.TWITTER;
}
