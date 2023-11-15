package owner.tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import owner.config.WebConfig;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.baseUrl = "https://abr.ru/";
        Configuration.browser = config.getBrowser();
        System.setProperty("type", "remote");
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}
