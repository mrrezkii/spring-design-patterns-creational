package muhammadrezkiananda.springdesignpatternscreational.factory.method;

import lombok.Getter;

public class TiktokSocialMedia implements SocialMedia{
    @Getter
    private String name = "Tiktok";

    @Getter
    private String link = "https://www.tiktok.com/";

    @Getter
    private SocialMediaType type = SocialMediaType.TIKTOK;
}
