//package data;
//
//import com.github.javafaker.Faker;
//import lombok.SneakyThrows;
//import lombok.Value;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.ScalarHandler;
//import org.junit.jupiter.api.BeforeEach;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Locale;
//
//public class DataHelper {
//
//    private Faker faker;
//
//    @BeforeEach
//    void setFaker() {
//        faker = new Faker(new Locale("ru"));
//    }
//
//    @Value
//    public static class AuthInfo {
//        private String login;
//        private String password;
//    }
//
//    private String login = "app";
//    private String password = faker.internet().password();
//
////    public static AuthInfo getAuthInfo() {
////        return new AuthInfo();
////    }
//
//    @SneakyThrows
//    public void setUp() {
////        var faker = new Faker();
//        var runner = new QueryRunner();
//        String dataSQL = "INSERT INTO users(login, password) VALUES (?, ?);";
//
//        try (
//                Connection conn = DriverManager.getConnection(
//                        "jdbc:mysql://185.119.57.47:3306/app", "app", "pass"
//                );
//
//        ) {
////            String login = "app";
////            String password = faker.internet().password();
//            // обычная вставка
//            runner.update(conn, dataSQL, login, password);
//        }
//    }
//
//
//}
