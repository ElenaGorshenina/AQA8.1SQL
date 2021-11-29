package data;

import lombok.Value;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLUtils {

    private SQLUtils() {
    }

    private static Connection getConn() {
        try {
            return DriverManager.getConnection("jdbc:mysql://185.119.57.9:3306/app", "app", "9mREsvXDs9Gk89E1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static AuthLogin getLogin() {
        var users = "SELECT users FROM login ORDER BY created DESC LIMIT 1";
        var runner = new QueryRunner();
        try (var conn = getConn()) {
            var login = runner.query(conn, users, new ScalarHandler<String>());
            return new AuthLogin(login);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Value
    public static class AuthLogin {
        private String login;
    }

    public static AuthPassword getPassword() {
        var users = "SELECT users FROM password ORDER BY created DESC LIMIT 1";
        var runner = new QueryRunner();
        try (var conn = getConn()) {
            var password = runner.query(conn, users, new ScalarHandler<String>());
            return new AuthPassword(password);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Value
    public static class AuthPassword {
        private String password;
    }

    public static VerificationCode getVerificationCode() {
        var codeSQL = "SELECT code FROM auth_codes ORDER BY created DESC LIMIT 1";
        var runner = new QueryRunner();
        try (var conn = getConn()) {
            var code = runner.query(conn, codeSQL, new ScalarHandler<String>());
            return new VerificationCode(code);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

}