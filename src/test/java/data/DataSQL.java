package data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;
import page.AuthPage;
import page.VerificationPage;

import java.sql.DriverManager;
import lombok.Value;

public class DataSQL {
//    @Test
//    @SneakyThrows
//    void code() {
//        //var countSQL = "SELECT COUNT(*) FROM users;";
//        var codeSQL = "SELECT code FROM auth_codes WHERE login = dataHelper.login";
//        var runner = new QueryRunner();
//
//        try (
//                var conn = DriverManager.getConnection(
//                        "jdbc:mysql://localhost:3306/app", "app", "pass"
//                );
//        ) {
//            var count = runner.query(conn, codeSQL, new ScalarHandler<>());
////            System.out.println(count);
////            var first = runner.query(conn, usersSQL, new BeanHandler<>(User.class));
////            System.out.println(first);
////            var all = runner.query(conn, usersSQL, new BeanListHandler<>(User.class));
////            System.out.println(all);
//        }
//    }
//
//    @Value
//    public static class VerificationCode{
//        private String code;
//    }
//    public static VerificationCode getCode(AuthPage authPage) {
//        return new VerificationCode(count);
//    }

}
