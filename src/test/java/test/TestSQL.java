package test;

import data.SQLUtils;
import org.junit.jupiter.api.Test;
import page.AuthPage;

import static com.codeborne.selenide.Selenide.open;

public class TestSQL {

    @Test
    void successfulAuthTest() {
        var loginPage = open("http://185.119.57.9:9999", AuthPage.class);
        var authLogin = SQLUtils.getAuthInfo();
        var authPassword = SQLUtils.getAuthInfo();
        var verificationPage = loginPage.validLogin(authLogin, authPassword);
        var verificationCode = SQLUtils.getVerificationCode();
        var cardPage = verificationPage.validVerify(verificationCode);
    }


}
