package owner.config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${type}.properties",
})

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("version")
    @DefaultValue("113")
    String getBrowserVersion();
    @Key("remote")
    String getRemoteUrl();
}
