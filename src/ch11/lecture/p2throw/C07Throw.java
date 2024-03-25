package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C07Throw {
    public static void main(String[] args) throws Exception { // 상위 타입으로 적어도 됨
        method1();
    }

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
