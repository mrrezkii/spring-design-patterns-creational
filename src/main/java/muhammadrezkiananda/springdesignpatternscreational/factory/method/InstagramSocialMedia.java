package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import lombok.Getter;

public class InstagramSocialMedia implements SocialMedia{
    @Getter
    private String name = "Instagram";

    @Getter
    private String link = "https://www.instagram.com/";

    @Getter
    private SocialMediaType type = SocialMediaType.INSTAGRAM;
}
