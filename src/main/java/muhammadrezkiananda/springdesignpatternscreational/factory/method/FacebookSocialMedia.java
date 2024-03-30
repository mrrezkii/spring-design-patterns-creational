package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import lombok.Getter;

public class FacebookSocialMedia implements SocialMedia{
    @Getter
    private String name = "Facebook";

    @Getter
    private String link = "https://www.facebook.com/";

    @Getter
    private SocialMediaType type = SocialMediaType.FACEBOOK;
}
