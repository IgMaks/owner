package owner.pages;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openPage(String pageUrl){
        open(pageUrl);
        return this;
    }
}
