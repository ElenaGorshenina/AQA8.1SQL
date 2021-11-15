package test;

import com.github.javafaker.Faker;
import data.DataHelper;
import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.AuthPage;

import java.sql.DriverManager;

import static com.codeborne.selenide.Selenide.open;

public class TestSQL {

    @Test
    void successfulAuthTest() {
        var loginPage = open("jdbc:mysql://185.119.57.47:3306/app", AuthPage.class);

    }


}
