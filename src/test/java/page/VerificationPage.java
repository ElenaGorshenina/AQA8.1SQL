package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.SQLUtils;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $("[data-test-id=code] input");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeField.shouldBe(Condition.visible);
    }

    public CardPage validVerify(SQLUtils.VerificationCode getVerificationCode) {
        codeField.setValue(getVerificationCode.getCode());
        verifyButton.click();
        return new CardPage();
    }
}
