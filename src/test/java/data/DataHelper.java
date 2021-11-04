package data;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.BeforeEach;

import java.sql.DriverManager;

public class DataHelper {

    @BeforeEach
    @SneakyThrows
    void setUp() {
        var faker = new Faker();
        var runner = new QueryRunner();
        var dataSQL = "INSERT INTO users(login, password) VALUES (?, ?);";

        try (
                var conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/app", "app", "pass"
                );

        ) {
            // обычная вставка
            runner.update(conn, dataSQL, faker.name().username(), "pass");
            //runner.update(conn, dataSQL, faker.name().username(), "pass");
        }
    }
}
