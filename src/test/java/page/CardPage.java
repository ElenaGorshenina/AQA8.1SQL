package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CardPage {
    private SelenideElement headingH1 = $("h1");

    public CardPage() {
        headingH1.shouldBe(Condition.visible);
    }
}
