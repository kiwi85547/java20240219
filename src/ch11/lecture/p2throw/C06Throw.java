package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C06Throw {

    // 두 개 이상의 throw 발생시
    public static void method1() throws SQLException, ClassNotFoundException {
        boolean b1 = true;
        boolean b2 = true;

        if (b1) {
            throw new ClassNotFoundException();
        }
        if (b2) {
            throw new SQLException();
        }

    }
}
