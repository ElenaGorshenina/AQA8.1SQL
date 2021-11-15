package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
    private SelenideElement headingH2 = $("h2");
    private SelenideElement login = $("[data-test-id='login'] input");
    private SelenideElement password = $("[data-test-id='password'] input");
    private SelenideElement button = $("[data-test-id='action-login']");

    public AuthPage() {
        headingH2.shouldBe(Condition.visible);
    }

    public VerificationPage validLogin() {
        //      TODO DataHelper.login
//        login.setValue();
//        password.setValue();

        button.click();
        return new VerificationPage();
    }

}
