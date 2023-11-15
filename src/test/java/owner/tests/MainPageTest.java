package owner.tests;

import org.junit.jupiter.api.Test;
import owner.pages.MainPage;

import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest extends TestBase{
    MainPage main = new MainPage();
    @Test
    void testMainPage(){
        main.openPage("");
        assertEquals("АО «АБ «РОССИЯ»", title());
    }
}
