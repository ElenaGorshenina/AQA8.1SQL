package test;

import data.SQLUtils;
import org.junit.jupiter.api.Test;
import page.AuthPage;

import static com.codeborne.selenide.Selenide.open;

public class TestSQL {

    @Test
    void successfulAuthTest() {
        var loginPage = open("jdbc:mysql://185.119.57.47:3306/app", AuthPage.class);
        var authLogin = SQLUtils.getLogin();
        var authPassword = SQLUtils.getPassword();
        var verificationPage = loginPage.validLogin(authLogin, authPassword);
        var verificationCode = SQLUtils.getVerificationCode();
        var cardPage = verificationPage.validVerify(verificationCode);
    }


}
